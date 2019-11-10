package secondTry.sessionsAndTickets;

import secondTry.abstractСlass.BaseClass;
import secondTry.films.Film;

import java.util.Arrays;

public class Sessions extends BaseClass {


    public void getInformationAboutFilm(String nameFilm){
        Film film = Film.valueOf(nameFilm);
        film.getInformationAboutFilm();
    }

    public void getFilmsByGenre(){

    }

    public void getAllFilms(){
        System.out.println(Arrays.toString(Film.values()));
    }
}
