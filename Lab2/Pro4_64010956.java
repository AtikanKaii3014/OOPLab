import java.util.Scanner;
public class Pro4_64010956 {
    public static void main(String[] args) {
        String first="",second="",third="",a="",b="",c="";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city :");
        first = input.nextLine();
        System.out.print("Enter the second city:");
        second = input.nextLine();
        System.out.print("Enter the third city:");
        third = input.nextLine();
        char f = first.charAt(0);
        char s = second.charAt(0);
        char t = third.charAt(0);
        
        if(f<s&&f<t&&s<t){a=first;b=second;c=third;}
        else if(f<s&&f<t&&s>t){a=first;b=third;c=second;}
        else if(s<f&&s<t&&f<t){a=second;b=first;c=third;}
        else if(s<f&&s<t&&f>t){a=second;b=third;c=first;}
        else if(t<f&&t<s&&f<s){a=third;b=first;c=second;}
        else if(t<f&&t<s&&f>s){a=third;b=second;c=first;}

        System.out.println("The three cities in alphabetical order are "+a+" "+b+" "+c);
    }
}
