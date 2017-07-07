import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Steve on 7/7/2017.
 */
public class MovieSelectionByCategory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String askAgain;

        ArrayList<MovieList> movies = new ArrayList<>();

        movieCollection(movies);


        System.out.println("Welcome to the Movie List App!\n");
        do {
            System.out.println("There are 10 movies in this list.\nWhat category are you interested in?");
            System.out.println("(Type: Scifi, Animated, Drama, or Horror)");
            String category = scan.nextLine();

            //method to validate if the user typed in a correct category
            category = validateCategory(scan, category);

            //Method with a series of conditionals to get movie titles based on user entered category
            getMovieTitle(movies, category);

            System.out.println("Would you like to try another category? (y/n)");
            askAgain = scan.nextLine();

            //Method to validate the user typing y to continue or n to quit
            askAgain = getAnotherEntry(scan, askAgain);

        } while (askAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you for choosing a movie!");


    }

    private static void getMovieTitle(ArrayList<MovieList> movies, String category) {

        if (category.equalsIgnoreCase("Scifi")) {
            //return movies in scifi category
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getCategory().contains("Scifi")) {
                    System.out.println(movies.get(i).getTitle());
                }
            }
        }
        if (category.equalsIgnoreCase("Animated")) {
            //return movies in animated category
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getCategory().contains("Animated")) {
                    System.out.println(movies.get(i).getTitle());
                }
            }
        }
        if (category.equalsIgnoreCase("Drama")) {
            //return movies in drama category
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getCategory().contains("Drama")) {
                    System.out.println(movies.get(i).getTitle());
                }
            }
        }
        if (category.equalsIgnoreCase("Horror")) {
            //return movies in horror category
            for (int i = 0; i < movies.size(); i++) {
                if (movies.get(i).getCategory().contains("Horror")) {
                    System.out.println(movies.get(i).getTitle());
                }
            }
        }
    }

    private static String getAnotherEntry(Scanner scan, String askAgain) {
        while (!askAgain.equalsIgnoreCase("y")&&!askAgain.equalsIgnoreCase("n")){
            System.out.println("Invalid entry.");
            System.out.println("Would you like to try another category? (y/n)");
            askAgain = scan.nextLine();
        }
        return askAgain;
    }

    private static String validateCategory(Scanner scan, String category) {
        while (!category.equalsIgnoreCase("scifi")&&!category.equalsIgnoreCase("animated")
                &&!category.equalsIgnoreCase("drama")&&!category.equalsIgnoreCase("horror")){
            System.out.println("That is not a valid category.");
            System.out.println("(Type: Scifi, Animated, Drama, or Horror)");
            category = scan.nextLine();
        }
        return category;
    }

    private static void movieCollection(ArrayList<MovieList> movies) {
        movies.add(new MovieList("Star Wars", "Scifi"));
        movies.add(new MovieList("The Godfather", "Drama"));
        movies.add(new MovieList("The Lion King", "Animated"));
        movies.add(new MovieList("Saw", "Horror"));
        movies.add(new MovieList("E.T. The Extra-terrestrial", "Scifi"));
        movies.add(new MovieList("Psycho", "Horror"));
        movies.add(new MovieList("Independence Day", "Scifi"));
        movies.add(new MovieList("Remember The Titans", "Drama"));
        movies.add(new MovieList("Alladin", "Animated"));
        movies.add(new MovieList("Forrest Gump", "Drama"));
    }
}
