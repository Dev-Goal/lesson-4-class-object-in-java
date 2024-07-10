package ss4_class_object;

import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    String name, email;
    LocalDate birthday;

    public Student(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public void learnIT(String subject){
        System.out.println(subject);
    }

    public void showStudent(){
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Email: " + email);
    }


}
