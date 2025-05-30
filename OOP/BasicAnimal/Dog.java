package OOP.BasicAnimal;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Breed: " + getBreed());
    }
}
