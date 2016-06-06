package webprogramming.dataspb;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ChooseTypeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;;charset=UTF-8");
		String type = req.getParameter("type");
		ArrayList<ConcertOrganization> list = ExcelParse.Parse();
		resp.getWriter().println(
				"<table id=\"data\" class=\"table table-striped table-bordered table-responsive display nowrap\">");
		resp.getWriter()
				.println("<tr><td>Название</td><td>Тип</td><td>Район города</td><td>Телефон</td><td>Адрес</td></tr>");
		for (ConcertOrganization organization : list) {
			if (organization.getType().equals(type)) {
				resp.getWriter().println("<tr>");
				resp.getWriter()
						.println("<td>" + organization.getShortName() + "</td><td>" + organization.getType()
								+ "</td><td>" + organization.getDistrict() + "</td><td>" + organization.getPhone()
								+ "</td><td>" + organization.getAddress() + "</td>");
				resp.getWriter().println("</tr>");
			}
		}
		resp.getWriter().println("</table>");
	}
}
