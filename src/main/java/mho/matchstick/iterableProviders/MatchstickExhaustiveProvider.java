package mho.matchstick.iterableProviders;

import mho.matchstick.objects.LabeledGraph;
import mho.wheels.iterables.ExhaustiveProvider;
import mho.wheels.ordering.Ordering;
import mho.wheels.structures.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("unused")
public final strictfp class MatchstickExhaustiveProvider extends MatchstickIterableProvider {
    public static final @NotNull MatchstickExhaustiveProvider INSTANCE = new MatchstickExhaustiveProvider();

    private MatchstickExhaustiveProvider() {
        super(ExhaustiveProvider.INSTANCE);
    }

    public @NotNull <T> Iterable<List<T>> listsLex(int length, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.listsLex(length, xs);
    }

    public @NotNull <A, B> Iterable<Pair<A, B>> pairsLex(
            @NotNull Iterable<A> as,
            @NotNull Iterable<B> bs
    ) {
        return ExhaustiveProvider.INSTANCE.pairsLex(as, bs);
    }

    public @NotNull <A, B, C> Iterable<Triple<A, B, C>> triplesLex(
            @NotNull Iterable<A> as,
            @NotNull Iterable<B> bs,
            @NotNull Iterable<C> cs
    ) {
        return ExhaustiveProvider.INSTANCE.triplesLex(as, bs, cs);
    }

    public @NotNull <A, B, C, D> Iterable<Quadruple<A, B, C, D>> quadruplesLex(
            @NotNull Iterable<A> as,
            @NotNull Iterable<B> bs,
            @NotNull Iterable<C> cs,
            @NotNull Iterable<D> ds
    ) {
        return ExhaustiveProvider.INSTANCE.quadruplesLex(as, bs, cs, ds);
    }

    public @NotNull <A, B, C, D, E> Iterable<Quintuple<A, B, C, D, E>> quintuplesLex(
            @NotNull Iterable<A> as,
            @NotNull Iterable<B> bs,
            @NotNull Iterable<C> cs,
            @NotNull Iterable<D> ds,
            @NotNull Iterable<E> es
    ) {
        return ExhaustiveProvider.INSTANCE.quintuplesLex(as, bs, cs, ds, es);
    }

    public @NotNull <A, B, C, D, E, F> Iterable<Sextuple<A, B, C, D, E, F>> sextuplesLex(
            @NotNull Iterable<A> as,
            @NotNull Iterable<B> bs,
            @NotNull Iterable<C> cs,
            @NotNull Iterable<D> ds,
            @NotNull Iterable<E> es,
            @NotNull Iterable<F> fs
    ) {
        return ExhaustiveProvider.INSTANCE.sextuplesLex(as, bs, cs, ds, es, fs);
    }

    public @NotNull <A, B, C, D, E, F, G> Iterable<Septuple<A, B, C, D, E, F, G>> septuplesLex(
            @NotNull Iterable<A> as,
            @NotNull Iterable<B> bs,
            @NotNull Iterable<C> cs,
            @NotNull Iterable<D> ds,
            @NotNull Iterable<E> es,
            @NotNull Iterable<F> fs,
            @NotNull Iterable<G> gs
    ) {
        return ExhaustiveProvider.INSTANCE.septuplesLex(as, bs, cs, ds, es, fs, gs);
    }

    public @NotNull Iterable<String> stringsLex(int length, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringsLex(length, s);
    }

    public @NotNull <T> Iterable<List<T>> listsShortlex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.listsShortlex(xs);
    }

    public @NotNull Iterable<String> stringsShortlex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringsShortlex(s);
    }

    public @NotNull <T> Iterable<List<T>> listsShortlexAtLeast(int minSize, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.listsShortlexAtLeast(minSize, xs);
    }

    public @NotNull Iterable<String> stringsShortlexAtLeast(int minSize, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringsShortlexAtLeast(minSize, s);
    }

    public @NotNull <T> Iterable<List<T>> distinctListsLex(int length, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctListsLex(length, xs);
    }

    public @NotNull <T> Iterable<Pair<T, T>> distinctPairsLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctPairsLex(xs);
    }

    public @NotNull <T> Iterable<Triple<T, T, T>> distinctTriplesLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctTriplesLex(xs);
    }

    public @NotNull <T> Iterable<Quadruple<T, T, T, T>> distinctQuadruplesLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctQuadruplesLex(xs);
    }

    public @NotNull <T> Iterable<Quintuple<T, T, T, T, T>> distinctQuintuplesLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctQuintuplesLex(xs);
    }

    public @NotNull <T> Iterable<Sextuple<T, T, T, T, T, T>> distinctSextuplesLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctSextuplesLex(xs);
    }

    public @NotNull <T> Iterable<Septuple<T, T, T, T, T, T, T>> distinctSeptuplesLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctSeptuplesLex(xs);
    }

    public @NotNull Iterable<String> distinctStringsLex(int length, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.distinctStringsLex(length, s);
    }

    public @NotNull <T> Iterable<List<T>> distinctListsLex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctListsLex(xs);
    }

    public @NotNull Iterable<String> distinctStringsLex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.distinctStringsLex(s);
    }

    public @NotNull <T> Iterable<List<T>> distinctListsLexAtLeast(int minSize, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctListsLexAtLeast(minSize, xs);
    }

    public @NotNull Iterable<String> distinctStringsLexAtLeast(int minSize, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.distinctStringsLexAtLeast(minSize, s);
    }

    public @NotNull <T> Iterable<List<T>> distinctListsShortlex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctListsShortlex(xs);
    }

    public @NotNull Iterable<String> distinctStringsShortlex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.distinctStringsShortlex(s);
    }

    public @NotNull <T> Iterable<List<T>> distinctListsShortlexAtLeast(int minSize, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.distinctListsShortlexAtLeast(minSize, xs);
    }

    public @NotNull Iterable<String> distinctStringsShortlexAtLeast(int minSize, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.distinctStringsShortlexAtLeast(minSize, s);
    }

    public @NotNull <T> Iterable<List<T>> bagsLex(int size, @NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.bagsLex(size, xs);
    }

    public @NotNull Iterable<String> stringBagsLex(int size, @NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringBagsLex(size, s);
    }

    public @NotNull <T> Iterable<List<T>> bagsShortlex(@NotNull Iterable<T> xs) {
        return ExhaustiveProvider.INSTANCE.bagsShortlex(xs);
    }

    public @NotNull Iterable<String> stringBagsShortlex(@NotNull String s) {
        return ExhaustiveProvider.INSTANCE.stringBagsShortlex(s);
    }

    public @NotNull <T> Iterable<List<T>> bagsShortlexAtLeast(int minSize, @NotNull Iterable<T> xs) {
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
