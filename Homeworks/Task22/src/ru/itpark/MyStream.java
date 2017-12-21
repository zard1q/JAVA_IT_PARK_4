package ru.itpark;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface MyStream<T> {
    MyStream<T> forEach(Consumer<T> consumer);
    MyStream<T> filter(Predicate<T> predicate);
    <R> MyStream<R> map(Function<T,R> function);
}

