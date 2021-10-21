package com.Servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import com.Classes.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Statement;


/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      PrintWriter out = response.getWriter();
		      HttpSession session=request.getSession();
				response.setContentType("text/html");
		      String date = request.getParameter("date");
				//out.println(date);
				String source = request.getParameter("source");
				//out.println(source);
				String distiniation = request.getParameter("distiniation");
				//out.println(distiniation);
				String NoPeople = request.getParameter("NoPeople");
				//out.println(NoPeople);
		
		try {
			InputStream in=getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			Properties props=new Properties();
			props.load(in);
			Connection conn=Config.getconnection(props.getProperty("url"), props.getProperty("user"),
					props.getProperty("password"));
			//out.println("connected!");
			
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery("select * from flights");
			boolean res = false;
			
			
			while(result.next()) {
				String date2 = result.getString("date");
				String source2 = result.getString("source");
				String distiniation2 = result.getString("distiniation");
				String NoPeople2 = result.getString("NoPeople");
				if(date2.equals(date) && source2.equals(source) && distiniation2.equals(distiniation) && NoPeople2.equals(NoPeople)) {
				res=true;
				out.print("ticket found see the details:  ");
				
				
			    
				/*
				UserDate =result.getString("date");
			    session.setAttribute("date", OkDate);
			    
				 UserSource =result.getString("soure");
				 session.setAttribute("source", UserSource);
				 
				 UserDistiniation =result.getString("distiniation");
				 session.setAttribute("distiniation", UserDistiniation);
				 
				 UserNoPeople =result.getString("NoPeople");
				 session.setAttribute("NoPeople", UserNoPeople);
				 */
				
				
				
				out.println(result.getString("date")+" "+result.getString("source")+
						" "+result.getString("distiniation")+" "+result.getString("NoPeople"));
				}
			}
			
			String a = request.getParameter("date");
			String b = request.getParameter("source");
			String c = request.getParameter("distiniation");
			String d = request.getParameter("NoPeople");
			     if(res==false)
                  out.print("no tick found");
			     else {
			    	 
			    	 session.setAttribute("a", a);
			    	 session.setAttribute("b", b);
			    	 session.setAttribute("c", c);
			    	 session.setAttribute("d", d);
			    	 out.println("<a href='Register.html'>book the ticket</a>");
			     }
		} 
		catch (Exception e) {
			out.print("poblem occured");
		}
			
	}
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
