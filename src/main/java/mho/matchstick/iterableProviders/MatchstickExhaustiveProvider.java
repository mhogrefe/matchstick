package mho.matchstick.iterableProviders;

import mho.matchstick.objects.LabeledGraph;
import mho.wheels.iterables.ExhaustiveProvider;
import mho.wheels.structures.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

import static mho.wheels.iterables.IterableUtils.map;
import static mho.wheels.iterables.IterableUtils.toList;

@SuppressWarnings("unused")
public final strictfp class MatchstickExhaustiveProvider extends MatchstickIterableProvider {
    public static final @NotNull MatchstickExhaustiveProvider INSTANCE = new MatchstickExhaustiveProvider();

    private MatchstickExhaustiveProvider() {
        super(ExhaustiveProvider.INSTANCE);
    }

    @Override
    public @NotNull <T extends Comparable<T>> Iterable<LabeledGraph<T>> labeledGraphs(@NotNull List<T> ns) {
        return map(
                edgeSet -> LabeledGraph.of(ns, toList(map(e -> e.p, edgeSet))),
                subsetsShortlex(
                        toList(map(Edge::new, subsetPairsLex(toList(INSTANCE.rangeIncreasing(0, ns.size() - 1)))))
                )
        );
    }

    private static class Edge implements Comparable<Edge> {
        private static final @NotNull Comparator<Pair<Integer, Integer>> EDGE_COMPARATOR =
                new Pair.PairComparator<>(Integer::compare, Integer::compare);
        public final @NotNull Pair<Integer, Integer> p;

        public Edge(@NotNull Pair<Integer, Integer> p) {
            this.p = p;
        }

        @Override
        public int compareTo(@NotNull Edge that) {
            return EDGE_COMPARATOR.compare(p, that.p);
        }
    }
}
