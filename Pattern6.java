public class Pattern6 {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<10;i++){
            {
                for(int j=0;j<(i);j++){
                    System.out.print(" "); 
                }
                for(int k=1;k<=n-i;k++){
                System.out.print("*"+" ");
               

                }
                System.out.println();
            }
        }
    }
    
}