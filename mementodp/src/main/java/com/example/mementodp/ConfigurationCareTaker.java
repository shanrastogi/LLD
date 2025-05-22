package com.example.mementodp;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> mementoList = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento) {
        mementoList.add(memento);
    }

    public ConfigurationMemento undoMemento() {
        int lastMementoIndex = mementoList.size() - 1;
        if (lastMementoIndex < 0) {
            System.out.println("No memento to undo");
            return null;
        }
        ConfigurationMemento memento = mementoList.get(lastMementoIndex);
        mementoList.remove(lastMementoIndex);
        return memento;
    }
}
