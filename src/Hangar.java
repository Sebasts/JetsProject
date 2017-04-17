import java.util.ArrayList;

public class Hangar {

	private ArrayList<Jets> fleet = new ArrayList<Jets>();

	{ 	fleet.add(new Jets("Crane", 1500, 1000, 250_000));
		fleet.add(new Jets("Raptor", 600, 711, 75000));
		fleet.add(new Jets("Sentenal", 1920, 1203, 125_000));
		fleet.add(new Jets("Wingless", 3200, 2800, 1_800_000));
		fleet.add(new Jets("Speedmaster",2200, 1450, 850_000));
}

	public Hangar() {
		Tavern pilotTavern = new Tavern();

	}

	public ArrayList<Jets> getFleet() {
		return fleet;
	}

	public void setFleet(ArrayList<Jets> fleet) {
		this.fleet = fleet;
	}

	public void showJets() {
		for (Jets jet : fleet) {
			jet.showStats();
		}
	}

}
