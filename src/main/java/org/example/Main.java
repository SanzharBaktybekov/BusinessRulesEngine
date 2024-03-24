package org.example;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        JSONSource jsonSource = new JSONSource("src/main/resources/JsonWithFacts.json");
        Facts factsFromJson = FactsLoader.loadFrom(jsonSource);

        Rule rule = RuleBuilder
                .when(f -> Objects.equals(f.getFact("Age"), "22"))
                .then(f -> System.out.println("You are too old"));

        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(factsFromJson);

        businessRuleEngine.addRule(rule);
        businessRuleEngine.run();
    }
}