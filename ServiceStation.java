public class ServiceStation implements CheckTransport {
    @Override
    public void check(Transport transport){
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        transport.service();
    }

    }
