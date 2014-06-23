package cn.bling.chapter5.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HandlerInterceptor4 extends HandlerInterceptorAdapter {//此处一般继承HandlerInterceptorAdapter适配器即可

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========HandlerInterceptor4 afterCompletion"); 
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========HandlerInterceptor4 postHandle");
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========HandlerInterceptor4 preHandle");
		response.getWriter().print("break");//流程中断的话需要我们进行响应的处理  
	    return false;//返回false表示流程中断      
	}
	
}
