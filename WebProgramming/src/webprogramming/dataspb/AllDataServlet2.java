package webprogramming.dataspb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("serial")
public class AllDataServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain;;charset=UTF-8");
		InputStream in = new FileInputStream("WEB-INF/excel/Concert_organizations_2016-03-16.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(in);
//		ArrayList<ConcertOrganization> listOfConcertOrganization = new ArrayList<ConcertOrganization>();
//		Sheet sheet = wb.getSheetAt(0);
//		ArrayList<ConcertOrganization> list=ExcelParse.Parse();
//		ArrayList<String> tempListOfType=new ArrayList<String>();
//		ArrayList<String> listOfType = new ArrayList<String>();  
		resp.getWriter().println("<table id=\"data\" class=\"table table-striped table-bordered table-responsive display nowrap\"><tr>");
		Sheet sheet1 = wb.getSheetAt(0);
	    for (Row row : sheet1) {
	    	resp.getWriter().println("<tr>");
	        for (Cell cell : row) {
	        	resp.getWriter().println("<td>");
	            switch (cell.getCellType()) {
	                case Cell.CELL_TYPE_STRING:
	                	resp.getWriter().println(cell.getRichStringCellValue().getString());
	                    break;
	                case Cell.CELL_TYPE_NUMERIC:
	                	resp.getWriter().println((int) cell.getNumericCellValue());
	                    break;
	                case Cell.CELL_TYPE_BOOLEAN:
	                	resp.getWriter().println(cell.getBooleanCellValue());
	                    break;
	                case Cell.CELL_TYPE_FORMULA:
	                	resp.getWriter().println(cell.getCellFormula());
	                    break;
	                default:
	                    System.out.println();
	            }
	            resp.getWriter().println("</td>");
	        }
	        resp.getWriter().println("</tr>");
	    }
	    
//		for (ConcertOrganization organization: list)
//		{
//			tempListOfType.add(organization.getType());
//		 }
//		for (String type: tempListOfType)
//		{
//		  if (!listOfType.contains(type)) 
//		  {
//		    listOfType.add(type);
//		  }
//		 }
//		for(String type: listOfType){
//			resp.getWriter().println(type);
//		}
		
	}
}
