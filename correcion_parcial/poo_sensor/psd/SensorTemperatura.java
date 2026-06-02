package psd;

public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id) {
        super(id, "°C");
    }

   
    @Override
    public boolean validar() {
        double valor = getValor();
        return valor >= -50 && valor <= 150;
    }
}