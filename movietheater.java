package bha;


public class movietheater {

    public static void main(String[] args) {

        // Create a theatre with 100 seats

        MovieTheatre theatre = new MovieTheatre(100);
 
        // Test cases

        theatre.bookSeats(10);   // ✅ Valid booking

        theatre.bookSeats(0);    // ❌ Invalid (zero seats)

        theatre.bookSeats(-5);   // ❌ Invalid (negative seats)

        theatre.bookSeats(50);   // ✅ Valid if enough seats

        theatre.bookSeats(100);  // ❌ Invalid (more than available)
 
        System.out.println("Available seats: " + theatre.getAvailableSeats());

    }

}
 
// MovieTheatre class

class MovieTheatre {

    private int availableSeats;
 
    public MovieTheatre(int totalSeats) {

        this.availableSeats = totalSeats;

    }
 
    public void bookSeats(int count) {

        if (count <= 0) {

            System.out.println("Booking rejected: seat count must be greater than 0.");

        } else if (count > availableSeats) {

            System.out.println("Booking failed: not enough seats available.");

        } else {

            availableSeats -= count;

            System.out.println("Booking successful! Seats booked: " + count +

                               ". Remaining seats: " + availableSeats);

        }

    }
 
    public int getAvailableSeats() {

        return availableSeats;

    }

}

 


