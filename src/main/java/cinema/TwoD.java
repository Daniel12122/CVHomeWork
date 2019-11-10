package cinema;

import film.Prometheus;
import film.Terminator;

public class TwoD  implements ICinema{
    private String arr[] = {"Terminator","Prometheus"};

    @Override
    public Object showActualFilms(String film,String name) {
        System.out.println("Select a movie:");
        for(int i =0;i<arr.length;i++){
            int a = i+1;
            System.out.println(a+"."+arr[i]);
        }
        chooseFilm(film,name);
        return null;
    }

    @Override
    public Object chooseFilm(String film,String name) {
        System.out.println("Enter the movie number:");
        int b = in.nextInt();
        if (b == 1) {
            String nameFilm = "Terminator";
            return new Terminator().chooseDate(film,nameFilm,name);
        } else {
            if (b == 2) {
                String nameFilm = "Prometheus";
                return new Prometheus().chooseDate(film,nameFilm,name);
            }
        }
        return null;
    }
}
