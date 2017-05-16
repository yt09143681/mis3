package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="guitar")
public class GuitarEntity {
	@Id
	@GeneratedValue(generator="gId")
	@GenericGenerator(name="gId",strategy="increment")
	private Integer gId;
	
	@Column(unique=true)
	private String serialNumber;
	
	@Column
	private double price;
	
	@Column
	private String builder;
	
	@Column
	private String model;
	
	@Column
	private String type;
	
	@Column
	private String backWood;
	
	@Column
	private String topWood;
	
	@Transient
	private GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
	
	public Integer getgId() {
		return gId;
	}
	public void setgId(Integer gId) {
		this.gId = gId;
	}
	public GuitarSpec getGuitarSpec() {
		return new GuitarSpec(builder, model, type, backWood, topWood);
	}
	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public GuitarEntity(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	@Override
	public String toString() {
		return "GuitarEntity [serialNumber=" + serialNumber + ", price=" + price + ", builder=" + builder + ", model="
				+ model + ", type=" + type + ", backWood=" + backWood + ", topWood=" + topWood + "]";
	}

	  
	}
