package com.github.perscholas;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * Created by leon on 9/15/2020.
 */
public class ControllerInterceptor extends HandlerInterceptorAdapter {
    private void log(String info, Object... args) {
        Logger.getLogger(getClass().getSimpleName()).info(String.format(info, args));
    }

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) {
        log("A request has been issued!");
        String requestLog = "Incoming request is\n\t\t%s";
        String responseLog = "Outgoing response is\n\t\t%s";
        log(requestLog, request);
        log(responseLog, response);
        return true;
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        log("A request has been completed!");
        String requestLog = "Incoming request is\n\t\t%s";
        String responseLog = "Outgoing response is\n\t\t%s";
        log(requestLog, request);
        log(responseLog, response);
    }
}