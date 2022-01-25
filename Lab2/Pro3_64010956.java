import java.util.Scanner;
public class Pro3_64010956 {
    public static void main(String[] args) {
        int day,month,year,h,k,j;
        String today=" ";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day :");
        day = input.nextInt();
        System.out.print("Enter month :");
        month = input.nextInt();
        System.out.print("Enter year :");
        year = input.nextInt();
        
        if(month<3){
            month+=12;
            year--;
        }
        j=year/100;
        k=year%100;

        h=(day+(26*(month+1)/10)+(k/4)+(j/4)+5*j)%7;
        switch(h){
            case 1 : today = "Sunday";
                break;
            case 2 : today = "Monday";
                break;
            case 3 : today = "Tuesday";
                break;
            case 4 : today = "Wednesday";
                break;
            case 5 : today = "Thursday";
                break;
            case 6 : today = "Friday";
                break;
            case 0 : today = "Saturday";
                break;
        }
        System.out.println("That day is "+today);


    }
}
