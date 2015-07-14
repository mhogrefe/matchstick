package mho.matchstick.objects;

import mho.wheels.structures.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static mho.wheels.iterables.IterableUtils.*;

public class LabeledGraphBuilder<T extends Comparable<T>> {
    private @NotNull List<T> nodes;
    private @NotNull Map<T, Integer> indexMap;
    private @NotNull List<Pair<Integer, Integer>> edges;

    public LabeledGraphBuilder(@NotNull List<T> nodes, @NotNull List<Pair<Integer, Integer>> edges) {
        this.nodes = toList(nodes);
        this.edges = toList(edges);
        indexMap = new HashMap<>();
        for (int i = 0; i < nodes.size(); i++) {
            indexMap.put(nodes.get(i), i);
        }
    }

    public LabeledGraphBuilder(@NotNull LabeledGraph<T> graph) {
        this(graph.getNodes(), graph.getEdges());
    }

    public LabeledGraphBuilder() {
        nodes = new ArrayList<>();
        indexMap = new HashMap<>();
        edges = new ArrayList<>();
    }

    public @NotNull LabeledGraph toLabeledGraph() {
        return LabeledGraph.of(nodes, edges);
    }

    public boolean addNode(@NotNull T node) {
        boolean alreadyPresent = indexMap.containsKey(node);
        if (!alreadyPresent) {
            indexMap.put(node, nodes.size());
            nodes.add(node);
        }
        return alreadyPresent;
    }

    public boolean addEdge(@NotNull T a, @NotNull T b) {
        if (a.equals(b)) {
            throw new IllegalArgumentException();
        }
        boolean aPresent = addNode(a);
        boolean bPresent = addNode(b);
        int aIndex = indexMap.get(a);
        int bIndex = indexMap.get(b);
        Pair<Integer, Integer> edge = aIndex < bIndex ? new Pair<>(aIndex, bIndex) : new Pair<>(bIndex, aIndex);
        boolean alreadyPresent = aPresent && bPresent && edges.contains(edge);
        if (!alreadyPresent) {
            edges.add(edge);
        }
        return alreadyPresent;
    }
}
