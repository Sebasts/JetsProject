
public class Pilot {
	private String name;
	private int age;
	private String nationality;
	
	
	public Pilot(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void pilotStats(){
		System.out.println("*************************************************");
		System.out.println("\nPilot's name: "+this.name);
		System.out.println("\n Pilot's age is "+this.age);
		System.out.println("\n Pilot's nationality is "+this.nationality);
		System.out.println("*************************************************");
	}
	
}
