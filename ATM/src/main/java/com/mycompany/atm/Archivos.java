package com.mycompany.atm;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;

public class Archivos {

    public void registrarArchivo(Persona persona) throws IOException {
        String Archivo = persona.getNombre() + persona.getApellido() + ".txt";
        File archivo = new File(Archivo);
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String contenido = "\n" + "Nombre: " + persona.getNombre() + "\n" + "Apellido: " + persona.getApellido() + "\n" + "Dinero: " + persona.getDinero() + "\n" + "Fecha y hora: " + fechaHoraActual.format(formatoFechaHora) + "\n";
        FileUtils.writeStringToFile(archivo, contenido, "UTF-8", true);
    }
    
    public void actualizarArchivoDeposito(Persona persona) throws IOException{
        connection con = new connection();
        persona.setNombre(con.consultarNombre(persona.getId()));
        persona.setApellido(con.consultarApellido(persona.getId()));
        String Archivo = persona.getNombre() + persona.getApellido() + ".txt";
        File archivo = new File(Archivo);
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String contenido = "\n" + "Nombre: " + persona.getNombre() + "\n" + "Apellido: " + persona.getApellido() + "\n" + "Dinero depositado: +" + persona.getDinero() + "\n" + "Fecha y hora: " + fechaHoraActual.format(formatoFechaHora) + "\n";
        FileUtils.writeStringToFile(archivo, contenido, "UTF-8", true);
    }
    
    public void actualizarArchivoRetiro(Persona persona) throws IOException{
        connection con = new connection();
        persona.setNombre(con.consultarNombre(persona.getId()));
        persona.setApellido(con.consultarApellido(persona.getId()));
        String Archivo = persona.getNombre() + persona.getApellido() + ".txt";
        File archivo = new File(Archivo);
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String contenido = "\n" + "Nombre: " + persona.getNombre() + "\n" + "Apellido: " + persona.getApellido() + "\n" + "Dinero retirado: -" + persona.getDinero() + "\n" + "Fecha y hora: " + fechaHoraActual.format(formatoFechaHora) + "\n";
        FileUtils.writeStringToFile(archivo, contenido, "UTF-8", true);
    }
    
    public void abrirArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists() && archivo.isFile()) {
                Desktop.getDesktop().open(archivo);
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        }
    }
}
