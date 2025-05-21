package Stream;
// Data input stream is used to store the data in its original formata unlike printstream
// which stores data in string format only and you have to covert that all the time 
// int their original data type in order to use
import java.io.*;
//drawbacks:-we have to use different write and read methods for storing values of diff datatype
// solution  use object stream
class Student {
 int id;
 String name;
 double grade;
}

public class StudentDataStreamExample {

 // Static method to write student data to file
 public static void writeStudentData() {
     Student student = new Student();
     student.id = 101;
     student.name = "Alice";
     student.grade = 92.5;

     try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("studentData.txt"))) {
         dos.writeInt(student.id);
         dos.writeUTF(student.name);
         dos.writeDouble(student.grade);
         System.out.println("Data written successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }

 // Static method to read student data from file
 public static void readStudentData() {
     Student student = new Student();

     try (DataInputStream dis = new DataInputStream(new FileInputStream("studentData.txt"))) {
         student.id = dis.readInt();
         student.name = dis.readUTF();
         student.grade = dis.readDouble();

         System.out.println("Student Data:");
         System.out.println("ID: " + student.id);
         System.out.println("Name: " + student.name);
         System.out.println("Grade: " + student.grade);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }

 // Main method to call write and read methods
 public static void main(String[] args) {
     writeStudentData();  // Writing data to file
     readStudentData();   // Reading data from file
 }
}

