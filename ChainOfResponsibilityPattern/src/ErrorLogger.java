import model.LogMessage;
import model.LogType;
import model.LoggerImpl;

public class ErrorLogger extends LoggerImpl {

    public ErrorLogger() {
        super();
    }

    public ErrorLogger(LoggerImpl logger) {
        super(logger);
    }

    @Override
    public void log(LogMessage logMessage) {
        if(logMessage.getLogType() == LogType.ERROR){
            System.out.println(logMessage.getLogType() + logMessage.getMessage());
        } else {
            super.log(logMessage);
        }
    }
}
