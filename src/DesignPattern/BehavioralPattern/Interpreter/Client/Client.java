package DesignPattern.BehavioralPattern.Interpreter.Client;

import DesignPattern.BehavioralPattern.Interpreter.AbstractExpression.Expression;
import DesignPattern.BehavioralPattern.Interpreter.Context.Context;
import DesignPattern.BehavioralPattern.Interpreter.Expression.AdvanceExpression;
import DesignPattern.BehavioralPattern.Interpreter.Expression.SimpleExpression;

/**
 * Created by Danny on 2018/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context() ;
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());
        for (Expression eps : ctx.getList()) {
            eps.interpret(ctx);
        }
    }
}
