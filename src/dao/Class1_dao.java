package dao;

import java.util.List;
import entity.Class1;
import utils.searchInfo;

public interface Class1_dao {
//	@Select("select id,name a from cla ${where}")
	public List<Class1> select(searchInfo info);
	
	public void update();
	
	public void insert();
	
	public void del();

}
