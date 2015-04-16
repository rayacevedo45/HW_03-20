package hw0320;
/**
 * Access Code 2.1
 * Ray Acevedo
 * DivisorPatternArt.java
 */
//Print a table of size NxN where an entry (i, j) is:
//@ @ character + 1 space character if i divides j or j divides i
//
//        Two empty space characters, otherwise
//
//        For example:
//
//        @ @ @ @ @
//        @ @   @
//        @   @
//        @ @   @
//        @       @



public class DivisorPatternArt {
    public static void main(String[] args) {
        divisor(5);
    }


    public static void divisor (int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){
                if(i % j == 0 || j % i == 0)
                    System.out.print("@ ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }

    }
}
