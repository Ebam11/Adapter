/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expo;

/**
 *
 * @author Feli2
 */
public class Main {

    // Clase main para probar el funcionamiento del patrón Adapter
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        // Pruebas con diferentes formatos
        audioPlayer.play("mp3","cancion1.mp3");     // Reproducción directa
        audioPlayer.play("mp4","video1.mp4");       // Usando adaptador
        audioPlayer.play("vlc","pelicula1.vlc");    // Usando adaptador
        audioPlayer.play("avi","archivo1.avi");     // Formato no soportado
    }
    
}
