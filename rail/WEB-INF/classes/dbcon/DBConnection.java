package dbcon;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class DBConnection implements ServletContextListener{
	public void contextInitialized(ServletContextEvent e){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rail","rail");
			ServletContext context=e.getServletContext();
			context.setAttribute("con",c);
		}
		catch(Exception ee)
		{}
	}
	public void contextDestroyed(ServletContextEvent e)
	{}
}