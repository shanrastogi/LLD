package com.example.mementodp;

public class Main {
    public static void main(String[] args) {
        ConfigurationOriginator originator = new ConfigurationOriginator(10, 20);

        System.out.println("Current height: " + originator.getHeight() + ", width: " + originator.getWidth());
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        // Save the initial state
        careTaker.addMemento(originator.createMemento());

        // Change the configuration
        originator.setHeight(30);
        originator.setWidth(40);
        System.out.println("Current height: " + originator.getHeight() + ", width: " + originator.getWidth());

        // Undo to the previous state
        ConfigurationMemento memento = careTaker.undoMemento();
        if (memento != null) {
            originator.restoreMemento(memento);
            System.out.println("Restored to height: " + originator.getHeight() + ", width: " + originator.getWidth());
        }

    }
}