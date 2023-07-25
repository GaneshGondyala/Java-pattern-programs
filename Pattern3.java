//Right angle triangle
/*
 *  * 
                * * 
              * * * 
            * * * * 
          * * * * * 
        * * * * * * 
      * * * * * * * 
    * * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * 
 */
public class Pattern3 {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<10;i++){
            {
                for(int j=0;j<(9-i);j++){
                    System.out.print("  "); 
                }
                for(int k=0;k<=i;k++){
                System.out.print("*"+" ");
               

                }
                System.out.println();
            }
        }
    }
    
}
