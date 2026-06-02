package psd;
/*Implementación de un sistema POO basado en un problema de ingeniería
Un laboratorio cuenta con sensores de temperatura, de humedad y de dióxido de carbono (CO₂). 
Todos los sensores comparten un identificador y una unidad de medida. 
Cada tipo de sensor registra un valor específico y debe validar rangos de operación:
•	Temperatura: –50 a 150 °C
•	Humedad: 0 a 100 %
•	CO₂: 0 a 5000 ppm*
Se solicita:
1.	Implemente las clases según el diagrama
2.	Cree un pequeño programa principal que:
o	Cree un arreglo o lista de sensores.
o	Asigne valores aleatorios.
o	Implementar el método correspondiente para para garantizar los rangos permitidos
o	Muestre un mensaje indicando si el valor es válido.
o	Usar JOptionPane
Con base en el siguiente diagrama:





*/

public abstract class Sensor {
	
    private String id;
    private String unidad;
    private double valor;

    public Sensor(String id, String unidad) {
        this.id = id;
        this.unidad = unidad;
        this.valor = 0;
    }

   
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public String getId() {
        return this.id;
    }

    public abstract boolean validar();
    
    @Override
    public String toString() {
        return "Sensor " + id + " -> Valor: " + valor + " " + unidad;
    }
}
