package SEAufgabenblatt03;

public class Aufgabe3 {
	
	static void leuchte(boolean gruen, boolean gelb, boolean rot){  
		/**DIESE METHODE NICHT BEARBEITEN!*/
	    if(rot && gelb && !gruen){
	        System.out.println("\u001B[31mrot" + "\u001B[33mgelb");
	        return;
	    }
	    else if(gruen && !gelb && !rot){
	        System.out.println("\u001B[32mgruen");
	        return;
	    }
	    else if(!gruen && gelb && !rot){
	        System.out.println("\u001B[33mgelb");
	        return;
	    }
	    else if(!gruen & !gelb & rot){
	        System.out.println("\u001B[31mrot");
	        return;
	    }
	    else{
	        System.out.println("\u001B[0mkeine Phase");
	        return;
	    }
	}
	static void schalteWeiter(boolean gruen, boolean gelb, boolean rot)
	{
	    if (gruen)
	    {
	        rot = false;
	        gelb = true;
	        gruen = false;
	    }
	    else if (gelb && !rot)
	    {
	        rot = false;   // <-- Hier ändern
	        gelb = false;  // <-- Hier ändern
	        gruen = false; // <-- Hier ändern
	    }
	    else if (rot && !gelb)
	    {
	        rot = false;   // <-- Hier ändern
	        gelb = false;  // <-- Hier ändern
	        gruen = false; // <-- Hier ändern
	    }
	    else
	    {
	        rot = false;   // <-- Hier ändern
	        gelb = false;  // <-- Hier ändern
	        gruen = false; // <-- Hier ändern
	    }
	    leuchte(gruen, gelb, rot);
	}
	
	// Diese Methode NICHT bearbeiten!!!
	static void fuehrePhasenAusA(){
	    schalteWeiter(false, true, true);
	    schalteWeiter(true, false, false);
	    schalteWeiter(false, true, false);
	    schalteWeiter(false, false, true);
	}
	
	// Diese Methoden bearbeiten!!
	// Berechnet, abhängig von der Phase ob rot leuchten soll
	public static boolean leuchtetRot(int phase)
	{
	    return false; // <-- Hier ändern
	}

	// Berechnet, abhängig von der Phase ob gelb leuchten soll
	public static boolean leuchtetGelb(int phase)
	{
	    return false; // <-- Hier ändern
	}

	// Berechnet, abhängig von der Phase ob rot leuchten soll
	public static boolean leuchtetGruen(int phase)
	{
	    return phase == 0;
	}
	
	// Diese Zelle NICHT bearbeiten!!!
	public static void fuehrePhasenAusB(){
	    int phase = 0;
	    while(phase < 4)
	    {
	        leuchte(leuchtetGruen(phase), leuchtetGelb(phase), leuchtetRot(phase));
	        ++phase;
	    }
	}
	
	// Diese Methode bearbeiten!!
	public static void fuehrePhasenAusZ(){
	    boolean rot = true;
	    boolean gelb = true;
	    boolean gruen = false;
	    
	    int phase = 0;
	    while(phase < 4)
	    {
	        gruen = rot && gelb;
	        rot = false; // <-- Hier ändern
	        gelb = false; // <-- Hier ändern
	        
	        leuchte(gruen, gelb, rot);
	        ++phase;
	    }
	}
}
