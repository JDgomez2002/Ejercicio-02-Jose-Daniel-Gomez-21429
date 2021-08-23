//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 2

/**
 * DriverProgram (Controlador).
 * 
 * @author José Daniel Gómez Cabrera
 * @version DriverProgram 1.1
 */
public class DriverProgram {
    public static void main(String[] args) {
        Perrera dog_pound = new Perrera();
        Perro dog1 = new Perro();
        Vista interfaz1 = new Vista();

        String opcion_usuario = "0";

        interfaz1.bienvenida();

        while(!(opcion_usuario.equals("4"))){
            interfaz1.mostrar_menu();
            opcion_usuario = interfaz1.opcion_usuario();
            switch (opcion_usuario) {
                case "1"://recibir can
                    interfaz1.pedir_tamano();
                    String tamano = interfaz1.opcion_usuario();
                    interfaz1.pedir_raza();
                    String raza = interfaz1.opcion_usuario();
                    interfaz1.pedir_edad();
                    String edad = interfaz1.opcion_usuario();
                    interfaz1.pedir_salud();
                    String salud = interfaz1.opcion_usuario();
                    interfaz1.pedir_color();
                    String color = interfaz1.opcion_usuario();
                    interfaz1.pedir_nombre();
                    String nombre = interfaz1.opcion_usuario();

                    dog1 = new Perro(tamano, raza, edad, salud, color, nombre);
                    interfaz1.nuevo_perro();
                    break;
            
                case "2"://crear nueva familia
                    interfaz1.pedir_apellido();
                    String apellido = interfaz1.opcion_usuario();
                    interfaz1.pedir_miembros();
                    int cantidad_miembros = interfaz1.opcion_usuario_int();
                    
                    interfaz1.pedir_edades();
                    int[] edades = new int[10];
                    for(int t = 0; t < cantidad_miembros; t++){
                        int edad_miembro = interfaz1.opcion_usuario_int();
                        edades[t] = edad_miembro;
                    }

                    interfaz1.pedir_mascotas();
                    int mascotas_asignadas = interfaz1.opcion_usuario_int();

                    dog_pound.new_family(apellido, cantidad_miembros, edades, mascotas_asignadas);
                    interfaz1.nueva_familia();
                    break;

                case "3"://asignar familia
                    dog_pound.asignar_perro(dog1);
                    interfaz1.mostrar_perro(dog1);
                    interfaz1.mostrar_familia(dog_pound);
                    break;

                case "4"://finalizar programa
                    interfaz1.despedida();
                    break;

                default:
                    interfaz1.mensaje_error();
                    break;
            }
        }

    }
}
