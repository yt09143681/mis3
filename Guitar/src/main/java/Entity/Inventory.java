package Entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<GuitarEntity> guitars;

	 
	  public List<GuitarEntity> getGuitars() {
		return guitars;
	}


	public void setGuitars(List<GuitarEntity> guitars) {
		this.guitars = guitars;
	}

	public Inventory() {
		super();
	}


	public List<GuitarEntity> search(GuitarSpec searchSpec) throws Exception {
	    List<GuitarEntity> matchingGuitars = new LinkedList<GuitarEntity>();
	    GuitarSpec guitarSpec;
	    GuitarEntity guitar;
	    for (Iterator<GuitarEntity> i = guitars.iterator(); i.hasNext(); ) {
	      guitar = (GuitarEntity)i.next();
	      guitarSpec = guitar.getGuitarSpec();
	      if (guitarSpec.match(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }
}
