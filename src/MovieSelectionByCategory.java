import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Steve on 7/7/2017.
 */
public class MovieSelectionByCategory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        ArrayList<MovieList> movies = new ArrayList<>();

        movieCollection(movies);


        System.out.println("Welcome to the Movie List App!\n");

        System.out.println("There are 10 movies in this list.\nWhat category are you interested in?");
        System.out.println("(Type: Scifi, Animated, Drama, or Horror)");
        String category = scan.nextLine();


            if (category.equalsIgnoreCase("Scifi")) {
                //return scifi category
                for (int i = 0; i < movies.size(); i++) {
                    if (movies.get(i).getCategory().contains("Scifi")){
                        System.out.println(movies.get(i).getTitle());
                    }
                }
            }
            if (category.equalsIgnoreCase("Animated")) {
                //return Animated category
                for (int i = 0; i < movies.size(); i++) {
                    if (movies.get(i).getCategory().contains("Animated")){
                        System.out.println(movies.get(i).getTitle());
                    }
                }
            }
            if (category.equalsIgnoreCase("Drama")) {
                //return Drama category
                for (int i = 0; i < movies.size(); i++) {
                    if (movies.get(i).getCategory().contains("Drama")){
                        System.out.println(movies.get(i).getTitle());
                    }
                }
            }
            if (category.equalsIgnoreCase("Horror")) {
                //return Horror category
                for (int i = 0; i < movies.size(); i++) {
                    if (movies.get(i).getCategory().contains("Horror")){
                        System.out.println(movies.get(i).getTitle());
                    }
                }
            }





    }

    private static void movieCollection(ArrayList<MovieList> movies) {
        movies.add(new MovieList("Star Wars","Scifi"));
        movies.add(new MovieList("The Godfather", "Drama"));
        movies.add(new MovieList("The Lion King", "Animated"));
        movies.add(new MovieList("Saw", "Horror"));
        movies.add(new MovieList("E.T. The Extra-terrestrial", "Scifi"));
        movies.add(new MovieList("Psycho", "Horror"));
        movies.add(new MovieList("Independence Day", "Scifi"));
        movies.add(new MovieList("Remember The Titans", "Drama"));
        movies.add(new MovieList("Alladin", "Animated"));
        movies.add(new MovieList("Close Encounters of the Third Kind", "Drama"));
    }
}
