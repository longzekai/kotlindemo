package DesignPattern.BehavioralPattern.Interpreter.Expression;

import DesignPattern.BehavioralPattern.Interpreter.AbstractExpression.Expression;
import DesignPattern.BehavioralPattern.Interpreter.Context.Context;


/**
 * Created by Danny on 2018/7/6.
 */
public class AdvanceExpression extends Expression {
    @Override
    public void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}
