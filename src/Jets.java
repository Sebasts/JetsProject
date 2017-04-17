
public class Jets {
	private String model;
	private double speed;
	private double range;
	private double price;
	private Pilot pilot = null;
	
	
	
	
	
		public Jets(String model, double speed, double range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}





		public void showStats(){
			String mach = String.format("%.2f", speed*.0013);
			if(pilot == null){
				System.out.println("Pilot:  None assigned");
				}
			else{
				System.out.println("Pilot: "+pilot.getName());
			}
			
			System.out.println("Model : "+model);
			System.out.println("Speed : "+speed+"mph | Mach "+ mach);
			System.out.println("Range : "+range+" miles");
			System.out.println("Price  : $"+price);
			System.out.println("*****************************************");
			this.pilot.pilotStats();
		}





		public String getModel() {
			return model;
		}





		public void setModel(String model) {
			this.model = model;
		}





		public double getSpeed() {
			return speed;
		}





		public void setSpeed(double speed) {
			this.speed = speed;
		}





		public double getRange() {
			return range;
		}





		public void setRange(double range) {
			this.range = range;
		}





		public double getPrice() {
			return price;
		}





		public void setPrice(double price) {
			this.price = price;
		}





		public Pilot getPilot() {
			return pilot;
		}





		public void setPilot(Pilot pilot) {
			this.pilot = pilot;
		}
		
		
}
