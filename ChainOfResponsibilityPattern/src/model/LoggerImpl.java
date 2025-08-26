package model;

public abstract class LoggerImpl {
    LoggerImpl nextLogger;

    public LoggerImpl () {};

    public LoggerImpl (LoggerImpl nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(LogMessage logMessage) {
        if(nextLogger != null) {
            nextLogger.log(logMessage);
        }
    }
}
