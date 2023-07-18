
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
		// write your code here
		String output = super.toString();
		output = String.format("%-60s %-20s", output, opticalZoom);
		return output;
	}
}

