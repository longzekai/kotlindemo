package DesignPattern.BehavioralPattern.ChainOfResponsibility.ConcreteHandler;

import DesignPattern.BehavioralPattern.ChainOfResponsibility.Handler.RequestHandle;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.DimissionRequest;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.Request;

/**
 * Created by Danny on 2018/7/3.
 */
public class HRRequestHandle implements RequestHandle {
    @Override
    public void handleRequest(Request request) {
        if (request instanceof DimissionRequest) {
            System.out.println("要离职, 人事审批!");
        }
        System.out.println("请求完毕");
    }
}
