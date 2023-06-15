package com.mycompany.atm;

public class Persona {
    String Nombre;
    String Apellido;
    double Dinero;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }
    
    public Persona(String Nombre, String Apellido, double Dinero){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dinero = Dinero;
    }
    
    public Persona(double Dinero, int id){
        this.Dinero = Dinero;
        this.id = id;
    }
}
