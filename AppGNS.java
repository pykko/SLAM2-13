public class AppGNS {

	public static void main(String[] args) {
		
		// Bloc Test 1
		
		System.out.print( "Saisir le nom : " ) ;
		String nom = Clavier.lire() ;
		
		System.out.print( "Saisir le code du pays : " ) ;
		String pays = Clavier.lire() ;
		
		System.out.print( "Saisir le nombre de victoires : " ) ;
		int nbVictoires = Integer.parseInt( Clavier.lire() ) ;
		
		
		Joueur jr1 = new Joueur( nom , pays , nbVictoires ) ;
		
		System.out.println( "Joueur enregistré : " + jr1 ) ;
		
		
		
		// Bloc Test 2
		
		
//		Joueur jr2 = new Joueur() ;
//		jr2.setNom( "Owen" ) ;
//		jr2.setPays( "rus" ) ;
//		jr2.setNbVictoires( -33 ) ;
//		
//		System.out.println( "Joueur enregistré : " + jr2 ) ;
		

	}

}
