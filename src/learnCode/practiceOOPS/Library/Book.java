package learnCode.practiceOOPS.Library;

public class Book {
    private String Title;
    private String Author;

    public Book(String Title, String Author) {
        this.Title = Title;
        this.Author = Author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }
}
