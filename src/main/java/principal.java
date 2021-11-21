import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args)throws IOException, BiffException {
		
		Workbook workbook = Workbook.getWorkbook(new File("/home/deca/Documentos/guaDados.xls"));
		
		Sheet sheet = workbook.getSheet(0);
		int linhas = sheet.getRows();
		
		System.out.println("Iniciando a leitura da planilha XLS:");

	       

		for(int i = 0; i < 170; i++){
			
			Cell a1 = sheet.getCell(0, i);

			Cell a2 = sheet.getCell(1, i);

			Cell a3 = sheet.getCell(2, i);
			
			Cell a4 = sheet.getCell(3, i);
					
			String as1 = a1.getContents();

			String as2 = a2.getContents();

			String as3 = a3.getContents();
			
			String as4 = a4.getContents();
			
			System.out.println("Coluna 1: " + as1);

			System.out.println("Coluna 2: " + as2);

			System.out.println("Coluna 3: " + as3);
			
			System.out.println("Coluna 4: " + as4);
			
		}
		
		workbook.close();

	}

}
