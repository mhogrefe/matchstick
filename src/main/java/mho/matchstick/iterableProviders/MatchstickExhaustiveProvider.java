package mho.matchstick.iterableProviders;

import mho.matchstick.objects.LabeledGraph;
import mho.wheels.iterables.ExhaustiveProvider;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("unused")
public final strictfp class MatchstickExhaustiveProvider extends MatchstickIterableProvider {
    public static final @NotNull MatchstickExhaustiveProvider INSTANCE = new MatchstickExhaustiveProvider();

    private MatchstickExhaustiveProvider() {
        super(ExhaustiveProvider.INSTANCE);
    }

    public @NotNull <T> Iterable<List<T>> controlledListsLex(@NotNull List<Iterable<T>> xss) {
        return ExhaustiveProvider.INSTANCE.controlledListsLex(xss);
    }

    @Override
    public @NotNull <T extends Comparable<T>> Iterable<LabeledGraph<T>> labeledGraphs(@NotNull Iterable<T> ns) {
        return null;
    }
}
