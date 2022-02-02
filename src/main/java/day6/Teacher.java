package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Random random = new Random();


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
            default:               //предлагаю оставить так или как было изначально чтобы идея не ругалась на result may be not initialize
                result = "Что-то пошло не так";
        }


        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.name +  " по предмету " + this.subject + " на оценку " + result + ".");

    }
}

