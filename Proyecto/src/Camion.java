// Link repositorio Github https://github.com/Codice-Solution/Programacion-2/tree/Entrega_1/Proyecto
// Codificado en Intellij Idea
// Autores
// Jose Mancilla Marambio ; 20.476.565-0 ; jose.mancilla@alumnos.uv.cl
// Miguel Maturana Figueroa ; 18.999.258-0 ; miguel.maturanaf@alumnos.un.cl

public class Camion extends Vehiculo{
    private int capacidad_de_carga;
    private Vehiculo vehiculo;

    public Camion(Conductor driver, Gps gps,String patente, String tipo,int masa, int altura){ //Constructor de la clase padre vehiculo
        super(driver, gps ,patente,tipo ,masa, altura);

    }

    public int getCapacidad_de_carga() {
        return capacidad_de_carga;
    }

    public void setCapacidad_de_carga(int capacidad_de_carga) {
        this.capacidad_de_carga = capacidad_de_carga;
    }

    public Gps getGps() {
        return gps;
    }

    public void setGps(Gps gps) {
        this.gps = gps;
    }


    public void imprimir_datos(){ // funcion que llama a la funcion de la clase padre para imprimir los datos del bus
        super.imprimir();
    }

    public void velocidad(){// funcion que determina la velocidad del camion.
        int a = this.gps.distancia();//a es una variable a la cual se le asigna un valor random obtenido de la funcion ubicada en la clase gps
        setVelocidad(a);// cambiamos el valor de velocidad.
        super.imprimir_velocidad();// funcion ubicada en la clase padre que imprime la velocidad actual del camion
    }





}
