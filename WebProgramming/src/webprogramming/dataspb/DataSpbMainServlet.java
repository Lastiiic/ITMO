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
		ConcertOrganization temp1;
		String tempString;
		ArrayList<String> listOfType=new ArrayList<String>();
		Iterator<ConcertOrganization> it=list.iterator();
		int i=0;
		int j=0;
		while(it.hasNext()){
			temp1=it.next();
			listOfType.add(temp1.getType());
		}
		while(i<list.size()-1){
			tempString=listOfType.get(i);
			j=i+1;
			while(j<list.size()){
				if(tempString.equals(listOfType.get(j))){
					listOfType.remove(j);
				}
				j++;
			}
			i++;
		}
		for(i=0;i<listOfType.size();i++){
			resp.getWriter().println(listOfType.get(i));
		}
		
		
	}
}
