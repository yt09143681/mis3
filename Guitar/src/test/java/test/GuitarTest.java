package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Entity.GuitarEntity;
import Entity.GuitarSpec;
import Entity.Inventory;

public class GuitarTest {

	@Test
	public void test() throws Exception {
		 Inventory inventroy = new Inventory();
		 GuitarEntity guitar1 = new GuitarEntity("456", 20,"234","345","789","123","567");
		 GuitarEntity guitar2 = new GuitarEntity("a", 30,"a","a","a","a","a");
	     List<GuitarEntity> guitarList = new ArrayList<GuitarEntity>();
	     guitarList.add(guitar1);
	     guitarList.add(guitar2);
	     inventroy.setGuitars(guitarList);
	     GuitarSpec guitarSpec = new GuitarSpec("","345","","","");
	     List<GuitarEntity> guitarList2 =  inventroy.search(guitarSpec);
	    for(GuitarEntity guitar : guitarList2){
	    	System.out.println(guitar.toString());
	    }
	}

}
