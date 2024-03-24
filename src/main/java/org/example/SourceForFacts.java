package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface SourceForFacts {
        public Set<Map.Entry<String, String>> getFacts();
}