package hw0320;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ray Acevedo
 * PrettyTitle.java
 */

//        Write a program that calls a method printTitle that prints a phrase as a title by,
//        converting it to title capitalization
//        underlining each word, i.e. underlying all characters except spaces
//        For example,
//
//        printTitle("a tale of two cities", '*')
//        produces
//
//        A Tale of Two Cities
//        * **** ** *** ******


public class PrettyTitle {
    public static void main(String[] args)
    {
        ArrayList<String> titles = new ArrayList<String>();
        //titles.add(title)
        String title = "a tale of two cities";
        String title1 = "of mice of men";
        String title2 = "the golden compass";
        String weirdTitle = "      title is weird     ";
        String spacyTitle = "spacey       title";
        titles.add(title);
        titles.add(title1);
        titles.add(title2);
        titles.add(weirdTitle);
        titles.add(spacyTitle);

        for (String t : titles){
            printTitle(t);
        }
    }
    public static void printTitle (String string){
        for (int i = 0; i < string.length(); i++) {
            if (i == 0 || (string.charAt(i) != ' ' && string.charAt(i - 1) == ' '  )){
                char firstLetter = (string.charAt(i));
                char capitalFirstLetter = Character.toUpperCase(firstLetter);
                System.out.print(capitalFirstLetter);

            } else {

                System.out.print(string.charAt(i));
            }
        }
        System.out.println(" ");
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != ' '){
                System.out.print('*');
            }
            else {
                System.out.print(' ');
            }
        }
        System.out.println(" ");
    }
}
