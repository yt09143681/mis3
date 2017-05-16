package Service.Impl;

import java.util.List;
import Entity.GuitarEntity;
import Service.GuitarService;
import Dao.GuitarDao;

public class GuitarServiceImpl implements GuitarService {
	private GuitarDao guitarDao;


	public void setGuitarDao(GuitarDao guitarDao) {
		this.guitarDao = guitarDao;
	}


	@Override
	public List<GuitarEntity> getAll() {
		// TODO Auto-generated method stub
		return guitarDao.findAll(GuitarEntity.class);
	}

	

}
