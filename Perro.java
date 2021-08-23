//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 2

/**
 * Clase Perro.
 * 
 * @author José Daniel Gómez Cabrera 21429
 * @version Perro 1.1
 */
public class Perro{
    private String tamano;
    private String raza;
    private String edad;
    private String salud;
    private String color;
    private String nombre;
    private boolean raza_peligrosa;
    private String[] razas_peligrosas = {"Pit bull terrier", "American Staffordshire terrier", "Tosa Inu", "Dogo argentino", "Dogo Guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", "Mastín napolitano", "Presa Mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"}; 
    private String[] informacion_perruna = new String[7];

    /**
     * Constructor Perro.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version Perro 1.1
     */
    public Perro(){
        this.tamano = "";
        this.raza = "";
        this.edad = "";
        this.salud = "";
        this.color = "";
        this.nombre = "";
    }

    /**
     * Constructor Perro con Propiedades de clase.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version Perro 1.2
     * @param Propiedades de Perro.
     */
    public Perro(String tamano, String raza, String edad, String salud, String color, String nombre){
        this.tamano = tamano;
        this.raza = raza;
        this.edad = edad;
        this.salud = salud;
        this.color = color;
        this.nombre = nombre;
        this.raza_peligrosa = evaluar_raza(raza);
    }

    /**
     * Evalua String de raza para saber si esta dentro del Array razas peligrosas, y determinar si es una raza peligrosa.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version evaluar_raza 1.1
     * @return boolean
     * @param String
     */
    private boolean evaluar_raza(String raza){
        boolean valor_raza = false;
        for(int i = 0; i < 17; i++){
            if(raza.equals(razas_peligrosas[i])){
                valor_raza = true;
            }
        }
        return valor_raza;
    }

    /**
     * Concatena todas las propiedades de Perro en un Array de String[], para poder obtener la informacion de una manera mas sencilla (sin todos los getters).
     * Para poder imprimirla despues en vista.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version evaluar_raza 1.1
     * @return String[]
     */
    public String[] get_info_perruna(){
        for(int j = 0; j < 7; j++){
            switch (j) {
                case 0:
                    this.informacion_perruna[j] = this.tamano;
                    break;
                
                case 1:
                    this.informacion_perruna[j] = this.raza;
                    break;

                case 2:
                    this.informacion_perruna[j] = this.edad;    
                    break;

                case 3:
                    this.informacion_perruna[j] = this.salud;
                    break;

                case 4:
                    this.informacion_perruna[j] = this.color;
                    break;
                
                case 5:
                    this.informacion_perruna[j] = this.nombre;
                    break;

                case 6:
                    if(this.raza_peligrosa){
                        this.informacion_perruna[j] = "Raza peligrosa.";
                    }
                    else{
                        this.informacion_perruna[j] = "Raza No Peligrosa.";
                    }
                    break;

                default:
                    break;
            }
        }
        return this.informacion_perruna;
    }

    /**
     * getter de tamano para usar en asignar perro en Perrera.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_tamano 1.1
     * @return String
     */
    public String get_tamano(){
        return this.tamano;
    }

    /**
     * getter de raza para usar en asignar perro en Perrera.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_raza 1.1
     * @return String
     */
    public String get_raza(){
        return this.raza;
    }

    /**
     * getter de raza_peligrosa para usar en asignar perro en Perrera.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_raza_peligrosa 1.1
     * @return Boolean
     */
    public boolean get_raza_peligrosa(){
        return this.raza_peligrosa;
    }

}