/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alexander
 */
public class Pasajero {
    
    private Integer idPersona;
    private String numeroCedula;
    private String NombrePersona;
    private String ApelldoPersona;
    private String generoPersona;
    private String DireccionPersona;
    private informacionBoleto boletoPasajero;
        
    public Pasajero() {
    }

    public Pasajero(Integer idPersona, String numeroCedula, String NombrePersona, String ApelldoPersona, String generoPersona, String DireccionPersona, informacionBoleto boletoPasajero) {
        this.idPersona = idPersona;
        this.numeroCedula = numeroCedula;
        this.NombrePersona = NombrePersona;
        this.ApelldoPersona = ApelldoPersona;
        this.generoPersona = generoPersona;
        this.DireccionPersona = DireccionPersona;
        this.boletoPasajero = boletoPasajero;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }

    public String getApelldoPersona() {
        return ApelldoPersona;
    }

    public void setApelldoPersona(String ApelldoPersona) {
        this.ApelldoPersona = ApelldoPersona;
    }

    public String getGeneroPersona() {
        return generoPersona;
    }

    public void setGeneroPersona(String generoPersona) {
        this.generoPersona = generoPersona;
    }

    public String getDireccionPersona() {
        return DireccionPersona;
    }

    public void setDireccionPersona(String DireccionPersona) {
        this.DireccionPersona = DireccionPersona;
    }

    public informacionBoleto getBoletoPasajero() {
        return boletoPasajero;
    }

    public void setBoletoPasajero(informacionBoleto boletoPasajero) {
        this.boletoPasajero = boletoPasajero;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "idPersona=" + idPersona + ", numeroCedula=" + numeroCedula + ", NombrePersona=" + NombrePersona + ", ApelldoPersona=" + ApelldoPersona + ", generoPersona=" + generoPersona + ", DireccionPersona=" + DireccionPersona + ", boletoPasajero=" + boletoPasajero + '}';
    }
  
}
