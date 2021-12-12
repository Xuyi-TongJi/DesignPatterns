package edu.seu.bridge;

import edu.seu.bridge.abstraction.FoldedPhone;
import edu.seu.bridge.abstraction.Phone;
import edu.seu.bridge.abstraction.TouchedPhone;
import edu.seu.bridge.implementation.XiaoMi;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        System.out.println("==============");
        Phone phone1 = new TouchedPhone(new XiaoMi());
        phone1.open();
    }
}
