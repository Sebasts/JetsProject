import java.util.ArrayList;
import java.util.Scanner;

public class Hangar {

	private ArrayList<Jets> fleet = new ArrayList<Jets>();

	{ 	fleet.add(new Jets("Crane", 1500, 1000, 250_000));
		fleet.add(new Jets("Raptor", 600, 711, 75000));
		fleet.add(new Jets("Sentenal", 1920, 1203, 125_000));
		fleet.add(new Jets("Wingless", 3200, 800, 1_800_000));
		fleet.add(new Jets("Speedmaster",2200, 1450, 850_000));
}

	public Hangar() {
		Tavern pilotTavern = new Tavern();
		for(Jets jet: fleet){
			jet.setPilot(pilotTavern.getAPilot());
		}
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
	
	public void getFastestJet(){
		Jets jets = null;
		for(Jets jet : fleet){
			if( jets == null || jet.getSpeed() > jets.getSpeed()){
				jets = jet;
			}
		}
		System.out.println("The fastest jet in the sleet is: \n");
		jets.showStats();
	}
	public void getJetwithLongestRange(){
		Jets jets = null;
		for(Jets jet : fleet){
			if(jets == null || jet.getRange() > jets.getRange()){
				jets = jet;
			}
		}
		System.out.println("The jet with the longest range in the fleet is: \n");
		jets.showStats();
	}
	
	public void addJet(){
		Scanner in = new Scanner(System.in);
		String model;
		double speed, range, price;
		
		System.out.println("Enter the model of the jet.");
		model = in.nextLine();
		System.out.println("Enter speed of the jet.");
		speed = in.nextDouble();
		in.nextLine();
		System.out.println("Enter range of the jet.");
		range = in.nextDouble();
		in.nextLine();
		System.out.println("Enter the price of the jet.");
		price = in.nextDouble();
		in.nextLine();
		
		this.fleet.add(new Jets(model, speed, range, price));
	}

}
