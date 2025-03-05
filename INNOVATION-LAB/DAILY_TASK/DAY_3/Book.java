public class Book {
    String title = "";
    String author = "";
    
    Book(){
        title = "RICH DAD POOR DAD";
        author = "ROBERT KIYOSAKI";
    }
    
    Book(String thetitle, String theauthor){
        this.title = thetitle;
        this.author = theauthor;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    
    public static void main(String args[]) {
        
        Book book1 = new Book();
        book1.displayDetails();
        
        Book book2 = new Book("THE PSYCHOLOGY OF MONEY", "MORGAN HOUSELL");
        book2.displayDetails();
    }
}