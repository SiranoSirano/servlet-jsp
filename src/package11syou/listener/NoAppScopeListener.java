package package11syou.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;




@WebListener
public class NoAppScopeListener implements ServletContextAttributeListener {
	public void attributeAdded(ServletContextAttributeEvent args)  {
		System.out.println("警告：アプリケーションスコープにインスタンスを保存することは禁止されています");
   }

    public void attributeRemoved(ServletContextAttributeEvent arg) {}
    public void attributeReplaced(ServletContextAttributeEvent arg) {}

}
