package com.sangram.interceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfTheWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = Calendar.getInstance();
		int dayoftheweek = cal.get(7);
		if(dayoftheweek==1)
		{
			response.getWriter().write("<html><center><h1 style='color:navy'>SORRY,THIS WEBSITE IS CLOSED FOR TODAY</h1></center></html>");
			return false ;
		}
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptorAdaptor: Spring-MVC called postHandle() Method after processing the request by request handler method present in the controller class.");
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
        System.out.println("HandlerInterceptorAdaptor: Spring-MVC called afterCompletion() method after processing the view");
	}
}
