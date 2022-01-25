import java.util.Scanner;
public class Pro3_64010956 {

    public static int[][] printarray(int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");  
        }
        return array;
    }
    public static int checkrow(int a, int [][] array) {
        int sum=0;
        
        for(int i=0;i<array.length;i++){
            sum+=array[a][i]; 
        }
        
        if(sum==array.length){
                return 1;
            }else if(sum==0){
                return 0;
            }else{
                return 2;
            }   
    }

    public static int checkcol(int a, int [][] array) {
        int sum=0;
        
        for(int i=0;i<array.length;i++){
            sum+=array[i][a];  
        }
        if(sum==array.length){
                return 1;
            }else if(sum==0){
                return 0;
            }else{
                return 2;
            }   
    }


    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[][] array = new int[a][a];
        int[] resultrow= new int[a];
        int[] resultcol= new int[a];
        int nrow = 0;
        int ncol = 0;
        
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                int b = (int)(Math.random()*(2));
                array[i][j]=b;
            }  
        }


        printarray(array);

        for(int i=0;i<a;i++){
            resultrow[i] = checkrow(i, array);
            resultcol[i] = checkcol(i, array);
            if(resultrow[i]==0 || resultrow[i]==1){System.out.println("All "+resultrow[i]+"s"+" on row "+i);}
            if(resultcol[i]==0 || resultcol[i]==1){System.out.println("All "+resultcol[i]+"s"+" on col "+i);}
            nrow += resultrow[i];
            ncol += resultcol[i];
        }
        if(nrow==a*2){System.out.println("No same numbers on a row");}
        if(ncol==a*2){System.out.println("No same numbers on a column");}
        
        //System.out.println(result[i]);
        
        
        //System.out.println(result);

    }
}
