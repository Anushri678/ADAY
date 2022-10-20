package question2;

import java.time.LocalTime;
import java.util.Objects;

public class Movie {
private String movieName;
private LocalTime movieStartTime;
private LocalTime movieEndTime;
private float movieTicketPrice;
public Movie() {
	super();
}
public Movie(String movieName, LocalTime movieStartTime, LocalTime movieEndTime, float movieTicketPrice) {
	super();
	this.movieName = movieName;
	this.movieStartTime = movieStartTime;
	this.movieEndTime = movieEndTime;
	this.movieTicketPrice = movieTicketPrice;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public LocalTime getMovieStartTime() {
	return movieStartTime;
}
public void setMovieStartTime(LocalTime movieStartTime) {
	this.movieStartTime = movieStartTime;
}
public LocalTime getMovieEndTime() {
	return movieEndTime;
}
public void setMovieEndTime(LocalTime movieEndTime) {
	this.movieEndTime = movieEndTime;
}
public float getMovieTicketPrice() {
	return movieTicketPrice;
}
public void setMovieTicketPrice(float movieTicketPrice) {
	this.movieTicketPrice = movieTicketPrice;
}
@Override
public String toString() {
	return "Movie [movieName=" + movieName + ", movieStartTime=" + movieStartTime + ", movieEndTime=" + movieEndTime
			+ ", movieTicketPrice=" + movieTicketPrice + "]";
}

}
