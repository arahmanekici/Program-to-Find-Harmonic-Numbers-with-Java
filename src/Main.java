import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        double total= 0;
        double number1=0;

        for (int i=1; i<=number; i++){

            number1= 1.0/i;
            total+= number1;


        }
        System.out.println(total);
    }
}
