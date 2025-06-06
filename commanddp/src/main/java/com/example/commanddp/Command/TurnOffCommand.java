package com.example.commanddp.Command;

import com.example.commanddp.Receiver.AirConditioner;
import com.example.commanddp.Receiver.Bulb;

public class TurnOffCommand implements ICommand {
    private final Object receiver;

    public TurnOffCommand(Object receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (receiver instanceof Bulb) {
            ((Bulb) receiver).turnOff();
        } else if (receiver instanceof AirConditioner) {
            ((AirConditioner) receiver).turnOff();
        }
    }

    @Override
    public void undo() {
        if (receiver instanceof Bulb) {
            ((Bulb) receiver).turnOn();
        } else if (receiver instanceof AirConditioner) {
            ((AirConditioner) receiver).turnOn();
        }
    }

}
