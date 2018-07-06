package DesignPattern.BehavioralPattern.Interpreter.AbstractExpression;


import DesignPattern.BehavioralPattern.Interpreter.Context.Context;

/**
 * Created by Danny on 2018/7/6.
 */
public abstract class Expression {
    public abstract void interpret(Context ctx) ;
}
