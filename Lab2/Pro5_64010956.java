import java.util.Scanner;
public class Pro5_64010956 {
    public static void main(String[] args) {
        int inp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        inp = input.nextInt();
        for(int j=1;j<=inp;j++){
            for(int i= -inp;i<inp;i++){
                if(Math.abs(i)<j){
                    System.out.print((Math.abs(i)+1)+" ");
                }else{System.out.print("  ");}

            }
            System.out.print("\n");
        }
    }
}
