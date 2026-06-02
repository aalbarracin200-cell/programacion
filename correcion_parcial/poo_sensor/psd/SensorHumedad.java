package psd;

public class SensorHumedad extends Sensor {

    public SensorHumedad(String id) {
        super(id, "%");
    }

    @Override
    public boolean validar() {
        double valor = getValor();
        return valor >= 0 && valor <= 100;
    }
}