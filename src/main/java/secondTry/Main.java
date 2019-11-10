package secondTry;

import secondTry.sessionsAndTickets.Sessions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toUpperCase();
        Sessions sessions = new Sessions();
        sessions.getInformationAboutFilm(str);

        }
    }
