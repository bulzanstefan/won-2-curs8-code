package ro.fasttrackit.curs8.interfaces;

public class Cat implements Animal {
    @Override
    public void travel(int distance) {
        System.out.println("Cat traveling " + distance);
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("cat food")) {
            System.out.println("Eating " + food);
        } else {
            System.out.println("Not eating " + food);
        }
    }

    @Override
    public String getType() {
        return "OMNIVOROUS";
    }
}
