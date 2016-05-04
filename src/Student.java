import java.io.Serializable;

/**
 * Created by avl on 04/05/2016.
 */
public class Student implements Serializable {
    private int studentID;
    private String nameFirst;
    private String nameLast;

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }
}
