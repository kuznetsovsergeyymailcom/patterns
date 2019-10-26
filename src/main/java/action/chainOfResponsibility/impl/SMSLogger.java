package action.chainOfResponsibility.impl;

import action.chainOfResponsibility.interfaces.Logger;

public class SMSLogger implements Logger {
    private int priority;
    private Logger nextLogger;

    public SMSLogger(int priority) {
        this.priority = priority;
    }

    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }

    @Override
    public void writeMessage(String message, int logLevel) {
        if (logLevel <= priority) {
            System.out.println("CMC: " + message);
        }
        if (nextLogger != null) {
            nextLogger.writeMessage(message, logLevel);
        }
    }
}
