package com.java.stream.Stream;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CostomInfiniteStreamDemo {
    static void main(String[] args) {

        Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
        Stream<UUID> infiniteLoopOfRandomUUID = Stream.generate(randomUUIDSupplier);
        List<UUID> randomInts = infiniteLoopOfRandomUUID
                .skip(3)
                .limit(5)
                .toList();
        randomInts.forEach(System.out::println);
    }
}
