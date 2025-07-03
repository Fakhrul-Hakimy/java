package OOP.Interface;

public class postGraduate implements Student, Teacher {

    @Override
    public void study() {
        System.out.println("Study PG");
    }

    @Override
    public void teach() {
        System.out.println("Teach UG");
    }
}
