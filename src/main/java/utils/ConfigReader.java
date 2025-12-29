package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException("❌ Gagal memuat config.properties", e);
        }
    }

    // Ambil key biasa
    public static String get(String key) {
        String value = properties.getProperty(key);
        if (value == null)
            throw new RuntimeException("❌ Key '" + key + "' tidak ditemukan di config.properties");
        return value.trim();
    }

    // Ambil URL berdasarkan nama environment (contoh: paradize, lcms)
    public static String getEnvUrl(String envName) {
        String key = "url." + envName.toLowerCase();
        return get(key);
    }
}
