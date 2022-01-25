import java.util.Scanner;

public class Pro3_64010956 {
    public static void main(String[] args) {
        int inp,sum = 0;
        System.out.println("Enter a number between 0 and 1000:"); 
        Scanner input = new Scanner(System.in);
        inp = input.nextInt();
        while (inp > 0){
            sum += inp % 10;
            inp = inp / 10;
        }
        System.out.println("The sum of the digits is "+sum);
    }
}