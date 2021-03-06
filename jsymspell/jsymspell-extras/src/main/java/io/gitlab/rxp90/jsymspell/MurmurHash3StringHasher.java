package io.gitlab.rxp90.jsymspell;

import io.gitlab.rxp90.jsymspell.api.StringHasher;
import net.openhft.hashing.LongHashFunction;

public class MurmurHash3StringHasher implements StringHasher {

    private final LongHashFunction murmur3 = LongHashFunction.murmur_3();

    @Override
    public long hash(String input) {
        return murmur3.hashChars(input);
    }

}
