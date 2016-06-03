package webprogramming.dataspb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;

public class ExcelParse {
	public static ArrayList<ConcertOrganization> Parse() throws IOException {
		InputStream in = new FileInputStream("WEB-INF/excel/Concert_organizations_2016-03-16.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(in);
		ArrayList<ConcertOrganization> listOfConcertOrganization = new ArrayList<ConcertOrganization>();
		Sheet sheet = wb.getSheetAt(0);
		Iterator<Row> it = sheet.iterator();
		if (it.hasNext()) {
			it.next();
		}
		while (it.hasNext()) {
			Row row = it.next();
			ConcertOrganization tempConcertOrganization = new ConcertOrganization();
			switch (row.getCell(0).getCellType()) {
			case Cell.CELL_TYPE_NUMERIC:
				tempConcertOrganization.setNumber((int) row.getCell(0).getNumericCellValue());
				break;
			case Cell.CELL_TYPE_STRING:
				tempConcertOrganization.setNumber(Integer.parseInt(row.getCell(0).getStringCellValue()));
				break;
			}
			
			tempConcertOrganization.setFullName(row.getCell(1).getStringCellValue());
			tempConcertOrganization.setShortName(row.getCell(2).getStringCellValue());
			tempConcertOrganization.setType(row.getCell(3).getStringCellValue());
			tempConcertOrganization.setAddress(row.getCell(4).getStringCellValue());
			tempConcertOrganization.setLegalAddress(row.getCell(5).getStringCellValue());
			tempConcertOrganization.setDistrict(row.getCell(6).getStringCellValue());
			tempConcertOrganization.setNearestSubway(row.getCell(7).getStringCellValue());
			tempConcertOrganization.setDirector(row.getCell(8).getStringCellValue());
			tempConcertOrganization.setPhone(row.getCell(9).getStringCellValue());
			tempConcertOrganization.setFax(row.getCell(10).getStringCellValue());
			tempConcertOrganization.setEmail(row.getCell(12).getStringCellValue());
			tempConcertOrganization.setMunicipality(row.getCell(13).getStringCellValue());
			try {
				tempConcertOrganization.setInn(Long.parseLong(row.getCell(14).getStringCellValue()));
			} catch (NumberFormatException e) {
			}
			try {
				tempConcertOrganization.setOgrn(Long.parseLong(row.getCell(15).getStringCellValue()));
			} catch (NumberFormatException e) {
			}
			listOfConcertOrganization.add(tempConcertOrganization);
		}
		return listOfConcertOrganization;
	}
}