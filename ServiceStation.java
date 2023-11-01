public class ServiceStation implements CheckTransport {
    /*public void check(Transport transport) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }

     */
    @Override
    public void check(Car car){
        transportUpdateTyre(car);
        car.checkEngine();
    }
    @Override
    public void check(Bicycle bicycle) {
        transportUpdateTyre(bicycle);
    }
    @Override
    public void check(Truck truck) {
        transportUpdateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    private static void transportUpdateTyre(Transport transport){
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
    }
