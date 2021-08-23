//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 2

/**
 * Clase Familia
 * 
 * @author José Daniel Gómez Cabrera 21429
 * @version Familia 1.1
 */
public class Familia {
    private String apellido;
    private int cantidad_miembros;
    private int[] edades = new int[10];
    private int mascotas_asignadas;
    private String edad_ninos;
    private String[] informacion_familia = new String[4];

    /**
     * Constructor.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version Familia 1.1
     */
    public Familia(){
        this.apellido = "";
        this.cantidad_miembros = 0;
        this.mascotas_asignadas = 0;
        this.edad_ninos = "";
    }

    /**
     * Constructor con parámetros.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version Familia 1.2
     * @param propiedades de la clase Familia.
     */
    public Familia(String apellido, int cantidad_miembros, int[] edades, int mascotas_asignadas){
        this.apellido = apellido;
        this.cantidad_miembros = cantidad_miembros;
        this.edades = edades;
        this.mascotas_asignadas = mascotas_asignadas;
        this.edad_ninos = evaluar_ninos(edades);
    }

    // /**
    //  * getter de apellido.
    //  * 
    //  * @author José Daniel Gómez Cabrera 21429
    //  * @version get_apellido 1.1
    //  * @return String
    //  */
    // public String get_apellido(){
    //     return this.apellido;
    // }

    /**
     * setter de mascotas_asignadas, para poder sumarle una mascota a la familia cuando se adopte.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version set_mascotas_asignadas 1.1
     */
    public void set_mascotas_asignadas(){
        this.mascotas_asignadas += 1;
    }

    /**
     * getter de mascotas_asignadas.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_mascotas_asignadas 1.1
     * @return Int
     */
    public int get_mascotas_asignadas(){
        return this.mascotas_asignadas;
    }

    /**
     * Este método evalua el Array de las edades de los integrantes de la familia para poder determinar si la familia posee ninos pequenos, grande o si no posee ninos.
     * Usa contadores para poder determinar si hay ninos pequenos, grandes o si no hay.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version evaluar_ninos 1.1
     * @param int[10]
     * @return String
     */
    private String evaluar_ninos(int[] edades){
        String edad = "";
        int ninos_pequenos = 0;
        int ninos_grandes = 0;
        for(int i = 0; i < 10; i++){
            if((this.edades[i]>0)&&(this.edades[i]<10)){
                ninos_pequenos += 1;
            }
            else if((this.edades[i]>=10)&&(this.edades[i]<18)){
                ninos_grandes += 1;
            }
        }
        if(ninos_pequenos>0){
            edad = "Con ninos pequenos.";
        }
        else if(ninos_grandes>0){
            edad = "Con ninos grandes.";
        }
        else if((ninos_pequenos == 0)&&(ninos_grandes == 0)){
            edad = "Sin ninos. Solo adultos.";
        }
        return edad;
    } 

    /**
     * getter de edad_ninos.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_edad_ninos 1.1
     * @return String
     */
    public String get_edad_ninos(){
        return edad_ninos;
    }

    /**
     * Concatena toda la información de Familia a un Array para poder imprimirla en Vista.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_info_familia 1.1
     * @return String[]
     */
    public String[] get_info_familia(){
        for(int k = 0; k < 4; k++){
            switch (k) {
                case 0:
                    this.informacion_familia[k] = this.apellido;
                    break;
                
                case 1:
                    if(this.cantidad_miembros == 1){
                        this.informacion_familia[k] = "Miembros: 1";
                    }
                    else if(this.cantidad_miembros == 2){
                        this.informacion_familia[k] = "Miembros: 2";
                    }
                    else if(this.cantidad_miembros == 3){
                        this.informacion_familia[k] = "Miembros: 3";
                    }
                    else if(this.cantidad_miembros == 4){
                        this.informacion_familia[k] = "Miembros: 4";
                    }
                    else if(this.cantidad_miembros == 5){
                        this.informacion_familia[k] = "Miembros: 5";
                    }
                    else if(this.cantidad_miembros == 6){
                        this.informacion_familia[k] = "Miembros: 6";
                    }
                    else if(this.cantidad_miembros == 7){
                        this.informacion_familia[k] = "Miembros: 7";
                    }
                    else if(this.cantidad_miembros == 8){
                        this.informacion_familia[k] = "Miembros: 8";
                    }
                    else if(this.cantidad_miembros == 9){
                        this.informacion_familia[k] = "Miembros: 9";
                    }
                    else if(this.cantidad_miembros == 10){
                        this.informacion_familia[k] = "Miembros: 10";
                    }
                    break;

                case 2:
                    if(this.mascotas_asignadas == 1){
                        this.informacion_familia[k] = "Mascotas asignadas: 1";
                    }
                    else if(this.mascotas_asignadas == 2){
                        this.informacion_familia[k] = "Mascotas asignadas: 2";
                    }
                    else if(this.mascotas_asignadas == 3){
                        this.informacion_familia[k] = "Mascotas asignadas: 3";
                    }
                    else if(this.mascotas_asignadas == 4){
                        this.informacion_familia[k] = "Mascotas asignadas: 4";
                    }
                    break;

                case 3:
                    this.informacion_familia[k] = this.edad_ninos;
                    break;

                default:
                    break;
            }
        }
        return this.informacion_familia;
    }
}