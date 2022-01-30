package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Васильевич", "Теория и расчет энергосистем для отопления аграрных систем в условиях Антарктики");
        Student student = new Student("Олежка");
        teacher.evaluate(student);

    }
}
