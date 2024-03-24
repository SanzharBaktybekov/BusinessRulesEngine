package org.example;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private final List<Rule> rules;
    public final Facts facts;

    public BusinessRuleEngine(Facts facts) {
        rules = new ArrayList<>();
        this.facts = facts;
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public int count(){
        return rules.size();
    }

    public void run() {
        rules.forEach(r -> r.perform(facts));
    }
}