package mho.matchstick.iterableProviders;

import mho.wheels.iterables.ExhaustiveProvider;
import mho.wheels.ordering.Ordering;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public final strictfp class MatchstickExhaustiveProvider extends MatchstickIterableProvider {
    public static final @NotNull MatchstickExhaustiveProvider INSTANCE = new MatchstickExhaustiveProvider();

    private MatchstickExhaustiveProvider() {
        super(ExhaustiveProvider.INSTANCE);
    }

    public @NotNull Iterable<Ordering> orderingsIncreasing() {
        return ExhaustiveProvider.INSTANCE.orderingsIncreasing();
    }

    public @NotNull Iterable<Byte> bytesIncreasing() {
        return ExhaustiveProvider.INSTANCE.bytesIncreasing();
    }

    public @NotNull Iterable<Short> shortsIncreasing() {
        return ExhaustiveProvider.INSTANCE.shortsIncreasing();
    }

    public @NotNull Iterable<Integer> integersIncreasing() {
        return ExhaustiveProvider.INSTANCE.integersIncreasing();
    }

    public @NotNull Iterable<Long> longsIncreasing() {
        return ExhaustiveProvider.INSTANCE.longsIncreasing();
    }

    public @NotNull Iterable<Character> asciiCharactersIncreasing() {
        return ExhaustiveProvider.INSTANCE.asciiCharactersIncreasing();
    }

    public @NotNull Iterable<Character> charactersIncreasing() {
        return ExhaustiveProvider.INSTANCE.charactersIncreasing();
    }
}
