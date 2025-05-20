package com.example.commanddp;

import com.example.commanddp.Command.TurnOffCommand;
import com.example.commanddp.Command.TurnOnCommand;
import com.example.commanddp.Invoker.MyRemoteControl;
import com.example.commanddp.Receiver.AirConditioner;
import com.example.commanddp.Receiver.Bulb;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Bulb bulb = new Bulb();

        MyRemoteControl remoteControl = new MyRemoteControl();
        remoteControl.setCommand(new TurnOnCommand(airConditioner));

        remoteControl.pressButton(); // AirConditioner is turned on
        remoteControl.pressUndo(); // AirConditioner is turned off
        remoteControl.setCommand(new TurnOnCommand(bulb));
        remoteControl.pressButton(); // Bulb is turned on
        remoteControl.pressUndo(); // Bulb is turned off
        remoteControl.setCommand(new TurnOffCommand(airConditioner));
        remoteControl.pressButton(); // AirConditioner is turned off
        remoteControl.pressUndo(); // AirConditioner is turned on

    }
}