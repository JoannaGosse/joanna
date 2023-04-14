package Pokemon;
public class Attaques {
	private String attaque_neutre;
	private double pv_attaque_neutre;
	private String attaque_type1;
	private double pv_attaque_type1;
	private String attaque_type2;
	private double pv_attaque_type2;
	
	public Attaques(String attaque_neutre, double pv_attaque_neutre, String attaque_type1, double pv_attaque_type1) {
		this.attaque_neutre = attaque_neutre;
		this.pv_attaque_neutre = pv_attaque_neutre;
		this.attaque_type1 = attaque_type1;
		this.pv_attaque_type1 = pv_attaque_type1;
	}

}
