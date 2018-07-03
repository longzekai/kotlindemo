package DesignPattern.BehavioralPattern.ChainOfResponsibility.Handler;

import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.Request;

/**
 * Created by Danny on 2018/7/3.
 */
public interface RequestHandle {
    void handleRequest(Request request) ;
}
