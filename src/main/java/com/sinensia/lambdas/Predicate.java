package com.sinensia.lambdas;

//Va a operar sobre un tipo generico
public interface Predicate<T> {
    boolean test(T t);
}
