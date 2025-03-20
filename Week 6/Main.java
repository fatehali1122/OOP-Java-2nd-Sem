import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cinema cinema = new Cinema("Grand Cinema", "Downtown", 2);
        Screen screen1 = new Screen(1, "Avengers", 5, 5);
        cinema.addScreen(0, screen1);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(101, name, phone, name + "@example.com");

        boolean moreTickets = true;
        while (moreTickets) {
    
            screen1.displayScreen();

    
            int row, col;
            while (true) {
                System.out.print("Enter row number: ");
                row = scanner.nextInt();
                System.out.print("Enter column number: ");
                col = scanner.nextInt();

                if (screen1.bookSeat(row, col)) break;
            }

            Ticket ticket = new Ticket(1001, customer, screen1.getScreenNumber(), row * 10 + col, screen1.getMovieTitle(), 10.0);
            ticket.displayTicket();

            System.out.print("Do you want to book another ticket? (yes/no): ");
            moreTickets = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for booking! Enjoy your movie! 🍿");
        scanner.close();
    }
}

