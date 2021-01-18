package package11syou;
//init()/destroy()を持つサーブレットクラス
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Code111
 */
@WebServlet("/Code111")
public class Code111 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//訪問回数
	private Integer count;


   public void init(ServletConfig config) throws ServletException{
	   super.init(config);

	   //訪問回数を初期化
	   count = 0;


	   //訪問回数を表すIntegerインスタンスを新規作成しアプリケーションスコープに保存
	   Integer count =0;
	   ServletContext application =config.getServletContext();
	   application.setAttribute("count",count);

	   System.out.println("init()が実行されました");
   }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//アプリケーションスコープに保存された訪問回数を保存
		ServletContext application = this.getServletContext();
		Integer count = (Integer) application.getAttribute("count");

		//訪問回数を増加

		count++;
		application.setAttribute("count", count);

		//HTMLを出力
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>訪問回数を表示</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>訪問回数:"+ count +"</p>");
		out.println("<a href =\"/ServletJSP(&J)/package11syou/Code111\">更新</a>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy() {
		System.out.println("destroy()が実行されました");
	}
}
