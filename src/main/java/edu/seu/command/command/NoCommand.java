package edu.seu.command.command;

/**
 *  空命令实现，用于初始化遥控器类的每个按钮
 *  当调用空命令时，对象什么都不做
 *  可以省去对空的判断
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
