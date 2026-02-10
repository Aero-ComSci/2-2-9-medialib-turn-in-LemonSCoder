/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  //Class variable
  public static String owner = "PLTW";
  private static int numEntries;
  public static int bookEntries = 0;
  public static int movieEntries = 0;
  public static int songEntries = 0;
  public static String modDate;

  public MediaLib() {
    modDate = lastModified.getDate();
  }

  public void addBook(Book b)
  {
    if (bookEntries == 0) {
      book = b;
      bookEntries++;
      numEntries++;
      modDate = lastModified.getDate();
    } else {
      System.out.println("There's already a book in your library!");
    }
  }

  public void addMovie(Movie m) {
    if (movieEntries == 0) {
      movie = m;
      movieEntries++;
      numEntries++;
      modDate = lastModified.getDate();
    } else {
      System.out.println("There's already a movie in your library!");
    }
  }

  public void addSong(Song s) {
    if (songEntries == 0) {
      song = s;
      songEntries++;
      numEntries++;
      modDate = lastModified.getDate();
    } else {
      System.out.println("There's already a song in your library!");
    }
  }

  public void changeBook(Book b) {
    book = b;
    modDate = lastModified.getDate();
  }

  public void changeMovie(Movie m) {
    movie = m;
    modDate = lastModified.getDate();
  }

  public void changeSong(Song s) {
    song = s;
    modDate = lastModified.getDate();
  }

  /*
  public void testBook(Book tester) {
    tester.setTitle("The Hunger Games");
    System.out.println(tester);

  }
  */

  public Book getBook() {
    return book;
  }

  public Movie getMovie() {
    return movie;
  }

  public static String getOwner() {
    return owner;
  }

  public static int getNumEntries() {
    // System.out.println("Test: MediaLib is " + this.book);
    return numEntries;
  }

  public static void changeOwner(String ownerName) {
    owner = ownerName;
  }

  public String toString() 
  {
    String info = "" + book + "\n" + movie + "\n" + song + "\nLast Modified: " + modDate;
    
    return info;
  }

}