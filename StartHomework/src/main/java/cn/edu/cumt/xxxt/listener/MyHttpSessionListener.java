package cn.edu.cumt.xxxt.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener{
private static int count;
	

	public MyHttpSessionListener() {
		
	}
	
	public void sessionCreated(HttpSessionEvent se) {
		count++;
		se.getSession().getServletContext().setAttribute("count", count);
	}
	
    public void sessionDestroyed(HttpSessionEvent se) {
		count--;
		se.getSession().getServletContext().setAttribute("count", count);
	}
    
    public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MyHttpSessionListener.count = count;
	}

}
