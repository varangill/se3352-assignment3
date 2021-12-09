package models;

public class User {
    private String studentNumber;
    private String StudentName;
    private String professorNumber;
    private Professor ProfessorName;

    public User(String studentID, String name, String professorID, Professor professor) {
        this.studentNumber = studentID;
        this.StudentName = name;
        this.professorNumber = professorID;
        this.ProfessorName = professor;
    }
    public String getstudentNumber() {return studentNumber;}

    public void setStudentNumber(String studentNumber) {this.studentNumber = studentNumber;}

    public String getStudentName() {return StudentName;}

    public void setStudentName(String StudentName) {this.StudentName = StudentName;}

    public String getprofessorNumber() {return professorNumber;}

    public void SetprofessorNumber(String professorNumber) {this.professorNumber = professorNumber;}

    public Professor getProfessorName() {return ProfessorName;}

    public void setProfessorName(Professor ProfessorName) {this.ProfessorName = ProfessorName;}

   
}
