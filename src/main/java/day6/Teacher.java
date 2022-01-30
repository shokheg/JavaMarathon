package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;


    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int z = random.nextInt(4) + 2;
        String result;
        switch (z){
            case 2:
                result = "неудовлетворительно";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 4:
                result = "хорошо";
                break;
            case 5:
                result = "отлично";
                break;
            default:
                throw new IllegalArgumentException("Неверная оценка "+z);


        }


        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.name +  " по предмету " + this.subject + " на оценку " + result + ".");

    }
}

