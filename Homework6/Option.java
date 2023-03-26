package Homework6;

public abstract class Option {
    int ramSize;
    int driveSize;
    String osType;
    String color;
    public Option(int ramSize, int driveSize, String osType, String color) {
        this.ramSize = ramSize;
        this.driveSize = driveSize;
        this.osType = osType;
        this.color = color;
    }

}