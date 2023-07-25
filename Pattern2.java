/*
 * A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J 
A B C D E F G H I J
 */
public class Pattern2 {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<10;i++){
            {
                for(int j=0;j<10;j++){
                    System.out.print((char)(j+65)+" ");
                }
                System.out.println();
            }
        }
    }
    
}
