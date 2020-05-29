package q42;

public class Zoologist {
    Canine animal;
    public final void setAnimal(Dog animal) {
        this.animal = animal;
    }
    public static void main(String[] furryFriends) {
        new Zoologist().setAnimal(new Husky());
        new Zoologist().setAnimal(new Dog());
        // new Zoologist().setAnimal(new Wolf()); not a subclass of Dog
        new Zoologist().setAnimal(null);
    }
}
