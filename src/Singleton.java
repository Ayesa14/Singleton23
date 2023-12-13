/**
 * Solo una instancia
 */
public class Singleton {
    /**
     * numero generado para adivinar
     */
    private int numeroAleatorio;

    /**
     * numero introducido por el jugador
     */
    private int numeroPropuesto;

    /**
     * intentos máximos
     */
    private int intentosMax;

    /**
     * numero de aciertos en una partida
     */
    private int puntuacion;

    /**
     * fallos del jugador
     */
    private int fallos;

    /**
     * nombre del jugador
     */
    private String alias;

    /**
     * los intentos que el usuario lleva
     */
    private int contadorIntentos;

    /**
     * rondas en cada partida
     */
    private int rondasPartida;

    /**
     * ronda en la que estamos
     */
    private int rondaActual;

    /**
     * unica instancia
     */
    private static Singleton instance = null;

    /**
     * constructor bloqueado con private
     */
    private Singleton(){}

    /**
     * Según exista o no ya el objeto lo instanciamos o cambiamos los datos
     * @return la instancia. Si no existe la crea primero
     */
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * numero generado para adivinar
     * @param numeroAleatorio
     */
    public void setNumeroAleatorio(int numeroAleatorio){
        this.numeroAleatorio = numeroAleatorio;
    }

    /**
     * numero introducido por el jugador
     * @param numeroPropuesto
     */
    public void setNumeroPropuesto(int numeroPropuesto){
        this.numeroPropuesto = numeroPropuesto;
    }

    /**
     * intentos máximos
     * @param intentosMax
     */
    public void setIntentosMax(int intentosMax){
        this.intentosMax = intentosMax;
    }

    /**
     * numero de aciertos en una partida
     * @param puntuacion
     */
    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    /**
     * fallos del jugador
     * @param fallos
     */
    public void setFallos(int fallos){
        this.fallos = fallos;
    }

    /**
     * nombre del jugador
     * @param alias
     */
    public void setAlias(String alias){
        this.alias = alias;
    }

    /**
     * los intentos que el usuario lleva
     * @param contadorIntentos
     */
    public void setContadorIntentos(int contadorIntentos){
        this.contadorIntentos = contadorIntentos;
    }

    /**
     * rondas en cada partida
     * @param rondasPartida
     */
    public void setRondasPartida(int rondasPartida){
        this.rondasPartida = rondasPartida;
    }

    /**
     * ronda en la que estamos
     * @param rondaActual
     */
    public void setRondaActual(int rondaActual){
        this.rondaActual = rondaActual;
    }

    /**
     * numero generado para adivinar
     * @return numeroAleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * numero introducido por el jugador
     * @return numeroPropuesto
     */
    public int getNumeroPropuesto() {
        return numeroPropuesto;
    }

    /**
     * intentos maximos
     * @return intentosMaximos
     */
    public int getIntentosMax() {
        return intentosMax;
    }

    /**
     * numero de aciertos en una partida
     * @return puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * numero de fallos en una partida
     * @return fallos
     */
    public int getFallos() {
        return fallos;
    }

    /**
     * nombre del jugador
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * intentos que lleva el jugador
     * @return contadorIntentos
     */
    public int getContadorIntentos() {
        return contadorIntentos;
    }

    /**
     * rondas de cada partida
     * @return rondaPartida
     */
    public int getRondasPartida() {
        return rondasPartida;
    }

    /**
     * ronda en la que estamos
     * @return rondaActual
     */
    public int getRondaActual() {
        return rondaActual;
    }
}
