package edu.seu.adapter.objectAdapter;

import edu.seu.adapter.env.Phone;
import edu.seu.adapter.env.Voltage220V;

public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        new Phone().charging(voltageAdapter);
    }
}
