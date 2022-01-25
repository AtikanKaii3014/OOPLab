import java.util.Scanner;

public class Pro4_64010956 {
    public static void main(String[] args) {
        float weight,height,BMI;
        System.out.print("Enter weight in pounds: ");
        Scanner inputw = new Scanner(System.in);
        weight = inputw.nextFloat();
        System.out.print("Enter height in inches: ");
        Scanner inputh = new Scanner(System.in);
        height = inputh.nextFloat();
        weight *= 0.45359237;//pound ->kg
        height *= 0.0254;//inches ->m
        BMI = weight/(height*height);
        System.out.println("BMI is "+BMI);
    }
}