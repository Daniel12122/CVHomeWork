package secindTry.films;

public enum Film {

    JOKER {
        @Override
        public Film getInformationAboutFilm() {
            String nameFilm = "Joker";
            String description = "The origin tale of the Joker (Joaquin Phoenix) " +
                    "– one of the most iconic villains in comic book history.";
            String genre = "Thriller";
            String voiceLanguage = "English";
            String format = "3D";
            String[] session = {"16:00", "18:00", "22:00"};
            int ageLimit = 16;
            AboutFilm film = new AboutFilm(nameFilm, description, genre, voiceLanguage, format, session, ageLimit);
            System.out.println(film.toString());
            return JOKER;
        }
    },
    SHOPLIFTERS {
        @Override
        public Film getInformationAboutFilm() {
            String nameFilm = "Shoplifters";
            String description = "When Osamu Shibata finds five-year-old Yuri on the streets, " +
                    "cold and starving on a winter night, he brings her home to feed her.";
            String genre = "Drama";
            String voiceLanguage = "Ukraine";
            String format = "5D";
            String[] session = {"12:00", "15:00", "22:00"};
            int ageLimit = 12;
            AboutFilm film = new AboutFilm(nameFilm, description, genre, voiceLanguage, format, session, ageLimit);
            System.out.println(film.toString());
            return SHOPLIFTERS;
        }
    },
    ROCKETMAN {
        @Override
        public Film getInformationAboutFilm() {
            String nameFilm = "Rocketman";
            String description = "An epic musical fantasy about the incredible " +
                                 "story of Elton John's breakthrough years.";
            String genre = "Biography";
            String voiceLanguage = "English";
            String format = "2D";
            String[] session = {"13:00", "15:00", "21:00"};
            int ageLimit = 16;
            AboutFilm film = new AboutFilm(nameFilm, description, genre, voiceLanguage, format, session, ageLimit);
            System.out.println(film.toString());
            return ROCKETMAN;
        }
    },
    SHAZAM {
        @Override
        public Film getInformationAboutFilm() {
            String nameFilm = "Shazam";
            String description = "The origin tale of the Joker (Joaquin Phoenix) " +
                    "– one of the most iconic villains in comic book history.";
            String genre = "Thriller";
            String voiceLanguage = "English";
            String format = "2D";
            String[] session = {"10:00", "13:00", "17:00"};
            int ageLimit = 16;
            AboutFilm film = new AboutFilm(nameFilm, description, genre, voiceLanguage, format, session, ageLimit);
            System.out.println(film.toString());
            return SHAZAM;
        }
    },
    US {
        @Override
        public Film getInformationAboutFilm() {
            String nameFilm = "Us";
            String description = "The origin tale of the Joker (Joaquin Phoenix) " +
                    "– one of the most iconic villains in comic book history.";
            String genre = "Thriller";
            String voiceLanguage = "English";
            String format = "5D";
            String[] session = {"09:00", "19:00", "21:00"};
            int ageLimit = 16;
            AboutFilm film = new AboutFilm(nameFilm, description, genre, voiceLanguage, format, session, ageLimit);
            System.out.println(film.toString());
            return US;
        }
    },
    MIDWAY {
        @Override
        public Film getInformationAboutFilm() {
            String nameFilm = "Midway";
            String description = "The origin tale of the Joker (Joaquin Phoenix) " +
                    "– one of the most iconic villains in comic book history.";
            String genre = "Thriller";
            String voiceLanguage = "English";
            String format = "3D";
            String[] session = {"11:00", "15:00", "23:00"};
            int ageLimit = 16;
            AboutFilm film = new AboutFilm(nameFilm, description, genre, voiceLanguage, format, session, ageLimit);
            System.out.println(film.toString());
            return MIDWAY;
        }
    };


    public Film getInformationAboutFilm() {
        return Film.US;
    }
}
