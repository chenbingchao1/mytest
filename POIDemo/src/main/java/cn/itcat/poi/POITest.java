package cn.itcat.poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POITest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		HSSFWorkbook book = new HSSFWorkbook();

		HSSFSheet sheet = book.createSheet("test");
		
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("测试");
		book.write(new FileOutputStream("D:\\test.xls"));
	}

}
