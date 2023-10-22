import java.util.ArrayList;
import java.util.Scanner;

class Isogram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a movie name: ");
        String input = sc.nextLine();

        System.out.println("Enter the movie genre to get recommendations (e.g., romance, horror): ");
        String genre = sc.nextLine();

        boolean isIsogram = checkIsogram(input);

        if (isIsogram) {
            System.out.println("This is an isogram!");
            movieGenre(genre);
        } else {
            System.out.println("This is not an isogram!");
            movieGenre(genre);
        }
    }

    public static void movieGenre(String genre) {
        ArrayList<String> romanceMovies = new ArrayList<>();
        romanceMovies.add("The Notebook");
        romanceMovies.add("Titanic");
        
        ArrayList<String> horrorMovies = new ArrayList<>();
        horrorMovies.add("The Exorcist");
        horrorMovies.add("The Shining");

        if (genre.equalsIgnoreCase("romance")) {
            System.out.println("Recommended movies for the Romance genre:");
            for (String movie : romanceMovies) {
                System.out.println(movie);
            }
        } else if (genre.equalsIgnoreCase("horror")) {
            System.out.println("Recommended movies for the Horror genre:");
            for (String movie : horrorMovies) {
                System.out.println(movie);
            }
        } else {
            System.out.println("Genre not found in the database.");
        }
    }

    public static boolean checkIsogram(String word) {
        for (int i = 0; i < word.length(); i++) {
            String temp = word.substring(i, i + 1);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (temp.equals(word.substring(j, j + 1)) && i != j) {
                    count++;
                    if (count > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
