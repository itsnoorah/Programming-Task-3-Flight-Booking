package flight;

public class Flight {

    private int flightNumber;
    private String flightOrigin;
    private String flightDestination;
    private String departureTime;
    private int flightCapacity;
    private int numberOfSeatsleft;
    private double originalPrice;

    // Main constructor 
    public Flight(int fn, String o, String ds, String dp, int c, double op) {
        if (ds.equals(o) == true) {
            throw new IllegalArgumentException("Sorry your destination and origin are the same. Please change.");
        }
        this.flightNumber = fn;
        this.flightOrigin = o;
        this.flightDestination = ds;
        this.departureTime = dp;
        this.flightCapacity = c;
        this.numberOfSeatsleft = c;
        this.originalPrice = op;
    }

    // Check if the flight isn't already full
    public boolean bookASeat() {
        if (numberOfSeatsleft > 0) {
            numberOfSeatsleft = numberOfSeatsleft - 1;
            return true;
        }
        return false;
    }

    // Accessing private variables 
    public double getPrice() {
        return originalPrice;
    }
    public void setPrice(double p) {
        originalPrice = p;
    }

    
    public String getOrigin() {
        return flightOrigin;
    }
    public void setOrigin(String o) {
        flightOrigin = o;
    }

    
    public String getDestination() {
        return flightDestination;
    }
    public void setDestination(String d) {
        flightDestination = d;
    }

    
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String d) {
        departureTime = d;
    }
    
    
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int fn) {
        flightNumber = fn;
    }

    
    public int getNumberOfSeatsleft() {
        return numberOfSeatsleft;
    }
    public void setNumberOfSeatsleft(int s) {
        numberOfSeatsleft = s;
    }

    
    public int getCapacity() {
        return flightCapacity;
    }
    public void setCapacity(int c) {
        flightCapacity = c;
    }

    
    @Override
    public String toString() {
        String one = "Flight " + flightNumber;
        String two = "," + flightOrigin + " to " + flightDestination;
        String three = "," + departureTime;
        String four = ", original price: " + originalPrice + "$";
        return one + two + three + four;
    }

}