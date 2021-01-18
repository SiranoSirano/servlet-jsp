package package7syou2kaime.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import package7syou2kaime.model.Health;
import package7syou2kaime.model.HealthCheckLogic;
/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher
				("/WEB-INF/jsp/healthCheck.jsp");
		dispatcher.forward(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		//リクエストパラメータを取得(get)
		//体重
		String weight =request.getParameter("weight");
		//身長
		String height = request.getParameter("height");

		//入力値をプロパティに設定(入力＝set)
		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		//健康診断を実施して結果を設定,HealthCheckLogicに値を渡して判定してもらっている

		HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
		healthCheckLogic.execute(health);

		//リクエストスコープに保存
		request.setAttribute("health", health);

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
		dispatcher.forward(request,response);

	}

}
