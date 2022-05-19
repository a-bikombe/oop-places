package Places;

public class Places {

    public static void main(String[] args) {
        Bedroom comfort = new Bedroom("Koala", "Spider-Man");    // creates new "comfort" instance (instantiates) for the Bedroom class
        Bedroom school = new Bedroom("Luca", "Captain America");    // creates another instance "school" for Bedroom class
        System.out.println(comfort);    // prints comfort variable
        System.out.println(school);    // prints school variable
        school.setStuffedAnimal("Squishmallow");    // buys new stuffed animal for school
        System.out.println(school);    // prints new stuffed animal along with its blanket
        System.out.println(comfort.washStuffedAnimalAndBlanket() + " " + school.washStuffedAnimalAndBlanket());    // washes all stuffed animals and blankets
    }

}

class Bedroom {    // class

    private String stuffedAnimal;    // private properties/fields
    private String blanket;

    public Bedroom(String stuffedAnimal, String blanket) {    // constructor - same name as class
        this.stuffedAnimal = stuffedAnimal;    // this keyword determines that the value is different from the field
        this.blanket = blanket;
    }

    public String getStuffedAnimal() {    // returns stuffed animal
        return stuffedAnimal;
    }

    public String getBlanket() {    // returns blanket
        return blanket;
    }

    public void setStuffedAnimal(String stuffedAnimal) {
        this.stuffedAnimal = stuffedAnimal;
    }

    public void setBlanket(String blanket) {
        this.blanket = blanket;
    }

    public String washStuffedAnimalAndBlanket() {    // relevant method: washes stuffed animal and blanket
        return stuffedAnimal + " and " + blanket + " are now clean.";
    }

    public String toString() {    // prints the stuffed animal and blanket
        return stuffedAnimal + ", " + blanket;
    }
}