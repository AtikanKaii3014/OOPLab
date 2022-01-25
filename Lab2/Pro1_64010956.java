import java.util.Scanner;
class Pro1_64010956{
    public static void main(String[] args) {
        int todaynum,elapsed,future;
        String today =" ";
        String futureday=" ";
        System.out.print("Enter today's day:");
        Scanner input = new Scanner(System.in);
        todaynum = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        Scanner input2 = new Scanner(System.in);
        elapsed = input2.nextInt();
        future = (todaynum + elapsed) % 7;
        switch(todaynum){
            case 0 : today = "Sunday";
                break;
            case 1 : today = "Monday";
                break;
            case 2 : today = "Tuesday";
                break;
            case 3 : today = "Wednesday";
                break;
            case 4 : today = "Thursday";
                break;
            case 5 : today = "Friday";
                break;
            case 6 : today = "Saturday";
                break;
        }
        switch(future){
            case 0 : futureday = "Sunday";
                break;
            case 1 : futureday = "Monday";
                break;
            case 2 : futureday = "Tuesday";
                break;
            case 3 : futureday = "Wednesday";
                break;
            case 4 : futureday = "Thursday";
                break;
            case 5 : futureday = "Friday";
                break;
            case 6 : futureday = "Saturday";
                break;
        }
        System.out.println("Today is "+ today + " and the future day is "+ futureday);

    }
}