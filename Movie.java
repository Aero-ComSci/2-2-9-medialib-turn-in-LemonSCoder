public class Movie {
  private String title;
  private double duration;
  private int rating;
  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  // Converts Book object to String when printed.
  public String toString() 
  {
    String info = "\"" + title + "\", with a runtime of " + duration + " hours";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
    System.out.println(title);
  }

  public void setDuration(double d) {
    duration = d;
  }

  public void adjustRating(int addedRating) {
    // addedRating = 3;
    int tempRating = rating + addedRating;
    if ((tempRating) <= 10 && tempRating >= 0) {
      rating += addedRating;
    }
  }
  public boolean equals(Movie m) {
    if ((this.title.equals(m.title)) && (this.duration == m.duration)) {
      return true;
    } else {
      return false;
    }
  }
}
