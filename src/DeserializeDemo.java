import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by avl on 04/05/2016.
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Student student = new Student();

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.ser"));
            student = (Student) input.readObject();
            input.close();
        } catch(Exception ex){
            System.err.println("Uh oh, there was an error: " + ex.getMessage());
        }

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Name: " + student.getNameFirst() + " " + student.getNameLast());
    }
}
