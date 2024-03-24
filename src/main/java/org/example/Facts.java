package org.example;

import java.util.HashMap;
import java.util.Map;

public class Facts {
    Map<String, String> facts = new HashMap<>();

    public Facts addFact(Facts facts) {
        return this;
    }
    public void addFact(String name, String value) {
        facts.put(name, value);
    }

    public String getFact(String name) {
        return facts.get(name);
    }
}