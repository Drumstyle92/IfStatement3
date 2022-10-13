import java.util.Random;

/**
 * @author Drumstyle92
 * class with student name and variable and a method with an if to make a comparison.
 */
public class Student {
    /**
     * student's name.
     */
    public String name;
    /**
     * age of the student.
     */
    public int age;

    /**
     * @param studentName enter student name.
     * @param studentAge student age entry.
     * constructor class with name and age parameters.
     */
    public Student(String studentName,int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    /**
     * method with a random number inside and with an if used to compare the student's age with the random number.
     */
    public void guessingAge(){
        Random casualNumber = new Random();
        int number = casualNumber.nextInt(35);

        System.out.println("I generated the random number " + number + " for student " + this.name);

        if(this.age == number){
            System.out.println("the random value is equal");
    }else if(this.age < number){
            System.out.println("the random value is greater");
        }else{
            System.out.println("the random value is lower");
        }
    }
}
