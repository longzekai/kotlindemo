package DesignPattern.BehavioralPattern.ChainOfResponsibility.Client;

import DesignPattern.BehavioralPattern.ChainOfResponsibility.ConcreteHandler.HRRequestHandle;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.ConcreteHandler.PMRequestHandle;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.ConcreteHandler.TLRequestHandle;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Handler.RequestHandle;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.AddMoneyRequest;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.DimissionRequest;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.LeaveRequest;
import DesignPattern.BehavioralPattern.ChainOfResponsibility.Request.Request;

/**
 * Created by Danny on 2018/6/26.
 */
public class Client {
    public static void main(String[] args) {
        RequestHandle hr = new HRRequestHandle() ;
        RequestHandle pm = new PMRequestHandle(hr) ;
        RequestHandle tl = new TLRequestHandle(pm) ;

        //team leader处理离职请求
        Request request = new DimissionRequest() ;
        tl.handleRequest(request);

        System.out.println("===========");

        //team leader处理加薪请求
        request = new AddMoneyRequest() ;
        pm.handleRequest(request);
        System.out.println("========");

        //项目经理上理辞职请求
        request = new LeaveRequest() ;
        tl.handleRequest(request);
    }
}
