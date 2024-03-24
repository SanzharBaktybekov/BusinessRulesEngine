package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FileSource implements SourceForFacts{
    Map<String, String> facts = new HashMap<>();

    public FileSource(String pathStr) throws IOException {
        this(pathStr, ":");
    }

    public FileSource(String pathStr, String splitter) throws IOException {
        Path path = Path.of(pathStr);
        List<String> stringList = Files.readAllLines(path);
        for(String line : stringList) {
            int n = line.lastIndexOf(splitter);
            String key = line.substring(0, n);
            String val = line.substring(++n);
            facts.put(key, val);
        }
    }

    @Override
    public Set<Map.Entry<String, String>> getFacts() {
        return facts.entrySet();
    }
}