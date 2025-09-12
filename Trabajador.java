import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    int id;
    String nombre;
    int sueldo;

    public Trabajador(String nombre, int sueldo, int id) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trabajador id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo;
    }

    public static void main(String[] args) {
        // crear lista de trabajadores y agregar 6 trabajadores
        List<Trabajador> persona = new ArrayList<>();
        persona.add(new Trabajador("Jacinto", 500, 150));
        persona.add(new Trabajador("Juanito", 3000, 155));
        persona.add(new Trabajador("Mit", 11500, 850));
        persona.add(new Trabajador("Pako", 950, 120));
        persona.add(new Trabajador("Luis", 1100, 121));
        persona.add(new Trabajador("Ale", 1300, 122));

        // calcular suma de sueldos y promedio
        int sumaSueldos = 0;
        for (Trabajador chambas : persona) {
            sumaSueldos += chambas.sueldo;
        }

        double promedio = (double) sumaSueldos / persona.size();
        System.out.println("El promedio de los sueldos es: " + promedio + "\n");

        // eliminar sueldos menores a 1000
        persona.removeIf(t -> t.sueldo < 1000);

        // mostrar la lista actualizada
        System.out.println("Lista actualizada de trabajadores (sueldo >= 1000):");
        for (Trabajador chambas : persona) {
            System.out.println(chambas);
        }
    }
}
