//if you want num in place of * replece with k
public class Pattern8 {
    public static void main(String args[]){
        int n=8;
        for(int i=0;i<4;i++){
            {
                for(int j=0;j<i;j++){
                    System.out.print(" "); 
                }
                
                for(int k=0;k<n-(i*2);k++){
                System.out.print("*");
               

                }
                
                System.out.println();
            }
        }
    }
    
}