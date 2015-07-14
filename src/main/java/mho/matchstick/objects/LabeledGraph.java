package mho.matchstick.objects;

import mho.wheels.structures.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static mho.wheels.iterables.IterableUtils.*;
import static org.junit.Assert.*;

public final class LabeledGraph<T extends Comparable<T>> {
    private static final @NotNull Comparator<Pair<Integer, Integer>> EDGE_COMPARATOR = new Pair.PairComparator<>(
            Integer::compare,
            Integer::compare
    );
    private @NotNull List<T> nodes;
    private @NotNull Map<T, Integer> indexMap;
    private @NotNull List<Pair<Integer, Integer>> edges;

    private LabeledGraph(
            @NotNull List<T> nodes,
            @NotNull Map<T, Integer> indexMap,
            @NotNull List<Pair<Integer, Integer>> edges
    ) {
        this.nodes = nodes;
        this.indexMap = indexMap;
        this.edges = edges;
    }

    public static @NotNull <T extends Comparable<T>> LabeledGraph of(
            @NotNull List<T> nodes,
            @NotNull List<Pair<Integer, Integer>> edges
    ) {
        if (any(n -> n == null, nodes)) {
            throw new NullPointerException();
        }
        if (!unique(nodes)) {
            throw new IllegalArgumentException();
        }
        int order = nodes.size();
        for (Pair<Integer, Integer> edge : edges) {
            if (edge == null || edge.a == null || edge.b == null) {
                throw new NullPointerException();
            }
            if (edge.a.equals(edge.b)) {
                throw new IllegalArgumentException();
            }
            if (edge.a < 0 || edge.a >= order || edge.b < 0 || edge.b >= order) {
                throw new IllegalArgumentException();
            }
        }
        List<T> sortedNodes = sort(nodes);
        Map<T, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < order; i++) {
            indexMap.put(sortedNodes.get(i), i);
        }
        List<Pair<Integer, Integer>> sortedEdges = new ArrayList<>();
        for (Pair<Integer, Integer> edge : edges) {
            Integer newA = indexMap.get(nodes.get(edge.a));
            Integer newB = indexMap.get(nodes.get(edge.b));
            sortedEdges.add(newA < newB ? new Pair<>(newA, newB) : new Pair<>(newB, newA));
        }
        sortedEdges = toList(nub(sort(EDGE_COMPARATOR, sortedEdges)));
        return new LabeledGraph(sortedNodes, indexMap, sortedEdges);
    }

    public int order() {
        return nodes.size();
    }

    public int size() {
        return edges.size();
    }

    public @NotNull List<T> isolatedNodes() {
        List<T> isolatedNodes = toList(nodes);
        for (Pair<Integer, Integer> edge : edges) {
            isolatedNodes.remove(nodes.get(edge.a));
            isolatedNodes.remove(nodes.get(edge.b));
        }
        return isolatedNodes;
    }

    public @NotNull String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        String prefix = "";
        for (T isolatedNode : isolatedNodes()) {
            sb.append(prefix);
            sb.append(isolatedNode);
            prefix = ", ";
        }
        for (Pair<Integer, Integer> edge : edges) {
            sb.append(prefix);
            sb.append('(');
            sb.append(nodes.get(edge.a));
            sb.append(", ");
            sb.append(nodes.get(edge.b));
            sb.append(')');
            prefix = ", ";
        }
        sb.append(']');
        return sb.toString();
    }

    @SuppressWarnings("SimplifiableIfStatement")
    public void validate() {
        int order = nodes.size();
        assertFalse(toString(), any(n -> n == null, nodes));
        assertTrue(toString(), increasing(nodes));
        assertEquals(toString(), indexMap.size(), order);
        assertTrue(
                toString(),
                all(
                        p -> p.a != null && p.b != null && p.b >= 0 && p.b < order && nodes.get(p.b).equals(p.a),
                        fromMap(indexMap)
                )
        );
        assertTrue(
                toString(),
                all(
                        e -> {
                            if (e == null || e.a == null || e.b == null) return false;
                            if (e.a < 0 || e.a >= order) return false;
                            if (e.b < 0 || e.b >= order) return false;
                            return e.a < e.b;
                        },
                        edges
                )
        );
        assertTrue(toString(), increasing(EDGE_COMPARATOR, edges));
    }
}
