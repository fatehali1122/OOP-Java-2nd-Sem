public class Ticket {
    private int ticketID;
    private Customer customer;
    private int screenNumber;
    private int seatNumber;
    private String movieTitle;
    private double price;
    
    public Ticket(int ticketID,Customer customer, int screenNumber, int seatNumber, String movieTitle, double price){
        this.ticketID = ticketID;
        this.customer = customer;
        this.screenNumber = screenNumber;
        this.seatNumber = seatNumber;
        this.movieTitle = movieTitle;
        this.price = price;
    }
    public void displayTicket(){
        System.out.println("Ticket ID: "+ ticketID+" | Movie: "+movieTitle+" | Screen: "+screenNumber+" | Seat: "+seatNumber);
    }
}
