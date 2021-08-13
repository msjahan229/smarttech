package dashboard.steps;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Adil");
		v.addElement("Aslam");
		v.addElement("Java");
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	
	}

}
