package webprogramming.java3;

import java.io.IOException;

import javax.servlet.http.*;

public class QuadraticEquation extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		try {
			double doublea = Double.parseDouble(req.getParameter("doublea"));
			double doubleb = Double.parseDouble(req.getParameter("doubleb"));
			double doublec = Double.parseDouble(req.getParameter("doublec"));
			double discriminant = Math.pow(doubleb, 2) - 4 * doublea * doublec;
			double x1;
			double x2;
			if (discriminant > 0) {
				discriminant = Math.sqrt(discriminant);
				x1 = -(doubleb + discriminant) / (2 * doublea);
				x2 = -(doubleb - discriminant) / (2 * doublea);
				resp.getWriter().println("<p>X1=" + x1 + "</p><p>X2=" + x2 + "</p>");
			} else if (discriminant == 0) {
				x1 = -(doubleb) / (2 * doublea);
				resp.getWriter().println(
						"<p>”равнение имеет только 1 корень, так как дискриминант равен 0</p>" + "<p>X=" + x1 + "</p>");
			} else if (discriminant < 0) {
				resp.getWriter().println("<p>”равнение не имеет корней, так как дискриминант меньше 0</p>");
			}
		} catch (NumberFormatException n) {
			resp.getWriter().println("<p>¬ пол€х a, b и c должны быть числа</p>");
		}
	}
}