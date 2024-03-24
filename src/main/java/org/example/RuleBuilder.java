package org.example;

public class RuleBuilder {
    private Condition condition;

    private RuleBuilder(Condition condition) {
        this.condition = condition;
    }
    public static RuleBuilder when(Condition condition) {
        return new RuleBuilder(condition);
    }
    Rule then(Action action) {
        return new Rule(condition, action);
    }
}
