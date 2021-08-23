//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 2

import java.util.Scanner;

/**
 * Clase Vista.
 * 
 * @author José Daniel Gómez Cabrera 21429
 * @version Vista 1.1
 */
public class Vista {
    private Scanner entrada1;

    /**
     * Constructor Vista.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version Vista 1.1
     */
    public Vista(){
        entrada1 = new Scanner(System.in);
    }

    /**
     * obtener opcion usuario *string*.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version opcion_usuario 1.1
     */
    public String opcion_usuario(){
        String opcion = (String)(entrada1.nextLine());
        System.out.println("\n---------------------------------------------------------------------------------------");
        return opcion;
    }

    /**
     * obtener opcion usuario *int*.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version opcion_usuario 1.1
     */
    public int opcion_usuario_int(){
        int opcion = (int)(entrada1.nextInt());
        System.out.println("\n---------------------------------------------------------------------------------------");
        return opcion;
    }

    /**
     * bienvenida al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version bienvenida 1.1
     */
    public void bienvenida(){
        System.out.println("\n\n\n---------------------------------------------------------------------------------------");
        System.out.println("BIENVENIDO");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("- Este es el Asignador Perruno.");
        System.out.println("- En este programa podras asignar y agregar a perros nuevos.");
        System.out.println("- Por favor, ingresar texto sin mayusculas y sin tildes.");
        System.out.println("- Para los tamanos de los perros utilice el siguiente formato:");
        System.out.println("  - pequenos, medianos, grandes.");
        System.out.println("- POR FAVOR AGREGA UN NUEVO PERRO PARA COMENZAR.");
    }

    /**
     * mostrar menú al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version mostrar_menu 1.1
     */
    public void mostrar_menu(){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("- Recuerde: Para los tamanos de los perros utilice el siguiente formato:");
        System.out.println("  - pequenos, medianos, grandes.");
        System.out.println("1. Recibir Can.\n2. Crear nueva Familia.\n3. Asignar can a Familia.\n4. Finaliza Programa.\n");
        System.out.print("Digite su opcion aqui: ");
    }


    /**
     * notificacion al usuario de nuevo perrro.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version nuevo_perro 1.1
     */
    public void nuevo_perro(){
        System.out.println("- Se ha creado un nuevo Perro exitosamente.");
    }

    /**
     * notificacion al usuario de nuevo perrro.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version nueva_familia 1.1
     */
    public void nueva_familia(){
        System.out.println("- Se ha creado una nueva Familia exitosamente.");
    }

    /**
     * imprimir informacion del perro que se creo.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version mostrar_familia 1.1
     */
    public void mostrar_perro(Perro dog){
        System.out.println("\n - Se ha asignado el Perro: ");
        for(int u = 0; u < 7; u++){
            System.out.print(" ");
            System.out.println(dog.get_info_perruna()[u]);
        }
        System.out.println("");
    }

    /**
     * imprimir informacion de familia a la que se asigno el perro.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version mostrar_familia 1.1
     */
    public void mostrar_familia(Perrera mi_perrera){
        System.out.println("\n - A la familia: ");
        for(int u = 0; u < 4; u++){
            System.out.print(" ");
            System.out.println(mi_perrera.get_familia_actual()[u]);
        }
        System.out.println("");
    }

    /**
     * imprimir error al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version mostrar_error 1.1
     */
    public void mensaje_error(){
        System.out.println("Error: Debe escoger una opcion del menu.");
    }


    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_tamano 1.1
     */
    public void pedir_tamano(){
        System.out.print("Digite tamano del perro: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_raza 1.1
     */
    public void pedir_raza(){
        System.out.print("Digite la raza del perro: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_edad 1.1
     */
    public void pedir_edad(){
        System.out.print("Digite edad del perro: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_salud 1.1
     */
    public void pedir_salud(){
        System.out.print("Digite salud del perro (0 - 100): ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_color 1.1
     */
    public void pedir_color(){
        System.out.print("Digite color del perro: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_nombre 1.1
     */
    public void pedir_nombre(){
        System.out.print("Digite nombre del perro: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_apellido 1.1
     */
    public void pedir_apellido(){
        System.out.print("Digite apellido de la familia: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_miembros 1.1
     */
    public void pedir_miembros(){
        System.out.print("Digite numero de miembros de la familia: ");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_edadess 1.1
     */
    public void pedir_edades(){
        System.out.println("Digite edades de miembros de la familia: ");
        System.out.println("\n---------------------------------------------------------------------------------------");
    }

    /**
     * imprimir instrucciones al usuario.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version pedir_mascotas 1.1
     */
    public void pedir_mascotas(){
        System.out.print("Digite numero de mascotas de la familia: ");
    }

    public void despedida(){
        System.out.println("Muchas gracias por utilizar el programa...");
        System.out.println("FIN DEL PROGRAMA.\n\n");
    }
}
