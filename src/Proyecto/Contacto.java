/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author IDEMNIAS
 */
public class Contacto implements Comparable <Contacto>, Serializable{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono1;
    private String telefono2;
    private String email;
    private int dia;
    private int mes;
    private int año;
    private int años;
    private int buscarpor=0;
    
    
    public Contacto() {
    }

    public Contacto(String nombre, String telefono1) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
    }

    public Contacto(String nombre, int dia, int mes,int año) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Contacto(String nombre, String apellido1, String apellido2, String telefono1, String telefono2, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.email = email;
    }
    public Contacto(String nombre, String apellido1, String apellido2, String telefono1, String telefono2, String email,int dia,int mes, int año) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.email = email;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
   
/**
 * 
 * Get y set de todas las variables
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String mesnombre(int mes){
        String mesnombre="";
        switch (mes){
            case 1:mesnombre="enero";break;
            case 2:mesnombre="febrero";break;
            case 3:mesnombre="marzo";break;
            case 4:mesnombre="abril";break;
            case 5:mesnombre="mayo";break;
            case 6:mesnombre="junio";break;
            case 7:mesnombre="julio";break;
            case 8:mesnombre="agosto";break;
            case 9:mesnombre="septiembre";break;
            case 10:mesnombre="octubre";break;
            case 11:mesnombre="noviembre";break;
            case 12:mesnombre="diciembre";break;
            
        }
        return mesnombre;
    }

    /**
     * 
     * Metodos a mayores que necesitamos 
     */
    
    public String cumpleaños(){
    Calendar c = Calendar.getInstance();
    String cumpleaños;
    int años=c.get(Calendar.YEAR)-año;
    if(mes<=c.get(Calendar.MONTH)){
        if(dia<c.get(Calendar.DATE)){
        }else{}
    }
    else{
        años=años-1;
    } 
    if(años>150||años<0){
        cumpleaños="";
    }
    else{cumpleaños="Tiene "+años+" anos";}
        return cumpleaños;
}
 
    public int cumpleunomas(){
    Calendar c = Calendar.getInstance();
    int años=c.get(Calendar.YEAR)-año;
        return años;
}
    
public String fechacumpleaños(){
    String fechacumple = this.getNombre()+" cumple "+this.cumpleunomas()+" anos el "+this.getDia()+" del "+this.mesnombre(this.getMes());
    return fechacumple;
}
    
    public void cambiardatos (String nombre,String apellido1,String apellido2,String telefono2,String email, int dia, int mes, int año){
        setNombre(nombre);setApellido1(apellido1);setApellido2(apellido2);setTelefono2(telefono2);setEmail(email);setDia(dia);setMes(mes);setAño(año);
    }
    
    public void cambiardatos2 (String nombre,String apellido1,String apellido2,String telefono2,String email){
        setNombre(nombre);setApellido1(apellido1);setApellido2(apellido2);setTelefono2(telefono2);setEmail(email);
    }

  @Override 
 public int compareTo(Contacto p1) {
     if (this.getNombre().compareTo(p1.getNombre())<0)
                 return -1;
            else if (this.getNombre().compareTo(p1.getNombre())>0)
                return 1;
            else return 0;
     }
}