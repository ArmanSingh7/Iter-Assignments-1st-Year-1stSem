/*Write a program to print the following outputs using for loops: 
 
(a)
 *  
 * * 
 * * * 
 * * * * 
 * * * * *  
 
(b) 
 1  
 2 2 
 3 3 3 
 4 4 4 4 
 5 5 5 5 5  
 
 (c)
  1  
 2 3 
 4 5 6 
 7 8 9 10 
 11 12 13 14 15 
 
(d)
 1  
 1 2 
 1 2 3 
 1 2 3 4 
 1 2 3 4 5 
 
*/

public class program6 {
    public static void main(String[]args){
       System.out.println("a)");
        for (int i=1;i<=5;i++){
            System.out.println("");
            for(int j=1;j<=i;j++){
            System.out.print("* ");
         }

    }
    System.out.println("\n\nb)");
    for(int i=0;i<=5;i++) {
        System.out.println("");
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
    }
    System.out.print("\n\nc)");
    for(int i=1;i<=5;i++) {
        System.out.println("");
        int z=i;
        for(int j=1;j<=i;j++){
          System.out.print(z+" ");
         z++;
        }

    }System.out.print("\n\nd)");
    for(int i=0;i<=5;i++) {
        System.out.println("");
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
    }

}    
}