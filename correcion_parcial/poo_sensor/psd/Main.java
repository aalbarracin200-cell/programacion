package psd;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Sensor> listaSensores = new ArrayList<>();
        
        listaSensores.add(new SensorTemperatura("T-101"));
        listaSensores.add(new SensorHumedad("H-202"));
        listaSensores.add(new SensorCO2("C-303"));
        
        Random random = new Random();
        StringBuilder resultadoFinal = new StringBuilder("        sensores\n\n");

       
        for (Sensor sensor : listaSensores) {
            double valorAleatorio = 0;
            
            // valentin xd
            
            if (sensor.getId().equals("T-101")) {
                valorAleatorio = random.nextInt(250) - 100; 
            } else if (sensor.getId().equals("H-202")) {
                valorAleatorio = random.nextInt(160) - 20;  
            } else if (sensor.getId().equals("C-303")) {
                valorAleatorio = random.nextInt(6500) - 500; 
            }

            valorAleatorio = Math.round(valorAleatorio * 100.0) / 100.0;

            sensor.setValor(valorAleatorio);

            boolean esValido = sensor.validar();
            String estado = esValido ? "valido" : "fuera de rango";

            resultadoFinal.append(sensor.toString()).append("\n")
                          .append("Estado: ").append(estado).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, resultadoFinal.toString(), "Monitoreo de Laboratorio", JOptionPane.INFORMATION_MESSAGE);
    }
}