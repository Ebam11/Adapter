/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

// Adaptador que convierte la interfaz de AdvancedMediaPlayer a MediaPlayer
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;
    
    // Constructor que recibe el tipo de audio y crea el reproductor avanzado
    public MediaAdapter(String audioType){
        advancedMusicPlayer = new AdvancedMediaPlayer ();
    }
    // Implementa el método play de MediaPlayer, redirigiendo la llamada al método correcto
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);// Adapta a playVlc
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);// Adapta a playMp4
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }
}