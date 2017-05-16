package Entity;

public class GuitarSpec {
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	public GuitarSpec(String builder, String model, String type, String backWood, String topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	public Boolean match(GuitarSpec guitarSpec2) throws Exception{
		if(!builder.equalsIgnoreCase(guitarSpec2.getBuilder()) && guitarSpec2.getBuilder().length() > 0){
			return false;
		}else if(!model.equalsIgnoreCase(guitarSpec2.getModel()) && guitarSpec2.getModel().length() > 0){
			return false;
		}else if(!type.equalsIgnoreCase(guitarSpec2.getType()) && guitarSpec2.getType().length() > 0){
			return false;
		}else if(!backWood.equalsIgnoreCase(guitarSpec2.getBackWood()) && guitarSpec2.getBackWood().length() > 0){
			return false;
		}else if(!topWood.equalsIgnoreCase(guitarSpec2.getTopWood()) && guitarSpec2.getTopWood().length() > 0){
			return false;
		}
		return true;
	}
	
}
