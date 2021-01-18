package package3syou;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EX1
 */
@WebServlet(name = "EX1", urlPatterns = { "/EX1" })
public class EX1 extends HttpServlet {

	protected void doGet(HttpServlet Request request, HttpServletResponse response)
	throws ServletException , IOException{
		//UTF-8のHTMLをレスポンス
		response.setContentType("text/html;charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Hello</body></html>");
	}

}
