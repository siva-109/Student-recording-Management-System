package StudentRecords;
import java.io.*;
public class PrintReport {
	public static void main(String[] args) {
		try {
			File nfile =new File("output.txt");
			PrintWriter pw = new PrintWriter(nfile);
			pw.println(" STUDENT REPORT ");
			pw.println("----------------");
			pw.println("ID   NAME  MARKS");
			pw.println("101  John   85.5");
			pw.println("102  Ravi   90.0");
			pw.println("103  Anu    88.0");
			
			pw.close();
			System.out.println("Reports Generated");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
