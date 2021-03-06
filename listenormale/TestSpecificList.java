package listenormale;

import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

import personne.Personne;

public class TestSpecificList {

	public static void main(String[] args) {
		SpecificList<String> sls = new SpecificList<String>();
		sls.addValue("test10");
		sls.addValue("test90");
		sls.addValue("test20");
		sls.addValue("test80");
		sls.addValue("test30");
		sls.addValue("test70");
		System.out.println("SpecificList<String> : "+sls.getSize());
		for (int i = 0; i<sls.getSize(); i++)
		{
			String s = sls.getValue(i);
			System.out.println(s);
		}
		ArrayList<String> vs = sls.toArrayList();
		for (int i = 0; i<vs.size(); i++)
		{
			String s = vs.get(i);
			System.out.println(s);
		}
		System.out.println("End SpecificList<String>");
		
		SpecificList<Personne> slp = new SpecificList<Personne> ();
		slp.addValue(new Personne ("test10", "test10"));
		slp.addValue(new Personne ("test90", "test90"));
		slp.addValue(new Personne ("test20", "test20"));
		slp.addValue(new Personne ("test80", "test80"));
		slp.addValue(new Personne ("test30", "test30"));
		slp.addValue(new Personne ("test70", "test70"));
		slp.addValue(new Personne ("test40", "test40"));
		slp.addValue(new Personne ("test60", "test60"));
		System.out.println("SpecificList<Personne> : "+slp.getSize());
		for (int i = 0; i<slp.getSize(); i++)
		{
			Personne p = slp.getValue(i);
			System.out.println(p);
		}
		ArrayList<Personne> vp = slp.toArrayList();
		for (int i = 0; i<vp.size(); i++)
		{
			Personne p = vp.get(i);
			System.out.println(p);
		}
		System.out.println("End SpecificList<Personne>");	
	}
}

