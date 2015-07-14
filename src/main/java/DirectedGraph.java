import mho.wheels.structures.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static mho.wheels.iterables.IterableUtils.*;
import static org.junit.Assert.*;

public final class DirectedGraph<T extends Comparable<T>> {
    private static final @NotNull Comparator<Pair<Integer, Integer>> EDGE_COMPARATOR = new Pair.PairComparator<>(
            Integer::compare,
            Integer::compare
    );
    private @NotNull List<T> nodes;
    private @NotNull Map<T, Integer> indexMap;
    private @NotNull List<Pair<Integer, Integer>> edges;

    private DirectedGraph(
            @NotNull List<T> nodes,
            @NotNull Map<T, Integer> indexMap,
            @NotNull List<Pair<Integer, Integer>> edges
    ) {
        this.nodes = nodes;
        this.indexMap = indexMap;
        this.edges = edges;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    public void validate() {
        int order = nodes.size();
        assertFalse(toString(), any(n -> n == null, nodes));
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
        assertTrue(toString(), unique(edges));
        assertTrue(toString(), increasing(EDGE_COMPARATOR, edges));
    }
}
