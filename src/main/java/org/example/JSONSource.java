package org.example;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JSONSource implements SourceForFacts{

    Map<String, String> map = new HashMap<>();
    public JSONSource(String pathStr) throws IOException {
        Path path = Path.of(pathStr);
        String src = new String(Files.readAllBytes(path));
        JSONObject object = new JSONObject(src);

        for(String key : object.keySet()) {
            map.put(key, (String) object.get(key));
        }
    }

    @Override
    public Set<Map.Entry<String, String>> getFacts() {
        return map.entrySet();
    }
}
