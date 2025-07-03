package OOP.Interface;

public class Main {

    public static void main(String[] args) {

        Lecterur lec1= new Lecterur();
        underGraduate UG1= new underGraduate();

        lec1.teach();
        UG1.study();
        postGraduate pg1= new postGraduate();

        pg1.teach();
        pg1.study();
    }
}
