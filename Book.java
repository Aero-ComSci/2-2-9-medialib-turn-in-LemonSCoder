/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
    //System.out.println("Adding book " + t);
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  // Converts Book object to String when printed.
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
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

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int addedRating) {
    // addedRating = 3;
    System.out.println("Adjusting rating by " + addedRating);
    int tempRating = rating + addedRating;
    if ((tempRating) <= 10 && tempRating >= 0) {
      rating += addedRating;
    }
  }
  public boolean equals(Book b) {
    if ((this.title.equals(b.title)) && (this.author.equals(b.author))) {
      return true;
    } else {
      return false;
    }
  }

  // CODE TO ADD
  /*
  public String getInfo() {
    return "The current book information is " + info;
  }
  */

}
