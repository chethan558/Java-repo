import java.util.Scanner;

// Define class Books
class Books {
    String name;
    String author;
    int price;
    int numPages;
    
    // Parameterized constructor
    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }
    
    // toString() method
    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }
} // end of class

// Define class Main
class tostringprgrm {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;
        
        // Read no of books
        System.out.print("Enter number of books: ");
        n = s.nextInt();
        
        // Define array
        Books b[];
        b = new Books[n];
        
        // Apply for loop from 0 to n
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            
            // Read name of the book
            System.out.print("Enter book name: ");
            name = s.next();
            
            // Read author of the book
            System.out.print("Enter author name: ");
            author = s.next();
            
            // Read the price of the book
            System.out.print("Enter price: ");
            price = s.nextInt();
            
            // Read the number of pages of the book
            System.out.print("Enter number of pages: ");
            numPages = s.nextInt();
            
            b[i] = new Books(name, author, price, numPages);
        } // End for
        
        // Apply for loop from 0 to n and display the book details
        System.out.println("\n=== BOOK DETAILS ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + " details:");
            System.out.println(b[i]); // toString() is automatically called
            System.out.println("-------------------");
        }
        
        s.close();
    }
}