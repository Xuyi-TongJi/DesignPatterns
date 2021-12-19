package edu.seu.interpreter.application;

import edu.seu.interpreter.exception.ExpressionException;
import edu.seu.interpreter.exception.ParamsException;
import edu.seu.interpreter.expression.AbstractExpression;
import edu.seu.interpreter.expression.AddExpression;
import edu.seu.interpreter.expression.SubExpression;
import edu.seu.interpreter.expression.VarExpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 能够实现十以内加减法的计算器,使用解释器模式实现
 */
public class Calculator {

    private final AbstractExpression expression;
    private final Map<String, Integer> var;

    /**
     * 构造函数传参，并解析
     * @param str 表达式
     */
    public Calculator(String str) {
        // 输入表达式合法性检测
        if (!testValidation(str))
            throw new ExpressionException("表达式不合法");
        // 获得参数值Map
        this.var = getValue(str);
        // 解析表达式
        Stack<AbstractExpression> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        AbstractExpression left = null;
        AbstractExpression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 遍历完整个数组后，就可以得到最后的AbstractExpression
        this.expression = stack.pop();
    }

    /**
     * 运行计算操作
     * @return 计算结果
     */
    public int run() {
        return this.expression.interpret(this.var);
    }

    private boolean containsNumber(String next) {
        char[] charArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        return Arrays.toString(charArray).contains(next);
    }

    private boolean containsSymbol(String next) {
        char[] charArray = new char[]{'+', '-'};
        return Arrays.toString(charArray).contains(next);
    }

    private boolean containsParam(String next) {
        return (!containsNumber(next) && !containsSymbol(next));
    }

    // 检测是否非法表达式
    private boolean testValidation(String expStr) {
        char[] chars = expStr.toCharArray();
        if (containsSymbol(String.valueOf(chars[0]))
                || containsSymbol(String.valueOf(chars[chars.length - 1]))) {
            return false;
        }
        if (chars.length > 1) {
            for (int i = 0; i < chars.length - 1; i++) {
                if (containsNumber(String.valueOf(chars[i]))) {
                    return false;
                } else if (containsSymbol(String.valueOf(chars[i]))
                        && containsSymbol(String.valueOf(chars[i + 1]))) {
                    return false;
                } else if (containsParam(String.valueOf(chars[i]))
                        && containsParam(String.valueOf(chars[i + 1]))) {
                    return false;
                }
            }
        } else {
            return containsParam(String.valueOf(chars[0]));
        }
        return true;
    }

    // 根据表达式输入参数值，并获得参数值map
    private HashMap<String, Integer> getValue(String expStr) {
        HashMap<String, Integer> valueMap = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for (char ch:
                    expStr.toCharArray()) {
                if (ch != '+' && ch != '-') {
                    if (!valueMap.containsKey(String.valueOf(ch))) {
                        System.out.println("请输入参数" + String.valueOf(ch) + "的值:");
                        String in = bufferedReader.readLine();
                        if (containsNumber(in)){
                            valueMap.put(String.valueOf(ch), Integer.valueOf(in));
                        } else {
                            throw new ParamsException("输入参数异常");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return valueMap;
    }
}