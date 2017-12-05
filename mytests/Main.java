package mytests;

import java.util.ArrayList;

import map.Mapping;
import personne.Etudiant;
import personne.Personne;
import testDuosEtAutres.Duo;

public class Main {

	public static void main(String[] args) {
		// 1
		Duo<String> duoStr = new Duo<String>("Mathieu", "Bruno");
		System.out.println(duoStr.getFirst() + " " + duoStr.getSecond());
		duoStr.setFirst("Jean");
		duoStr.setSecond("Paul");
		System.out.println(duoStr.getFirst() + " " + duoStr.getSecond());
		
		Duo<Personne> duoPer = new Duo<Personne>(new Personne("RIQUART", "Damian"), new Personne("OURS", "Delajungle"));
		System.out.println(duoPer.getFirst() + " " + duoPer.getSecond());
		duoPer.setFirst(new Personne("Bonjour", "Aurevoir"));
		duoPer.setSecond(new Personne("Projet", "Eclipse"));
		System.out.println(duoPer.getFirst() + " " + duoPer.getSecond());
		
		// 3
		Mapping<String, Personne> map = new Mapping<String, Personne>("Blabla", new Personne("CAVILLE", "Bruno"));
		System.out.println(map.getKey() + " " + map.getValue());
		map.setKey("Coucou");
		map.setValue(new Personne("DUPONT", "Castor"));
		System.out.println(map.getKey() + " " + map.getValue());
		
		Mapping<String, Etudiant> mapEtu = new Mapping<String, Etudiant>("Blabla", new Etudiant("CAVILLE", "Bruno", "2"));
		System.out.println(mapEtu.getKey() + " " + mapEtu.getValue());
		mapEtu.setKey("Coucou");
		mapEtu.setValue(new Etudiant("DUPONT", "Castor", "4"));
		System.out.println(mapEtu.getKey() + " " + mapEtu.getValue());
		
		Mapping<String, Personne> map2 = new Mapping<String, Personne>("AFRICAIN", new Personne("APO", "Apu"));
		
		ArrayList<Mapping<String, Personne>> mapArray = new ArrayList<Mapping<String, Personne>>();
		mapArray.add(map);
		mapArray.add(map2);		
		for (Mapping<String, Personne> item : mapArray) {
			System.out.println(item.getKey() + " " + item.getValue());
		}
		
		// 4
		// Ne marche pas Mapping<K,V> x = new Mapping<K,V>("121245", new Personne("ASUS", "Tel"));
		// Ne marche pas Mapping<K, V> x = new Mapping<String, Personne>("121245", new Personne("SAMSUNG", "Logitech"));
		Mapping<?,?> testSpecial = new Mapping<String, Personne>("121245", new Personne("LIPTON","Coca"));
		testSpecial = new Mapping<Integer, Personne>(1, new Personne("LIPTON", "Coca"));
		testSpecial = new Mapping<String, Personne>("s1", new Personne("LIPTON", "Coca"));
		System.out.println(testSpecial);
		System.out.println(testSpecial.getKey());
		System.out.println(testSpecial.getValue());
		// Ne marche pas testSpecial.setKey("Probleme");
		
		//5
		Mapping<String, Personne> map5 = new Mapping<String, Personne>("TEST", new Personne("KANGOO", "Junior"));
		System.out.println(map5.getKey() + " " + map5.getValue());
		map5.setKey("PHILIPS");
		map5.setValue(new Personne("ALBERT", "RACLETTE"));
		System.out.println(map5.getKey() + " " + map5.getValue());
	}

}
