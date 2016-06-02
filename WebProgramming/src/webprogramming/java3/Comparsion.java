package webprogramming.java3;

import java.io.IOException;

import javax.servlet.http.*;

public class Comparsion extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		try {
			double doublem = Double.parseDouble(req.getParameter("doublem"));
			double doublen = Double.parseDouble(req.getParameter("doublen"));

			if (Math.abs(doublem - 10) < Math.abs(doublen - 10)) {

				resp.getWriter().println(" ����� " + doublem + " ����� � 10 ��� " + doublen);
			} else {
				resp.getWriter().println(" ����� " + doublen + " ����� � 10 ��� " + doublem);
			}
		} catch (NumberFormatException n) {
			resp.getWriter().println("� ����� m � n ������ ���� �����");
		}
	}
}