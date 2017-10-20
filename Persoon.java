public class Dier {
	
	private String naam;

	public Dier() {}
	
	public Dier(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public String getType() {
		String type;
		type = this.getClass().getSimpleName();
		return type;
	}
	
	public String toString() {
		String type = this.getType();
		return naam + " " + type;
	}
	
	public void maakGeluid(){
		System.out.println("Geluid");
	}
}
