class Person {
    void displayPerson() {
        System.out.println("I am a person");
    }
}

// Derived class 1 (Multilevel inheritance)
class Student extends Person {
    void displayStudent() {
        System.out.println("I am a student");
    }
}

class Teacher extends Person {
    void displayTeacher() {
        System.out.println("I am a teacher");
    }
}

class CollegeStudent extends Student {
    void displayCollegeStudent() {
        System.out.println("I am a college student");
    }
}

public class Multilevel_Hierarchical {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.displayPerson();         
        cs.displayStudent();        
        cs.displayCollegeStudent(); 
        
        Teacher teacher = new Teacher();
        teacher.displayPerson();    
        teacher.displayTeacher();   
    }
}