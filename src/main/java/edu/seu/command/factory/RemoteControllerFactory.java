package edu.seu.command.factory;

import edu.seu.command.RemoteController;
import edu.seu.command.command.*;
import edu.seu.command.receiver.LightReceiver;
import edu.seu.command.receiver.TVReceiver;

public class RemoteControllerFactory {

    /**
     * 生产一个智能家居遥控器
     * @return 生产一个具有遥控电视，电灯功能的遥控器
     */
    public static RemoteController createRemoteController() {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();

        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(1, lightOnCommand, lightOffCommand);

        Command tvOnCommand = new TVOnCommand(tvReceiver);
        Command tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(2, tvOnCommand, tvOffCommand);

        return remoteController;
    }
}
