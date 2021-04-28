package lesson26.builder;

public class Setting {
    private String prefix;
    private String host;
    private String port;
    private String path;

    public static class Builder {
        private Setting setting;

        public Builder() {
            setting = new Setting();
        }

        public Builder withPrefix(String prefix) {
            setting.prefix = prefix;
            return this;
        }

        public Builder withHost(String host) {
            setting.host = host;
            return this;
        }

        public Builder withPort(String port) {
            setting.port = port;
            return this;
        }

        public Builder withPath(String path) {
            setting.path = path;
            return this;
        }

        public Setting build() {
            return setting;
        }
    }

}
