package package9syou.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import package9syou.model.SiteEV;
import package9syou.model.SiteEVLogic;

/**
 * Servlet implementation class MinatoIndex
 */
@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//アプリケーションスコープに保存されたサイト評価を取得
		ServletContext application =this.getServletContext();
		SiteEV siteEV =(SiteEV) application.getAttribute("siteEV");

		//サイト評価の初期値（初回リクエスト実行時）
		//siteEVの反応がないときはnullを示す。またインスタンスを作成する
		if(siteEV == null) {
			siteEV = new SiteEV();
		}

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		//サイトの評価処理（初回リクエストは実行しない）
		//SiteEVLogicのインスタンスをつくってnullでないかつ反応があるときに実行
		SiteEVLogic siteEVLogic = new SiteEVLogic();
		if(action != null && action.equals("retweet")) {
			siteEVLogic.retweet(siteEV);
		}else if(action != null && action.equals("Favorite")) {
			siteEVLogic.favorite(siteEV);
		}

		//アプリケーションスコープにサイト評価を保持
		application.setAttribute("siteEV", siteEV);

		//フォワードを送る
		RequestDispatcher dispatcher = request.getRequestDispatcher
		("/WEB-INF/jsp/minatoIndex.jsp");
		dispatcher.forward(request,response);
	}
}
