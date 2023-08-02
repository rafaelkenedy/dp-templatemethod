public class Keyboardist extends Musician {


    public Keyboardist(String name, int age) {
        super(name, age);
        this.instrument = "keyboard";
    }
    @Override
    protected void perform() {
        System.out.println(this.name + " is performing with the " + this.instrument + "!");
    }
}
