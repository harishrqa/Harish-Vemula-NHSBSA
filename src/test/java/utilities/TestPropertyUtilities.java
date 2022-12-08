package utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Objects;
import java.util.Properties;

public class TestPropertyUtilities {

    private static final String DEFAULT_CONFIG_FILE_LOCATION = "src/testconfig.properties";

    private String configFileLocation;
    private Properties properties;

    public TestPropertyUtilities() throws Exception {
        this(DEFAULT_CONFIG_FILE_LOCATION);
    }

    public TestPropertyUtilities(String configFileLocation) throws Exception {
        this.configFileLocation = configFileLocation;
        this.properties = new Properties();
        init();
    }

    private void init() throws Exception {
        properties.load(new FileInputStream(this.configFileLocation));
        for (Object key : this.properties.keySet()) {
            String override = System.getProperty((String) key);
            if (override != null) {
                properties.put(key, override);
            }
        }
    }

    public String getStringProperty(String key) {
        return (String) this.properties.get(key);
    }


}
