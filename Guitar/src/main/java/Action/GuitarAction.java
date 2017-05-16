package Action;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import Entity.GuitarEntity;
import Entity.GuitarSpec;
import Entity.Inventory;
import Service.GuitarService;

public class GuitarAction extends ActionSupport{
	private GuitarService guitarService;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	private String builder;

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

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public void setGuitarService(GuitarService guitarService) {
		this.guitarService = guitarService;
	}

	public String Search() throws Exception{
		HttpServletResponse response=ServletActionContext.getResponse();  
        response.setContentType("text/html");
        response.setContentType("text/plain; charset=utf-8");
        Inventory inventroy = new Inventory();
        List<GuitarEntity> guitarList = guitarService.getAll();
        inventroy.setGuitars(guitarList);
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
        List<GuitarEntity> guitarList2 =  inventroy.search(guitarSpec);
        ServletActionContext.getRequest().setAttribute("results", guitarList2);
		return SUCCESS;
	}
}	