package Classes;

public class Place implements Crowded{
    private String address;
    private int numberOfPeople;
    private boolean isCrowded = false;

    public Place(String address, int numberOfPeople) {
        this.address = address;
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public void crowdedPlace() {
        if(this.numberOfPeople>100)
            isCrowded=true;
        else
            isCrowded=false;
        if(isCrowded==true)
            System.out.println("The place at " + this.address +" is crowded.");
        else
            System.out.println("The place at " + this.address +" is not crowded.");
    }
}
