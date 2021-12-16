package edu.seu.command;

import edu.seu.command.command.Command;
import edu.seu.command.command.NoCommand;

import java.util.LinkedList;

/**
 *  遥控器类：命令的发起者
 */
public class RemoteController {

    // 开，关命令数组
    private final Command[] onCommands;
    private final Command[] offCommands;

    // 执行撤销的命令
    private final LinkedList<Command> undoCommands = new LinkedList<>();

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给按钮设置需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonPushed(int no) {
        onCommands[no].execute();
        undoCommands.addLast(onCommands[no]);
    }

    // 按下关按钮
    public void offButtonPushed(int no) {
        offCommands[no].execute();
        undoCommands.addLast(offCommands[no]);
    }

    // 撤销
    public void undoButtonPushed() {
        if (undoCommands.size() > 0) {
            Command undoCommand = undoCommands.removeLast();
            undoCommand.undo();
        } else {
            System.out.println("无可以撤销的命令");
        }
    }
}
