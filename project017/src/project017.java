//Abstract app
public class project017 {
    public static void main(String[] args) {
        Car car = new Pride(3935,1455,1,5,"white");
        System.out.format("%s \n",car.gettype());
        System.out.printf("EngineVolume = %sL,  %s,  gearbox = %s ,  Color =  %s\n",car.getEngine_volume(),car.getSize(),car.getGearbox(),car.getColor());
        System.out.println("---------------------------------------------------------------------------------------------");


    }
}
