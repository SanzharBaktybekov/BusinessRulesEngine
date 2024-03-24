package org.example;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
