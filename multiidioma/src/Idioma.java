import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties{
    public Idioma(String idioma){
        //Si se quieren añadir más idiomas, ir añadiendo case.
    	switch(idioma){
	    	case "Español":
                    getProperties("espanol.properties");
                    break;
	    	case "Inglés":
                    getProperties("ingles.properties");
                    break;
	    	default:
                    getProperties("espanol.properties");
	   	}
    }
    private void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {
        
        }
   }
}
