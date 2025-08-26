import model.LogMessage;
import model.LogType;
import model.LoggerImpl;

public class WarnLogger extends LoggerImpl {
    public WarnLogger() {
        super();
    }

    public WarnLogger(LoggerImpl logger) {
        super(logger);
    }

    @Override
    public void log(LogMessage logMessage) {
        if(logMessage.getLogType() == LogType.WARN){
            System.out.println(logMessage.getLogType() + logMessage.getMessage());
        } else {
            super.log(logMessage);
        }
    }
}

