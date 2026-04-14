package StudentRecords;
import java.io.*;
import java.util.*;
public class DeserializeStudents {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("students.ser");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            List<Student> list = (List<Student>) ois.readObject();

            for (Student s : list) {
                System.out.println(s);
            }

            ois.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
