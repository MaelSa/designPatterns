package ObserverPattern;

public class ObserverExample {
    public static void main(String[] args) {
        // create the subject
        Student s = new Student(1, "A", "1991-01-01");

        // create observers and register them
        Observer o1 = new View1(s);
        Observer o2 = new View2(s);
        s.register(o1);
        s.register(o2);

        // change subject
        View3 v = new View3(s);
        v.changeStudent();
    }
}