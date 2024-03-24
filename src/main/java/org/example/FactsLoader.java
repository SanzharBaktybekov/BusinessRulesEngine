package org.example;

public class FactsLoader {
    public static Facts loadFrom(SourceForFacts sourceForFacts) {
        Facts facts = new Facts();
        sourceForFacts.getFacts().forEach(map -> facts.addFact(map.getKey(), map.getValue()));
        return facts;
    }
}