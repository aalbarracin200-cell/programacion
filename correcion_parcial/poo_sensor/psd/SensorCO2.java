package psd;

public class SensorCO2 extends Sensor {

    
    public SensorCO2(String id) {
        super(id, "ppm");
    }

   
    @Override
    public boolean validar() {
        double valor = getValor();
        return valor >= 0 && valor <= 5000;
    }
}