package edu.seu.command;

import edu.seu.command.factory.RemoteControllerFactory;

/**
 *  客户端，最终调用者
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = RemoteControllerFactory.createRemoteController();
        remoteController.onButtonPushed(1);
        remoteController.offButtonPushed(1);
        remoteController.onButtonPushed(1);
        remoteController.onButtonPushed(2);
        remoteController.offButtonPushed(2);
        remoteController.onButtonPushed(2);
        remoteController.undoButtonPushed();
        remoteController.undoButtonPushed();
        remoteController.undoButtonPushed();
        remoteController.undoButtonPushed();
        remoteController.undoButtonPushed();
        remoteController.undoButtonPushed();
        remoteController.undoButtonPushed();
    }
}
