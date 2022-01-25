import java.util.Scanner;
public class Pro2_64010956 {
    public static void main(String[] args) {
        int inp,com;
        String inps =" ",coms=" ";
        String result =" ";
        System.out.print("scissor (0), rock (1), paper (2):");
        Scanner input = new Scanner(System.in);
        inp = input.nextInt();
        com = (int) (Math.random() * 3);
        if(com==inp){
            result="draw";
            if(com==0){coms="scissor";inps="scissor";}
            if(com==1){coms="rock";inps="rock";}
            if(com==2){coms="paper";inps="paper";}
            System.out.println("The computer is "+ coms +". You are "+inps+" too. It is a draw");
        }else{
            switch(inp){
                case 0 :inps="scissor";
                        if(com==1){result="lose";coms="rock";}
                        if(com==2){result="won";coms="paper";}
                         break;
                case 1 :inps="rock";
                        if(com==0){result="won";coms="scissor";}
                        if(com==2){result="lose";coms="paper";}
                         break;
                case 2 :inps="paper";
                        if(com==0){result="lose";coms="scissor";}
                        if(com==1){result="won";coms="rock";}
                        break;
            }
            System.out.println("The computer is "+ coms+". You are "+inps+". You "+result);
        }

        //2System.out.println(inp+com+result);

    }
}
