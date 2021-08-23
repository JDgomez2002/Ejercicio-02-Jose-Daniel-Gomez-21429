//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//José Daniel Gómez Cabrera
//Carné 21429
//Sección 11
//Actividad: Ejercicio 2

/**
 * Clase Perrera
 * 
 * @author José Daniel Gómez Cabrera 21429
 * @version Perrera 1.1
 */
public class Perrera {
    private Familia[] familys = new Familia[15];

    private int contador_familias = 3;

    String[] familia_actual = new String[4];

    /**
     * Constructor Perrera.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version Perrera 1.1
     */
    public Perrera(){
        int[] edades1 = {8,6,20,30,40,0,0,0,0,0};
        int[] edades2 = {35,32,0,0,0,0,0,0,0,0};
        int[] edades3 = {15,20,26,0,0,0,0,0,0,0};

        Familia family1 = new Familia("Fernandez", 5, edades1, 1);
        Familia family2 = new Familia("Hernandez", 2, edades2, 0);
        Familia family3 = new Familia("Figueroa", 3, edades3, 2);

        this.familys[0] = family1;
        this.familys[1] = family2;
        this.familys[2] = family3;
    }

    /**
     * Método para agregar familias al Array de familias familys[].
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version new_family 1.1
     * @param Propiedades de Familia.
     */
    public void new_family(String apellido, int cantidad_miembros, int[] edades, int mascotas_asignadas){
        switch (contador_familias) {
            case 3:
                Familia family4 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[3] = family4;
                break;
            
            case 4:
                Familia family5 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[4] = family5;
                break;

            case 5:
                Familia family6 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[5] = family6;
                break;
            
            case 6:
                Familia family7 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[6] = family7;
                break;
            
            case 7:
                Familia family8 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[7] = family8;
                break;
            
            case 8:
                Familia family9 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[8] = family9;
                break;

            case 9:
                Familia family10 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[9] = family10;
                break;
            
            case 10:
                Familia family11 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[10] = family11;
                break;

            case 11:
                Familia family12 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[11] = family12;
                break;
            
            case 12:
                Familia family13 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[12] = family13;
                break;

            case 13:
                Familia family14 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[13] = family14;
                break;
            
            case 14:
                Familia family15 = new Familia(apellido, cantidad_miembros, edades, mascotas_asignadas);
                this.familys[14] = family15;
                break;

            default:
                break;
        }
        this.contador_familias += 1;
    }

    /**
     * getter de Array de familias familys[].
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_familias 1.1
     * @return familys[]
     */
    public Familia[] get_familias(){
        return this.familys;
    }

    /**
     * método para asignar perro a familia.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version asignar perro 1.1
     */
    public void asignar_perro(Perro the_dog){
        boolean continuar = true;
        for(int n = 0; n<contador_familias ;n++){
            while(continuar){
                if(familys[n].get_mascotas_asignadas()<4){
                    if((((the_dog.get_tamano().equals("pequeno"))&&(the_dog.get_raza_peligrosa()==false))||((the_dog.get_raza().equals("labrador"))||(the_dog.get_raza().equals("labrador"))))){
                        familys[n].set_mascotas_asignadas();
                        familia_actual = familys[n].get_info_familia();
                        continuar = false;
                    }
                    else if((the_dog.get_tamano().equals("pequeno"))&&(the_dog.get_raza_peligrosa()==true)&&(familys[n].get_edad_ninos().equals("Sin ninos. Solo adultos."))){
                        familys[n].set_mascotas_asignadas();
                        familia_actual = familys[n].get_info_familia();
                        continuar = false;
                    }
                    else if((the_dog.get_tamano().equals("mediano"))){
                        if((the_dog.get_raza_peligrosa()==false)&&(the_dog.get_tamano().equals("grande"))){
                            familys[n].set_mascotas_asignadas();
                            familia_actual = familys[n].get_info_familia();
                            continuar = false;
                        }
                        else if((the_dog.get_raza_peligrosa()==true)&&(the_dog.get_tamano().equals("Sin ninos. Solo adultos"))){
                            familys[n].set_mascotas_asignadas();
                            familia_actual = familys[n].get_info_familia();
                            continuar = false;
                        }
                    }
                    else if((the_dog.get_tamano().equals("grande"))&&(familys[n].get_edad_ninos().equals("Sin ninos. Solo adultos."))){
                        familys[n].set_mascotas_asignadas();
                        familia_actual = familys[n].get_info_familia();
                        continuar = false;
                    }
                    else{
                        String[] perro_no_asignado = {"No se ha podido asignar el perro a ninguna familia. Haciendo espacio en la perrera para el perro.","","",""};
                        familia_actual = perro_no_asignado;
                    }
                    
                }
            }
        }
    }

    /**
     * getter de familia actual para saber a que familia se asigno.
     * 
     * @author José Daniel Gómez Cabrera 21429
     * @version get_familia_actual 1.1
     * @return String
     */
    public String[] get_familia_actual(){
        return this.familia_actual;
    }

}
