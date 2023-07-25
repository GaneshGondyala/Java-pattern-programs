//Right angle triangle
/*
 * * * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * * 
      * * * * * * * 
        * * * * * * 
          * * * * * 
            * * * * 
              * * * 
                * * 
                  * 
 */
public class Pattern4 {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<10;i++){
            {
                for(int j=0;j<(i);j++){
                    System.out.print("  "); 
                }
                for(int k=10;k>i;k--){
                System.out.print("*"+" ");
               

                }
                System.out.println();
            }
        }
    }
    
}
