package uem.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtils {
    private static final String testFolderAssets = "/tests/assets/";


    public static String GetFileContent(String path)
            throws IOException {
        path = TestUtils.GetFolderAssets() + path;
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, "UTF-8");
    }

    public static String GetFolderAssets(String append) {
        return GetFolderAssets() + append;
    }

    public static String GetFolderAssets() {
        return System.getProperty("user.dir") + TestUtils.testFolderAssets;
    }
}
