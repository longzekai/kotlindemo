package DesignPattern.BehavioralPattern.ChainOfResponsibility.ConcreteHandler;

import DesignPattern.BehavioralPattern.ChainOfResponsibility.Handler.RequestHandle;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.LeaveRequest;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.Request;

/**
 * Created by Danny on 2018/7/3.
 */
public class TLRequestHandle implements RequestHandle {
    RequestHandle rh ;

    public TLRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof LeaveRequest) {
            System.out.println("要请假, 项目组长审批!");
        } else {
            rh.handleRequest(request);
        }
    }
}
