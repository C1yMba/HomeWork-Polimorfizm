public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {

        System.out.println("Проверяем прицеп");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service(){
        checkEngine();
        checkTrailer();
    }

}
