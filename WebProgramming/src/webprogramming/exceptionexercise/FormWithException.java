package webprogramming.exceptionexercise;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FormWithException extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		String var2 = req.getParameter("var2");
		String var3 = req.getParameter("var3");
		String var4 = req.getParameter("var4");
		String result = "";
		try {
			if (var1.length() == 0) {
				throw new ExceptionLength();
			}
		} catch (ExceptionLength l) {
			// resp.getWriter().println("<p>Поле имени должно быть заполнено</p>");
			result += "<p>Поле имени должно быть заполнено</p>";
		}
		try {
			if (var2.length() == 0) {
				throw new ExceptionLP();
			}
		} catch (ExceptionLP l) {
			// resp.getWriter().println("<p>Поле имени должно быть заполнено</p>");
			result += "<p>Поле имени должно быть заполнено</p>";
		}
		try {
			if (var4.length() == 0) {
				throw new ExceptionLE();
			}
		} catch (ExceptionLE l) {
			// resp.getWriter().println("<p>Поле имени должно быть заполнено</p>");
			result += "<p>Поле имени должно быть заполнено</p>";
		}
		try {
			if (!var2.equals(var3)) {
				throw new ExceptionEqual();
			}
		} catch (ExceptionEqual l) {
			// resp.getWriter().println("<p>Поля пароля не совпадают</p>");
			result += "<p>Поля пароля не совпадают</p>";
		}
		try {
			if ((var4.indexOf("@") == -1)
					& (var4.indexOf(".", var4.indexOf("@")) == -1)) {
				throw new ExceptionEmail();
			}
		}

		catch (ExceptionEmail l) {
			// resp.getWriter().println("<p>Email неправильный</p>");
			result += "<p>Email неправильный</p>";
		}
		resp.getWriter().println(result);
	}
}
