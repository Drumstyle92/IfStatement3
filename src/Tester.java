/**
 * @author Drumstyle92
 * Class that contains the main method.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method where we find an object creation and a method where it shows its variables and a comparison.
     */
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
         Student student1 = new Student("Dante",20);
         student1.guessingAge();
        System.out.println("-------------------------------------------------");
    }
}