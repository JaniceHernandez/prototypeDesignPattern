public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    @Override
    public Animal clone() {
        Cow cloned = new Cow();
        cloned.setLegs(this.legs);
        cloned.setSound(this.sound);
        cloned.setFood(this.food);
        return cloned;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}