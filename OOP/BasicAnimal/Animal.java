package OOP.BasicAnimal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
    }
}
