# Student Record Management System - Java

A beginner-friendly Java project that covers core File Handling and Serialization concepts.

## 📋 Topics Covered

- File creation using File class
- Writing data using FileWriter and BufferedWriter
- Reading data using FileReader and BufferedReader
- Formatted output using PrintWriter
- Object Serialization using ObjectOutputStream
- Object Deserialization using ObjectInputStream
- transient keyword to skip password during serialization

## 🗂️ Project Structure

| File | Description |
|------|-------------|
| Student.java | Student class implementing Serializable |
| Part2WriteFile.java | Writes student records to students.txt |
| Part3ReadFile.java | Reads and displays students.txt |
| Part4Report.java | Writes formatted report to output.txt |
| Part5Serialize.java | Serializes Student objects to students.ser |
| Part6Deserialize.java | Deserializes and displays Student objects |
| Main.java | Entry point — calls all parts in order |

## ▶️ How to Run

1. Clone the repository
   git clone https://github.com/your-username/student-record-management-system-java.git

2. Navigate to the folder
   cd student-record-management-system-java

3. Compile all files
   javac Student.java Part2WriteFile.java Part3ReadFile.java Part4Report.java Part5Serialize.java Part6Deserialize.java Main.java

4. Run the program
   java Main

## ✅ Expected Output

File Read:
101,John,85.5
102,Ravi,90.0
103,Anu,88.0
Deserialization Output:
Student{id=101, name='John', marks=85.5, password=null}
Student{id=102, name='Ravi', marks=90.0, password=null}
Student{id=103, name='Anu', marks=88.0, password=null}

## 💡 Key Concept

The password field is marked as transient in the Student class.
This means it is NOT saved during serialization.
After deserialization, password will always be null — proving the transient keyword works correctly.

## 🛠️ Requirements

- Java JDK 8 or above
- Any IDE (Eclipse, IntelliJ, VS Code) or command line
