package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class HttpServletDemo extends HttpServlet
{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		res.setContentType("text/html");
		Date d= new Date();
		PrintWriter pw = res.getWriter();
		pw.print("<html>");
		pw.print("<head><title>Servlet Interface Demo</title></head>");
		pw.print("<body>");
		pw.print("<h2>Servlet creted using Servlet Interface @"+d.toString()+"</h2>");
		pw.print("</body>");
		pw.print("</html>");
	}
}
