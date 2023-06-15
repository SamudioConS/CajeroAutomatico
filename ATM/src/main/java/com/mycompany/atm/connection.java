package com.mycompany.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class connection {
    Connection conectar = null;
    String usuario="root";
    String contrasenia="12345abc";
    String bd="bdatm";
    String ip="localhost";
    String puerto="3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    double dinero = 0;
    
    public void setDINERO(double  dinero) {
        this.dinero = dinero;
    }

    public double getDINERO() {
        return this.dinero;
    }

    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base de datos, error "+e.toString());
        }

        return conectar;
    }
    
    public double ConsultaDinero(int id){
        establecerConexion();
        try {
            Statement s = establecerConexion().createStatement();
            String query = "SELECT * FROM atm WHERE NumCuenta ="+id;
            ResultSet rs = s.executeQuery(query);
            if(rs.next()){
                setDINERO(Double.parseDouble(rs.getString("Dinero")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getDINERO();
    }

    public void actualizarDinero(int id, String saldo){
        establecerConexion();
        try {
            Statement s = establecerConexion().createStatement();
            String query = "UPDATE atm SET Dinero = '" + saldo + "' WHERE NumCuenta = " + id;
            s.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarNIP(int id, String nip){
        establecerConexion();
        try {
            Statement s = establecerConexion().createStatement();
            String query = "UPDATE atm SET NIP = '" + nip + "' WHERE NumCuenta = " + id;
            s.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String consultarNombre(int id){
        establecerConexion();
        String nombre = null;
        try {
            Statement s = establecerConexion().createStatement();
            String consultaNombre = id < 0 ? "SELECT * FROM atm" : "SELECT * FROM atm where NumCuenta = " + id;
            ResultSet rs = s.executeQuery(consultaNombre);
            if (rs.next()) {
                nombre = rs.getString("Nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }
    
    public String consultarApellido(int id){
        establecerConexion();
        String apellido = null;
        try {
            Statement s = establecerConexion().createStatement();
            String consultaNombre = id < 0 ? "SELECT * FROM atm" : "SELECT * FROM atm where NumCuenta = " + id;
            ResultSet rs = s.executeQuery(consultaNombre);
            if (rs.next()) {
                apellido = rs.getString("Apellido");
            }
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return apellido;
    }
}
