package dao;

import java.util.List;import java.util.jar.Attributes.Name;

import org.apache.ibatis.annotations.Select;

import entity.Class1;

public interface Class1_dao {
	@Select("select * from cla")
	public List<Class1> select();

}
