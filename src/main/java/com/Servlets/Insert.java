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
import java.sql.Statement;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String date = request.getParameter("date");
		out.println(date);
		String source = request.getParameter("from");
		out.println(source);
		String distiniation = request.getParameter("to");
		out.println(distiniation);
		String NoPeople = request.getParameter("NoPeople");
		out.println(NoPeople);
		//String FlightID = request.getParameter("flightID");

		try {
			InputStream in=getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			Properties props=new Properties();
			props.load(in);
			Connection conn=Config.getconnection(props.getProperty("url"), props.getProperty("user"),
					props.getProperty("password"));
			out.println("connected!");
			
			
			PreparedStatement pst=conn.prepareStatement
					("insert into flights (date, source, distiniation, NoPeople)  VALUES (?, ?, ?, ?)");
			pst.setString(1, date);
			pst.setString(2, source);
			pst.setString(3, distiniation);
			pst.setString(4, NoPeople);
		//	pst.setString(5, FlightID);
			
			int x=pst.executeUpdate();
			System.out.println("Records Updated "+x);
			pst.close();
			out.print("pst closed");
			conn.close();
			out.print("conn closed");


			
		} catch (Exception e) {
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
