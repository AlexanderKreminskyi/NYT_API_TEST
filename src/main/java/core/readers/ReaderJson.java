package core.readers;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ReaderJson {
    public static String getValueByName(String name, String pathToFile) {
        String valueByKey = "";
        try {
            Gson gson = new Gson();
            Reader readerFile = Files.newBufferedReader(Paths.get(pathToFile));
            Map<?, ?> mapForReadFile = gson.fromJson(readerFile, Map.class);
            for (Map.Entry<?, ?> entry : mapForReadFile.entrySet()) {
                if (entry.getKey().equals(name)) {
                    valueByKey = entry.getValue().toString();
                } else {
                    valueByKey = "Doesn't find property with this name: " + name;
                }
            }
            readerFile.close();
            return valueByKey;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Cannot read file: " + pathToFile;
    }
}
