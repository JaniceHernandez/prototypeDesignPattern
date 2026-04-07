public class AnimalRegistry{
    private Sheep sheep;
    private Cow cow;
    private Horse horse;

    public AnimalRegistry(){
        sheep = new Sheep();
        cow = new Cow();
        horse = new Horse();
    }

    public Animal createSheep(){
        return sheep.clone();
    }

    public Animal createCow(){
        return cow.clone();
    }

    public Animal createHorse(){
        return horse.clone();
    }

    public Sheep getSheep() {
        return sheep;
    }

    public Cow getCow() {
        return cow;
    }

    public Horse getHorse() {
        return horse;
    }
}