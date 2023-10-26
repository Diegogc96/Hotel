
package Audio;

import java.applet.AudioClip;


public class Audio {

    public Audio() {
    }
    
   public void soundButton() {

        AudioClip audio;

        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/clicksound.wav"));
        audio.play();

    }

    public void ringBell(){
        
        AudioClip audio;

        audio = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/ringBell.wav"));
        audio.play();
        
        
    } 
    
}
