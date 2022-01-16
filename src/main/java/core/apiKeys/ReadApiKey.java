package core.apiKeys;

import core.readers.ReaderJson;

public class ReadApiKey {
    public static String read() {
        String resultFromReader = ReaderJson.getValueByName("key", "src/main/resources/api.json");
        return "&api-key=" + resultFromReader;
    }
}
