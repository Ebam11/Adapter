/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo;

// Cliente que usa el adaptador para reproducir diferentes tipos de archivos
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    
    // Implementación del método play
    @Override 
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            // Reproducción directa de archivos MP3
            System.out.println("Reproduciendo archivo MP3: " +fileName);
            // Para formatos avanzados usa el adaptador
        }else if(audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);// Crea el adaptador
            mediaAdapter.play(audioType, fileName);// Usa el adaptador para reproducir
        }else{
             // Formato no soportado
            System.out.println("Formato no compatible: " + audioType);
        }
    }  
}
