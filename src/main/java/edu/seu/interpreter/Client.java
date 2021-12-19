package edu.seu.interpreter;

import edu.seu.interpreter.application.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入表达式");
        String expStr = getExpStr();
        Calculator calculator = new Calculator(expStr);
        System.out.println(calculator.run());
    }

    public static String getExpStr() {
        String in = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            in = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in;
    }
}