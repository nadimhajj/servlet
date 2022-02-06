import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns={"/maservlet"})
public class HelloServlet extends HttpServlet {
 public void service( HttpServletRequest request,HttpServletResponse response ) throws ServletException, IOException {
response.setContentType( "text/html" );
PrintWriter out = response.getWriter();
out.println( "<html><body>" );
out.println( "<h1>Bonjour Nadim</h1>" );
out.println( "</body></html>" );
 }
}