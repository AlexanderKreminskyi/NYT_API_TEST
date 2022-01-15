package core.apiKeys;

public class ApiKey {
    private String name;
    private String key;

    public ApiKey(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }
}
