import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by avl on 04/05/2016.
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID(5);
        student.setNameFirst("Thomas");
        student.setNameLast("Jefferson");

        try
        {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("student.ser"));
            output.writeObject(student);
            output.close();
        } catch(Exception ex)
        {
            System.err.println("Uh oh, something went wrong: " + ex.getMessage());
        }
    }
}
