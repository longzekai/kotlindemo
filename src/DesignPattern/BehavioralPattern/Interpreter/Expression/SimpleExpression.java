package DesignPattern.BehavioralPattern.Interpreter.Expression;

import DesignPattern.BehavioralPattern.Interpreter.AbstractExpression.Expression;
import DesignPattern.BehavioralPattern.Interpreter.Context.Context;


/**
 * Created by Danny on 2018/7/6.
 */
public class SimpleExpression extends Expression {
    @Override
    public void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}
