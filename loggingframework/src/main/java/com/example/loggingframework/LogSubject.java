package com.example.loggingframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {
    Map<Integer, List<LogObserver>> logObservers = new HashMap<>();

    void addObserver(int level, LogObserver logObserver) {
        List<LogObserver> logObserversList = logObservers.getOrDefault(level, new ArrayList<>());
        logObserversList.add(logObserver);
        logObservers.put(level, logObserversList);
    }

    void notifyAllObservers(int level, String message) {
        for (Map.Entry<Integer, List<LogObserver>> entry : logObservers.entrySet()) {
            if (entry.getKey() == level) {
                List<LogObserver> observers = entry.getValue();
                for (LogObserver observer : observers) {
                    observer.log(message);
                }
            }
        }
    }
}
