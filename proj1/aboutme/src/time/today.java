package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class today
 */
@WebServlet("/today")
public class today extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public today() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		SimpleDateFormat format = new SimpleDateFormat ("yyyy/MM/dd HH:mm");
		Calendar time = Calendar.getInstance();
		String print_time=format.format(time.getTime());
		out.print("<html>");
		out.print("<head><title>today</title></head>");
		out.print("<body>");
		out.print("<p style='font-size: 15pt;'><a href='/aboutme/index.html'>메인화면</a></p>");
		out.print("<br><br><br><br><br><br><br>");
		out.print("<h1><center>현재시간: " + print_time);
		out.print("</center></h1>");
		out.print("</body>");
		out.print("</html>");
	}


}
