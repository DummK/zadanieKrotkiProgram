class DaneStudentow {
    String name;
    String surname;
    int i = 0;

    int[] grades = new int[10];

    public DaneStudentow(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addGrade(int grade) {
        grades[i] = grade;
        i++;
    }

    public void showInformation() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println("Oceny: ");
        for(int j = 0; j <= grades.length; j++) {
            System.out.println((j+1) + ". " + grades[j]);
        }

    }
}


public class Main {
    public static void main(String[] args) {
        DaneStudentow d = new DaneStudentow("Kuba", "K");
        d.addGrade(5);
        d.addGrade(2);
        d.addGrade(1);
        d.addGrade(1);
        d.addGrade(3);
        d.addGrade(6);
        d.addGrade(6);
        d.addGrade(5);
        d.addGrade(3);
        d.addGrade(4);
        d.showInformation();

    }
}