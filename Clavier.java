import java.io.* ;

/** Accès au clavier
 * @author SLAM2
 * @version 0.3
 * @since Janvier 2015
 */
public class Clavier {

	/** Retourner la chaîne de caractères saisie par l'utilisateur
	* @return Chaîne de caractères saisie
	*/
	public static String lire(){
		String ligne = null ;
		try {
			InputStreamReader lecteur = new InputStreamReader( System.in ) ;
			BufferedReader entree = new BufferedReader( lecteur ) ;
			ligne = entree.readLine() ;
		}
		catch( IOException e ){
			ligne = "" ;
		}

		return ligne ;
	}
}
