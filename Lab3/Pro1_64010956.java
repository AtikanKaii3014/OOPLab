public class Pro1_64010956 {

    public static boolean prime(int x) {
        if(x>1){
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){return false;}   
            }
            return true;
        }
        else{return false;}
    }
    public static boolean palindrom(int x) {
        int as=0;
        int temp=x;
        while(temp>0){
            as*=10;
            as += temp%10;
            temp/=10;
        }
        return as==x;
    }
    
    public static void main(String[] args) {
        int a=2,count=0;
        while(count<100){
            if(prime(a)==true && palindrom(a)==true){
                System.out.print(a+" ");
                count++;
                if(count%10==0){System.out.print("\n");}
            }
            a++;
        }
        
    }
}
