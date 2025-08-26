package model;

public class LogMessage {
    LogType logType;

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    public LogMessage(LogType logType, String message) {
        this.logType = logType;
        this.message = message;
    }
}
