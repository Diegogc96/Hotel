
package Audio;

import java.applet.AudioClip;


public class Audio {

    public Audio() {
    }
    
    public void audio(){
         AudioClip audio;

        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/temaiken.wav"));
        audio.play();

    }
    
   public void soundButton() {

        AudioClip audio;

        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/tortugagimi.wav"));
        audio.play();

    }

    public void ringBell(){
        
        AudioClip audio;

        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/ringBell.wav"));
        audio.play();
        
        
    } 
    
}
