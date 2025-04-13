package com.example.loggingframework;

import static com.example.loggingframework.LogManager.buildLoggerChain;
import static com.example.loggingframework.LogManager.buildSubject;

public class Logger {
    private volatile static Logger logger;
    private volatile static AbstractLogger chainOfLogger;
    private volatile static LogSubject logSubject;

    private Logger() {
        if (logger != null) {
            throw new IllegalStateException("Object already created");
        }
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                    chainOfLogger = buildLoggerChain();
                    logSubject = buildSubject();
                }
            }
        }
        return logger;
    }

    void createLog(int level, String msg){
        chainOfLogger.logMessage(level, msg, logSubject);
    }

    public void info(String msg){
        createLog(1, msg);
    }

    public void error(String msg){
        createLog(2, msg);
    }

    public void debug(String msg){
        createLog(3, msg);
    }
}
