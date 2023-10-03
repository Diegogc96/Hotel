package FondoImagenes;

import javax.swing.JInternalFrame;

public class InternalFrameImagen extends JInternalFrame {
    
    private Panel_Imagenes pi = new Panel_Imagenes();
    
    public InternalFrameImagen() {
        
        setContentPane(pi);
        
    }
    
    public void setImagen(String nombreImagen) {
        
        pi.setImage(nombreImagen);
        
    }
    
}
