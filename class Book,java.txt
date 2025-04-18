class Book {
    String title = "Java Basics";
    void read() {
        System.out.println("Reading book: " + title);
    }
}

class EBook extends Book {
    void download() {
        System.out.println("Downloading ebook...");
    }
}

public class Q1 {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.read();
        ebook.download();
    }
}
