/**
 * 
 */
package client;
/*import du package du WS tout ce qu'il y a dedans*/
import com.afpa.*;

/**
 * @author Edith
 *
 */
public class MonProgrammeLourd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Calcul de l'age*/
		
		/*Instanciation de l'objet qui peut utiliser l'interface MonAge */
		MonAgeService AgeEdithOutil = new MonAgeService();
		
		/*Initialisation d'une variable avec un objet MonAge*/
		MonAge ClasseDeLAge = AgeEdithOutil.getMonAgePort();
		
		/*Appel de la methode maFonctionAge() de l'objet MonAge*/
		System.out.println("Je suis vieille j'ai : "+ClasseDeLAge.maFonctionAge(1985));
	}

}
