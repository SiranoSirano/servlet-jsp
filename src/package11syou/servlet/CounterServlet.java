package package11syou.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Integer count; //訪問回数

	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);

		//		サイトへの訪問回数を示すIntegerインスタンスを新規作成して
		//		アプリケーションスコープに保存
		count =0;
		ServletContext application = config.getServletContext();
		application.setAttribute("count",count);

		System.out.println("init()が実行されました");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// アプリケーションスコープに保存されたアクセス回数を増加する
		ServletContext application = this.getServletContext();
		Integer count = (Integer) application.getAttribute("count");
		//		訪問回数を増加
		count++;
		application.setAttribute("count", count);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Counter.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		System.out.println("destroy()が実行されました");
	}

}
