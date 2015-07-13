import mho.wheels.structures.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

public final class DirectedGraph<T extends Comparable<T>> {
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
}
