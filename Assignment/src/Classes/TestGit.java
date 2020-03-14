package Classes;

public class TestGit {
    public static void main(String[] args) {
        System.out.println("Hello Git! The name of the license project is Awareness of crowded places using a mobile application ");

        Place place=new Place("Bulevardul General Gheorghe Magheru, nr 90", 50);
        Place place2=new Place("Bulevardul Dacia, nr 80", 120);
        place.crowdedPlace();
        place2.crowdedPlace();
    }
}
