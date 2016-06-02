package webprogramming.java3;

import java.io.IOException;

import javax.servlet.http.*;

public class RandomArray1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int i;
		int j;
		int randomInt;
		resp.getWriter().println("<table border=\"10\">");
		for (i = 0; i < 8; i++) {
			resp.getWriter().println("<tr>");
			for (j = 0; j < 5; j++) {
				randomInt = (int) (Math.random() * 100);
				if (randomInt < 10) {
					randomInt = 10;
				}
				resp.getWriter().println("<td>" + randomInt + "</td>");
			}
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
	}
}