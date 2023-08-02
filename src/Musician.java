package model;

public abstract class Musician {

    protected String instrument;
    protected String name;
    protected int age;

    public Musician(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void start() {
        rehearse();
        playMusic();
    }

    protected abstract void perform();

    private void playMusic() {
        System.out.println(this.name + " is playing with the " + this.instrument + "!");
    }

    private void rehearse() {
        System.out.println(this.name + " is rehearsing with the " + this.instrument + "!");
    }
}
