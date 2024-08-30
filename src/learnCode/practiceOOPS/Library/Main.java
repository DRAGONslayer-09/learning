package learnCode.practiceOOPS.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book bk1 =  new Book("Spanish Love Deception", "Elena Armas");
        Book bk2 = new Book("Raavan" , "Amish");
        library.addBook(bk1);
        library.addBook(bk2);
        for (Book book:library.getBooks()){
            System.out.println(book.getTitle() + " , " + book.getAuthor());
        }

    }
}
