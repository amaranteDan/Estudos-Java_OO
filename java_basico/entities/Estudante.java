package java_basico.entities;

public class Estudante {
    public String name;
    public String serie;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String toString() {
        return "Estudante [name=" + name + ", serie=" + serie + ", grade1=" + grade1 + ", grade2=" + grade2
                + ", grade3=" + grade3 + "]";
    }

    public double pontosFaltantes() {
        if (finalGrade() < 7.0) {
            return 7.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

}
