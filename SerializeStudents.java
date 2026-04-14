package StudentRecords;
import java.io.*;
import java.util.*;
public class SerializeStudents {
	public static void main(String[] args) {
		try {
			List<Student> list = new ArrayList<>();
			list.add(new Student(101, "John", 85.5, "pass123"));
            list.add(new Student(102, "Ravi", 90.0, "secret"));
            list.add(new Student(103, "Anu", 88.0, "mypwd"));
            
            FileOutputStream  fos = new FileOutputStream("students.ser");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(list);
            oos.close();

            System.out.println("Serialization complete!");

		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
