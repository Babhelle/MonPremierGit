/**
 * 
 */
package convertisseurFC;
import com.w3schools.*;
import com.w3schools.xml.TempConvert;
import com.w3schools.xml.TempConvertSoap;
/**
 * @author Edith
 *
 */
public class MonConvertisseur {
/*Utiliser un webservice pour convertir les °C en °F*/
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Je veux convertir des C en F avec la methode celsiusToFahrenheit(String) dans l'interface TempConvertSoap*/
		
		/*Je cherche la methode qui me renvoie un objet TempConvertSoap */
		/*Initialisation de TempConvertSoap */
		TempConvert MonOutilCelsius = new TempConvert();
		TempConvertSoap ConvertisseurCelsius = MonOutilCelsius.getTempConvertSoap();
		
		/*J'utilise la methode celsiusToFahrenheit(String) de l'objet TempConvertSoap*/
		System.out.println("30 Degres C : "+ConvertisseurCelsius.celsiusToFahrenheit("30"));
		System.out.println("86 Degres F : "+ConvertisseurCelsius.fahrenheitToCelsius("86"));
	}

}
