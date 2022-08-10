//Abstract App
public abstract class Car {
    private int gearbox = 0;
    private int engine_volume;
    private String color;

    public Car() {
        this(0,0,"white");
    }

    public Car(int gearbox, int engine_volume, String color) {
        this.color = color;
        this.gearbox = gearbox;
        this.engine_volume = engine_volume;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGearbox() {
        return this.gearbox;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    public int getEngine_volume() {
        return this.engine_volume;
    }

    public void setEngine_volume(int engine_volume) {
        this.engine_volume = engine_volume;
    }
    public String gettype(){
        return "Car";
    }
    public abstract String getSize();

}
