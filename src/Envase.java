/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gino
 */
public class Envase {
    
    private int cantEnvases = 0;
    private String idEnvase;
    private String tamanioEnv;
    private double grosor;
    private boolean envaseAltaCalidad;
    private Maquina elaboradoPor;
    
    private static String prefijoEnvase = "ENV";

    /**
     * Construye un envase.
     * @param ptam String que define el tamaño del envase. "PQ" para pequeño, "MD" para Mediano, "GD" Para grande.
     * @param pgrosor Double que define el grosor del envase.
     * @param miMaquina Maquina que elaboró el envase.
     */
    public Envase(String ptam, double pgrosor, Maquina miMaquina){
        this.setTamanioEnv(ptam);
        this.setGrosor(pgrosor);
        this.setElaboradoPor(miMaquina);
        generarId();
    }
    
    /**
     * Retorna el String "BOT-", que está grabado en la variable prefijoEnvase
     * Su uso es privado ya que es administrado por el objeto
     * @return the prefijoEnvase.
     */
    private static String getPrefijoEnvase() {
        return prefijoEnvase;
    }

    /**
     * Retorna el identificador único del envase.
     * @return the idEnvase
     */
    public String getIdEnvase() {
        return idEnvase;
    }

    /**
     * Guarda en la variable idEnvase, el id enviado por parámetro.
     * Este método es privado ya que es administrado.
     * Recibe un String.
     * @param idEnvase the idEnvase to set
     */
    private void setIdEnvase(String idEnvase) {
        this.idEnvase = idEnvase;
    }

    /**
     * Devuelve el tamaño del envase.
     * @return the tamanioEnv
     */
    public String getTamanioEnv() {
        return tamanioEnv;
    }

    /**
     * Configura el tamaño del envase.
     * Este método es privado ya que es administrado.
     * @param tamanioEnv the tamanioEnv to set
     */
    private void setTamanioEnv(String tamanioEnv) {
        this.tamanioEnv = tamanioEnv;
    }

    /**
     * Retorna un double que indica el grosor que posee el envase.
     * @return the grosor
     */
    public double getGrosor() {
        return grosor;
    }

    /**
     * Configura el grosor del envase.
     * Este método es privado ya que es administrado.
     * @param grosor the grosor to set
     */
    private void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    /**
     * Devuelve un booleano que indica si este envase es considerado de alta calidad.
     * @return the envaseAltaCalidad
     */
    public boolean isEnvaseAltaCalidad() {
        return envaseAltaCalidad;
    }

    /**
     * Configura la variable envaseAltaCalidad en true si el envase es considerado de alta calidad.
     * De ser de baja calidad, se configura envaseAltaCalidad en false.
     * Este método es privado ya que es administrado
     * @param envaseAltaCalidad the envaseAltaCalidad to set
     */
    private void setEnvaseAltaCalidad(boolean envaseAltaCalidad) {
        this.envaseAltaCalidad = envaseAltaCalidad;
    }

    /**
     * Retorna la dirección de memoria de la máquina que elaboró el envase.
     * @return the elaboradoPor
     */
    public Maquina getElaboradoPor() {
        return elaboradoPor;
    }

    /**
     * Configura la variable elaboradoPor para almacenar la dirección de memoria de la máquina que confeccionó este envase.
     * Este método es privado ya que es administrado.
     * @param elaboradoPor the elaboradoPor to set
     */
    private void setElaboradoPor(Maquina elaboradoPor) {
        this.elaboradoPor = elaboradoPor;
    }
    
    /**
     * Este método configura el ID único para la variable idEnvase.
     * El ID único de cada botella es el prefijo de envase "ENV", concatenado con la cantidad de envases creados utilizando un preincremento.
     * Este método es privado ya que es administrado.
     */
    private void generarId(){
        this.setIdEnvase(getPrefijoEnvase() + "-" +  ++cantEnvases);
    }
    
}
