package webprogramming.dataspb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DataSpbMainServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain;;charset=UTF-8");
		ArrayList<ConcertOrganization> list=ExcelParse.Parse();
		ArrayList<String> tempListOfType=new ArrayList<String>();
		ArrayList<String> listOfType = new ArrayList<String>();  
		for (ConcertOrganization organization: list)
		{
			tempListOfType.add(organization.getType());
		 }
		for (String type: tempListOfType)
		{
		  if (!listOfType.contains(type)) 
		  {
		    listOfType.add(type);
		  }
		 }
		for(String type: listOfType){
			resp.getWriter().println(type);
		}
		
	}
}
