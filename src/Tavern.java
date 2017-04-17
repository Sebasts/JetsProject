import java.util.ArrayList;

	public class Tavern {
	private ArrayList<Pilot> pilots = new ArrayList<>();

	public Tavern() {
	
	}
	
	{
		pilots.add( new Pilot("Jim Caller", 32, "American" ));
		pilots.add( new Pilot("Patrick Neal", 51, "Canadian"));
		pilots.add( new Pilot("Will Turner", 48, "British"));
		pilots.add( new Pilot("Chris Alligator", 31, "Australian"));
		pilots.add( new Pilot("Larry Johnson", 67, "American"));
		pilots.add(  new Pilot("William McChicken", 27, "American"));
		pilots.add( new Pilot("James Take", 40, "American"));
		pilots.add(  new Pilot("Henry Tillerson", 50, "BVI"));
		pilots.add( new Pilot("Ted Bear", 29, "Australian"));
		pilots.add( new Pilot("Flap Jack", 18, "Candy Island"));
		
	}
	
	public Pilot getAPilot(){
		return pilots.get((int)Math.random()*10);
	}
	
}
