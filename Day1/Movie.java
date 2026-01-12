package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MovieDetails {
    static List<MovieDetails> movies = new ArrayList<>();
    private int movieId;
    private  String movieName;
    private String genre;
    public  boolean watched;


    public MovieDetails(int movieId, String movieName, String genre, boolean watched){
        this.movieId=movieId;
        this.genre=genre;
        this.movieName=movieName;
        this.watched=watched;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("***************************");
        System.out.print("Enter the Movie name: ");
        String input = obj.nextLine();
        System.out.println("***************************");

        movies.add(new MovieDetails(1,"Theri","Action",true));
        movies.add(new MovieDetails(2,"Bhanumadhi","Love",true));
        movies.add(new MovieDetails(3,"Hello","Action",true));
        movies.add(new MovieDetails(4,"varisu","Action",true));
        movies.add(new MovieDetails(5,"parasakthi","Action",false));

//        if(movies.contains("theri")){
//            System.out.println("The Movie is Founded Successfully😁😁");
//        }else {
//            System.out.println("Not Found the Movie😭");
//        }

        for (MovieDetails Movie: movies ){
            if(Movie.movieName.equalsIgnoreCase(input)) {
                System.out.println("Movie Found");
                System.out.println("The movie is So Motivated and Loving movie. i see with my family.");
                System.out.println(Movie);
            }

        }
        boolean Found = false;
        if(!Found){
            System.out.println("Not Found");
            System.out.println("No such Movie!");
        }
        boolean watched = false;
        if(watched == true) {
            System.out.println(movies);
        }else{
            System.out.println(movies);
        }
    }

    public String toString(){
        return "MovieID : " +movieId +",  Movie Name : "+movieName + ",  Gener : "+genre + ",  Watched Status : " + watched;
    }
}
