package hqr.o365.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hqr.o365.dao.TaOfficeInfoRepo;
import hqr.o365.domain.TaOfficeInfo;

@Service
public class SaveOfficeInfo {
	@Autowired
	private TaOfficeInfoRepo repo;
	
	public boolean save(TaOfficeInfo ti) {
		try {
			repo.save(ti);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
