
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TestFinally{
    
 

    public static void main(String[] args) {
     
            System.out.println("entrer votre code ");
//        try {
//            // traiter cette exception
//            int x =   System.in.read();     
//            // afficher toujours le message "Merci de votre visite"
//        } catch (IOException ex) {
//            Logger.getLogger(TestFinally.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        System.out.println("Merci de votre visite");
        test();
    }
    
    public static int test(){
        try {
            // traiter cette exception
            int x =   System.in.read();  
            return x;
            // afficher toujours le message "Merci de votre visite"
        } catch (IOException ex) {
            Logger.getLogger(TestFinally.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        System.out.println("Merci de votre visite");
        
        }
        return -1;
    }

}


