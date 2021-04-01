package ro.fasttrackit.curs8.interfaces;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void travel(int distance) {
        System.out.println("Waling like " + name + " dog " + distance + " meters");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog " + name + " eating " + food);
    }

    @Override
    public String getType() {
        return "OMNIVOROUS";
    }

    public String bark() {
        return "HAM-HAM";
    }
}
