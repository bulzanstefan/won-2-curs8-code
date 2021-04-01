package ro.fasttrackit.curs8.homework;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, 500);
        Bottle bottle1 = new Bottle();
        Bottle bottle2 = new Bottle(50, 500);
        Bottle bottle3 = new Bottle(10, 500);
        Bottle bottle4 = new Bottle(1500, 1500);
        System.out.println(bottle.getAvailableLiquid());
        System.out.println(bottle.getEmptyCapacity());
        System.out.println(bottle.open());
        System.out.println(bottle.close());
        System.out.println(bottle.close());
        System.out.println(bottle.drink(100));
        System.out.println(bottle.getAvailableLiquid());
        bottle.open();
        System.out.println(bottle.drink(600));
        System.out.println(bottle.drink(300));
        System.out.println(bottle.getAvailableLiquid());
    }
}
