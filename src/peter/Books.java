package peter;


public class Books {
    String title;
    String author;
    int year;
    boolean aviability = true;
//constructor
    public Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    };
    public void printBookInfo(){
        System.out.println(title + " " + author);
    }
}