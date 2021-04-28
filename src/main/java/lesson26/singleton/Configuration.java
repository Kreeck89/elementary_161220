package lesson26.singleton;

import java.util.Objects;

public class Configuration {
    private static Configuration instance;
    private String path;
    //several parameters here

    private Configuration(String path) {
        this.path = path;
    }

    public synchronized static Configuration instance(String path) {
        if (Objects.isNull(instance)) {
            instance = new Configuration(path);
        }
        return instance;
    }

    public String getPath() {
        return path;
    }
}
