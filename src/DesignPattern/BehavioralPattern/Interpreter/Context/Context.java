package DesignPattern.BehavioralPattern.Interpreter.Context;

import DesignPattern.BehavioralPattern.Interpreter.AbstractExpression.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danny on 2018/7/6.
 */
public class Context {
    String content ;
    List<Expression> list = new ArrayList() ;

    public void add(Expression eps) {
        list.add(eps) ;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Expression> getList() {
        return list;
    }

}
