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

    public @NotNull <T extends Comparable<T>> Iterable<List<T>> bagsShortlex(@NotNull List<T> xs) {
        return ExhaustiveProvider.INSTANCE.bagsShortlex(xs);
    }

    public @NotNull Iterable<String> stringBagsShortlex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringBagsShortlex(s);
    }

    public @NotNull <T extends Comparable<T>> Iterable<List<T>> bagsShortlexAtLeast(int minSize, @NotNull List<T> xs) {
        return ExhaustiveProvider.INSTANCE.bagsShortlexAtLeast(minSize, xs);
    }

    public @NotNull Iterable<String> stringBagsShortlexAtLeast(int minSize, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringBagsShortlexAtLeast(minSize, s);
    }

    public @NotNull <T> Iterable<List<T>> subsetsLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.subsetsLex(xs);
    }

    public @NotNull Iterable<String> stringSubsetsLex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringSubsetsLex(s);
    }

    public @NotNull <T> Iterable<List<T>> subsetsLexAtLeast(int minSize, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.subsetsLexAtLeast(minSize, xs);
    }

    public @NotNull Iterable<String> stringSubsetsLexAtLeast(int minSize, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringSubsetsLexAtLeast(minSize, s);
    }

    public @NotNull <T> Iterable<List<T>> subsetsShortlex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.subsetsShortlex(xs);
    }

    public @NotNull Iterable<String> stringSubsetsShortlex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringSubsetsShortlex(s);
    }

    public @NotNull <T> Iterable<List<T>> subsetsShortlexAtLeast(int minSize, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.subsetsShortlexAtLeast(minSize, xs);
    }

    public @NotNull Iterable<String> stringSubsetsShortlexAtLeast(int minSize, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringSubsetsShortlexAtLeast(minSize, s);
    }

    public @NotNull <T> Iterable<List<T>> controlledListsLex(@NotNull List<Iterable<T>> xss) {
        return ExhaustiveProvider.INSTANCE.controlledListsLex(xss);
    }

    @Override
    public @NotNull <T extends Comparable<T>> Iterable<LabeledGraph<T>> labeledGraphs(@NotNull Iterable<T> ns) {
        return null;
    }
}
