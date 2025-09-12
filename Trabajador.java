import java.util.ArrayList;
import java.util.List;

/*En una List<Worker> Worker(id,nombre,sueldo) guarda las calificaciones de 6 trabajadores.
Recorre la lista y calcula el promedio del sueldo.
Elimina los sueldos menores de 1000(< 1000).
Vuelve a mostrar la lista actualizada (con todos los atributos).*/
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

    public static void main(String[] args){
            List<Trabajador> persona = new ArrayList<>();
            persona.add(new Trabajador("Jacinto", 500, 150));
            persona.add(new Trabajador("Juanito", 3000, 155));
            persona.add(new Trabajador("Mit", 11500, 850));
            int sumaSueldos = 0;
            for (Trabajador chambas : persona) {
                System.out.println(chambas);
                System.out.println("\n");
                sumaSueldos += chambas.sueldo;
                System.out.println("la suma de los sueldos es de " + sumaSueldos);
            }
            }

        }









