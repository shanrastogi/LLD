package com.example.commanddp.Invoker;

import java.util.Stack;

import com.example.commanddp.Command.ICommand;

public class MyRemoteControl {
    Stack<ICommand> commandStack = new Stack<>();
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandStack.push(command);
    }

    public void pressUndo() {
        if (!commandStack.isEmpty()) {
            ICommand lastCommand = commandStack.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo");
        }
    }

}
