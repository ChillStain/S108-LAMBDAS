package S108N1Lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    //

    public static void main(String[] args) {


        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("Juny");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        //       PUNTO -  1 List Strings with O

//*/
       System.out.println("The months that contains the letter O are:" + (monthsWithO(months)));}
    public static List<String> monthsWithO(ArrayList <String>months) {
        return months.stream()
                .filter(n -> n.contains("o") || n.contains("O"))
                .collect(Collectors.toList());
   }
//*/


        //       PUNTO  -   2    List String with more than 5 letters and with the "o".


     /*     System.out.println("The months with more than 5 letters and that contains the letter O are:" + (monthsWithOplus5(months)));}
   public static List<String> monthsWithOplus5(ArrayList <String>months) {
        return months.stream()
                .filter(n -> n.contains("o") || n.contains("O") && n.length() > 5 )
                .collect(Collectors.toList());
}*/

        //        PUNTO   -   3    List with Lambda


     /*  System.out.println("The months are:" + (monthsList(months)));}
    public static List<String> monthsList(ArrayList <String>months) {
        return months.stream()
                .filter(n -> n.length() > 0 )
                .collect(Collectors.toList());
    }*/


        //        PUNTO  -   4   Method Ref
     /*   System.out.println("Months whit method reference: ");
        months.forEach(System.out::println);
    }
      */

        //        PUNTO   -  5   (Nuevo package)

        //        PUNTO   -  6   Order by lenght from smallest to largest

      /*  System.out.println("\n Mix ordered by length:\n " + (monthLengthUp(months)));}
        public static List<String> monthLengthUp(ArrayList <String>months) {
         return months.stream()
                 .sorted(Comparator.comparing(l -> l.length())) //Compare the length of the strings and with .sorted we ordered from smallest to largest
                 .collect(Collectors.toList()); //we collected on the new list
        }
        */

        //        PUNTO   -  7   Order by lenght from largest to smallest

       /* System.out.println("\n Mix ordered by length:\n " + (monthLengthDown(months)));}
        public static List<String> monthLengthDown(ArrayList<String>months){
        return months.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())// with the .reversed, we turn the order
                .collect(Collectors.toList());
        }
        */

        //       PUNTO     -  8  (Nuevo Package)





    }
