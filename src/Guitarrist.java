public class Guitarrist extends Musician {


    public Guitarrist(String name, int age) {
        super(name, age);
        this.instrument = "guitar";
    }

    @Override
    public void perform() {
        System.out.println(this.name + " is performing with the " + this.instrument + "!");
    }
}
