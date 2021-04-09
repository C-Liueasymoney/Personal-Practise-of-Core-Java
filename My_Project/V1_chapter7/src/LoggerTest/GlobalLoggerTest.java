package LoggerTest;

import java.util.logging.Logger;

public class GlobalLoggerTest {
    public static void main(String[] args) {
        Logger.getGlobal().info("File");
    }
}
