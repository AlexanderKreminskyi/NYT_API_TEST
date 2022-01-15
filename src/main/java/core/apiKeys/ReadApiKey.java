package core.apiKeys;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadApiKey {
    public static String read() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/api.json"));
            ApiKey apiKey = gson.fromJson(reader, ApiKey.class);
            return apiKey.getKey();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Didn't read";
    }
}
