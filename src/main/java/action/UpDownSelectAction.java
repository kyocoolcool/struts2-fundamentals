package action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class UpDownSelectAction extends ActionSupport {

    private List<String> moviesList = new ArrayList<String>();

    private String favMovie;
    private String favFastFood;

    public UpDownSelectAction(){

        moviesList.add("Spider Man");
        moviesList.add("Matrix");
        moviesList.add("Super Man");
        moviesList.add("Dark Knight");
        moviesList.add("BraveHeart");
        moviesList.add("Ultraman");

    }

    public String getFavFastFood() {
        return favFastFood;
    }

    public void setFavFastFood(String favFastFood) {
        this.favFastFood = favFastFood;
    }

    public List<String> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(List<String> moviesList) {
        this.moviesList = moviesList;
    }

    public String getFavMovie() {
        return favMovie;
    }

    public void setFavMovie(String favMovie) {
        this.favMovie = favMovie;
    }

    public String execute() throws Exception{

        return SUCCESS;
    }

    public String display() {
        return NONE;
    }

}