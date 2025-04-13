package com.example.loggingframework;

public abstract class AbstractLogger {
    int level;
    AbstractLogger nextLoggerLevel;

    public void setNextLoggerLevel(AbstractLogger nextLoggerLevel) {
        this.nextLoggerLevel = nextLoggerLevel;
    }

    void logMessage(int level, String msg, LogSubject logSubject) {
        if (this.level == level) {
            display(msg, logSubject);
        }
        if (nextLoggerLevel != null) {
            nextLoggerLevel.logMessage(level, msg, logSubject);
        }
    }

    protected abstract void display(String msg, LogSubject logSubject);
}
