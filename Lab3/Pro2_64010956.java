import java.util.Scanner;
public class Pro2_64010956 {

    public static int[] merge(int[] list1, int[] list2) {
        int[] sortarray = new int [list1.length+list2.length];
        for(int i = 0;i<list1.length;i++){
            sortarray[i]=list1[i];
        }
        for(int i = list1.length;i<sortarray.length;i++){
            sortarray[i]=list2[i-list1.length];
        }
        for(int j=1;j<sortarray.length;j++){
            for(int i = 0;i<sortarray.length-j;i++){
                if(sortarray[i]>sortarray[i+1]){
                    int temp = sortarray[i];
                    sortarray[i] = sortarray[i+1];
                    sortarray[i+1]=temp;
                }
            }
        }
        return sortarray;
    }
    public static void main(String[] args) {
        System.out.print("Enter list1:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arrayA = new int[a];
        for(int i=0;i<a;i++){
            arrayA[i]=input.nextInt();
        }
        System.out.print("Enter list2:");
        int b = input.nextInt();
        int[] arrayB = new int[a];
        for(int i=0;i<b;i++){
            arrayB[i]=input.nextInt();
        }
        int[] arrayC = merge(arrayA,arrayB);
        System.out.print("The merged list is ");
        for(int i=0;i<arrayC.length;i++){
            System.out.print(arrayC[i]+" ");
        }
        
        

    }
}
