public class Seat{
	int seatNumber;
	int rowNumber;
	double price;
	SeatType type;
	boolean isBooked;

	public Seat(int seatNumber, int rowNumber,SeatType type){
		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		this.type = type;
		this.isBooked = false;
		
	}

	public boolean bookSeat() {
        if (isBooked) return false;
        isBooked = true;
        return true;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void display() {
        System.out.print(isBooked ? "[X] " : "[" + seatNumber + "," + rowNumber + "] ");
    }
}
