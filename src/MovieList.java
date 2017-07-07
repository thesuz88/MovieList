import java.util.ArrayList;

/**
 * Created by Steve on 7/7/2017.
 */
public class MovieList {
    private String title = "";
    private String category = "";


    public MovieList(){

    }
    //overloaded constructor
    public MovieList(String title, String category){
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMovie (){
        return title + " " + category;
    }
}
