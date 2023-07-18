
public class Camcorder extends Item{
	private String opticalZoom;

	public Camcorder(String assetTag, String description, String opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public String getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){

		// Write your codes here
		String output = super.toString(); // referring to the parent class item for toString method
		output = String.format("%-60s %-20d", output,opticalZoom);


		return output;

	}
}

