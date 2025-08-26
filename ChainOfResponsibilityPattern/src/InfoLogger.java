import model.LogMessage;
import model.LogType;
import model.LoggerImpl;

public class InfoLogger extends LoggerImpl {

    public InfoLogger() {
        super();
    }

    public InfoLogger(LoggerImpl logger) {
        super(logger);
    }

    @Override
    public void log(LogMessage logMessage) {
        if(logMessage.getLogType() == LogType.INFO){
            System.out.println(logMessage.getLogType() + logMessage.getMessage());
        } else {
            super.log(logMessage);
        }
    }
}
