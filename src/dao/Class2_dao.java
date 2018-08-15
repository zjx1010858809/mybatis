package dao;

import java.util.List;import java.util.jar.Attributes.Name;

import org.apache.ibatis.annotations.Select;

import entity.Class1;
import entity.Class2;

public interface Class2_dao {
	@Select("select * from class2")
	public List<Class2> select();

}
