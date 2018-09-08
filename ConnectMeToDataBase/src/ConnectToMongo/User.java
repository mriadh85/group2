package ConnectToMongo;

public class User {

    String studentName;
    String studentID;
    String studentDOB;

    public User(){}

    public User( String studentName, String studentID){
        this.studentName = studentName;
        this.studentID = studentID;

    }
    public User(String studentName, String studentID, String studentDOB){
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentDOB = studentDOB;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

}

