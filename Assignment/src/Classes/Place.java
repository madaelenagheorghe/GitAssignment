package Classes;

public class Place{
    private String address;
    private int numberOfPeople;
    private boolean isCrowded = false;

    public Place(String address, int numberOfPeople) {
        this.address = address;
        this.numberOfPeople = numberOfPeople;
    }
}
