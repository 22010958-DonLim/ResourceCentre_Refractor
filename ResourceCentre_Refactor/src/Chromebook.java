
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = super.toString();
		// Write your codes here
		output = String.format("%-63s %-20s", output, os);
		
		return output;
	
	}
}


