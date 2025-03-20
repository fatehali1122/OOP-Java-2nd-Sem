class Screen {
    private int screenNumber;
    private String movieTitle;
    private Seat[][] seats;

    public Screen(int screenNumber, String movieTitle, int rows, int cols) {
        this.screenNumber = screenNumber;
        this.movieTitle = movieTitle;
        seats = new Seat[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat(i, j, SeatType.REGULAR);
            }
        }
    }

    public boolean bookSeat(int row, int col) {
        if (row >= seats.length || col >= seats[0].length) {
            System.out.println("Invalid seat selection! Try again.");
            return false;
        }
        if (!seats[row][col].bookSeat()) {
            System.out.println("Seat already booked! Choose another.");
            return false;
        }
        System.out.println(" Seat booked successfully!");
        return true;
    }

    public void displayScreen() {
        System.out.println("\nScreen " + screenNumber + "  Movie: " + movieTitle);
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                seat.display();
            }
            System.out.println();
        }
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }
}
