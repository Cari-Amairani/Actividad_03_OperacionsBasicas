
/**
 *
 * @author Carina Amairani Díaz Ramírez 
 */

package main;

import model.ModelMessage;
import view.ViewCalculadora;
import controllers.ControllerMessage;

public class Main {
    
    
    public static void main(String[] args) {
        
        ModelMessage modelMessage = new ModelMessage();
        ViewCalculadora viewMessage = new ViewCalculadora();
        ControllerMessage controllersMessage = new ControllerMessage(modelMessage, viewMessage);
        
        controllersMessage.iniciar_vista();
        viewMessage.setVisible(true);
       
    
    }
    
}

