package film;

import java.util.Scanner;

public abstract class Films {
    Scanner in = new Scanner(System.in);
     abstract void chooseTime(String film,String nameFilm,String date,String name);
     abstract Object chooseDate(String film,String nameFilm,String name);
     Object verifyDate(String date){
         if (date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")){

         }else {
             return null;
         }
         return null;
     }
}
