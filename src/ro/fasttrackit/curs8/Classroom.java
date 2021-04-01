package ro.fasttrackit.curs8;

public class Classroom {
    private final int number;
    private final String building;

    public Classroom(int number, String building) {
        this.number = number;
        this.building = building;
    }

    public int getNumber() {
        return number;
    }

    public String getBuilding() {
        return building;
    }
}
