package action.chainOfResponsibility;

import action.chainOfResponsibility.impl.EmailLogger;
import action.chainOfResponsibility.impl.FileLogger;
import action.chainOfResponsibility.impl.SMSLogger;
import action.chainOfResponsibility.levels.Level;

public class Main {

    public static void main(String[] args) {
        SMSLogger smsLogger1 = new SMSLogger(Level.ERROR.ordinal());
        EmailLogger emailLogger = new EmailLogger(Level.DEBUG.ordinal());
        smsLogger1.setNextLogger(emailLogger);
        FileLogger fileLogger = new FileLogger(Level.INFO.ordinal());
        emailLogger.setNextLogger(fileLogger);

        smsLogger1.writeMessage("Hello debug", Level.DEBUG.ordinal());
        smsLogger1.writeMessage("Hello error", Level.ERROR.ordinal());
        smsLogger1.writeMessage("Hello info", Level.INFO.ordinal());


    }
}
