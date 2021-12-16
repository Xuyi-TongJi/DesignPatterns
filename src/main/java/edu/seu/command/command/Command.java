package edu.seu.command.command;

/**
 *  命令接口，解耦命令的发起者和接收者
 */
public interface Command {

    /**
     *  执行操作
     */
    void execute();

    /**
     *  撤销操作
     */
    void undo();
}
