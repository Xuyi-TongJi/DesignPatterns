package edu.seu.adapter.classAdapter;

import edu.seu.adapter.env.Phone;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        phone.charging(voltageAdapter);
    }
}
