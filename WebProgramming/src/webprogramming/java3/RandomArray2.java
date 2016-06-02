package webprogramming.java3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.servlet.http.*;

@SuppressWarnings({ "serial", "unused" })
public class RandomArray2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int i;
		int j;
		int randomInt;
		int max = 0;
		int[] arrayInt = new int[8 * 5];
		for (j = 0; j < 8 * 5; j++) {
			randomInt = (int) (Math.random() * 10);
			if (randomInt < 5) {
				randomInt = -(int) (Math.random() * 100);
			} else {
				randomInt = (int) (Math.random() * 100);
			}
			if (j == 0) {
				max = randomInt;
			} else {
				if (randomInt > max) {
					max = randomInt;
				}
			}
			arrayInt[j] = randomInt;
		}

		resp.getWriter().println("<table border=\"10\">");
		for (i = 0; i < 8; i++) {
			resp.getWriter().println("<tr>");
			for (j = 0; j < 5; j++) {

				resp.getWriter().println("<td>" + arrayInt[i * 5 + j] + "</td>");
			}
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
		resp.getWriter().println("<p>Максимальное значение в массиве " + max + " </p>");
	}
}