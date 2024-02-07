package criacao.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Logger {
    protected static Logger instance;
    private List<String> logHistory;

    private Logger() {
        logHistory = new ArrayList<>();
    }
    public static Logger getInstance() {
        return Objects.isNull(instance) ? instance = new Logger() : instance;
    }

    public void logMessage(String message) {
        logHistory.add(message);
        System.out.println("Log: " + message);
    }

    public List<String> getLogHistory() {
        return Collections.unmodifiableList(logHistory);
    }
}
