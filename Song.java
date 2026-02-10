public class Song {
  private String title;
  private double rating;
  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public double getRating() {
    return rating;
  }
  
  // Converts Book object to String when printed.
  public String toString() 
  {
    String info = "\"" + title + "\"";
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

  public void adjustRating(int addedRating) {
    // addedRating = 3;
    double tempRating = rating + addedRating;
    if ((tempRating) <= 10 && tempRating >= 0) {
      rating += addedRating;
    }
  }
  public boolean equals(Song s) {
    if ((this.title.equals(s.title)) && (this.rating == s.rating)) {
      return true;
    } else {
      return false;
    }
  }
}
