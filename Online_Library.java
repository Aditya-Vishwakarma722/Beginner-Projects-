import java.util.Locale;
import java.util.Scanner;

class library{
    int max = 100;
    int count = 0;
    String [] books = new String[max];
    Scanner scn = new Scanner(System.in);

    //Method to Add Books in the Library
    void addbooks(){
        if(count<max) {
            System.out.print("Enter the Book : ");
            String str = scn.nextLine();
            books[count] = str;
            count++;
            System.out.println("Book added Successfully!");
        }
        else{
            System.out.println("Library is already full. Can't add more Books!");
        }
    }

    //Method to Issue the Book to the User from the Library!
    void issueBook(){
        System.out.print("Enter the name of the Book : ");
        String str = scn.nextLine();

        boolean found = false;

        for(int i = 0 ; i<count ; i++){
            if(books[i] != null && books[i].equalsIgnoreCase(str)){
                System.out.println("Book Issued Successfully!");
                for(int j = i ; j < count-1 ; j++){
                    books[j] = books[j+1];
                }
                books[count-1] = null;
                count--;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not available!");
        }
    }


    // Method to add the Returned Book to the Library!
    void returnbook(){
        if(count < max){
            System.out.println("Enter the Book : ");
            String book = scn.nextLine();

            books[count] = book;
            count++;
            System.out.println("Book returned Successfully!");
        }
        else{
            System.out.println("Library is Full!");
        }
    }

    //Method to Display the Books in the Library!
    void display(){
        if(count == 0){
            System.out.println("Library is Empty!");
        }
        else{
            for(int i = 0 ; i<count ; i++){
                System.out.println((i+1)+". "+books[i]);
            }
        }

    }

}

public class Online_Library {
    public static void main(String[] args){
        library lb = new library();
        Scanner scn = new Scanner(System.in);

        System.out.println("----------Welcome to the Local Library----------");
        while (true) {
            System.out.println("\nHow may we Help you?");
            System.out.println("1. Add Book to the Library\n2. Issue a Book from the Library\n3. Return a Book back to the Library\n4. Display all the Books present in the Library\n5. Exit the Library\n");
            System.out.print("Enter your Choice: ");
            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice) {
                case 1:
                    lb.addbooks();
                    break;
                case 2:
                    lb.issueBook();
                    break;
                case 3:
                    lb.returnbook();
                    break;
                case 4:
                    lb.display();
                    break;
                case 5:
                    System.out.println("Thank you for visiting the Library!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
