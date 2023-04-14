package Pokemon;
//import java.util.List;

public class Pokemon {
	private String name;
	private double pv;
	//private List<Attaques> attaques;
	
	public Pokemon(String name, double pv) { //List<Attaques> attaques
		this.name = name;
		this.pv = pv;
		//this.attaques = attaques;
	}
	
	public String toString() {
		return name + ": " + pv + "PV";
	}

}
