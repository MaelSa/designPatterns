package ObserverPattern;

class View3 {
    private Student student;

    public View3(Student s) {
        this.student = s;
    }

    public void changeStudent() {
        // change the student
        student.setId(2);
    }
}