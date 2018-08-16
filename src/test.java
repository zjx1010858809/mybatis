import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Class1;
import entity.Class2;
import utils.searchInfo;

public class test {
	public static void main(String[] args) {
		InputStream is;
		try {
			is = Resources.getResourceAsStream("ae.xml");
		
		SqlSessionFactory f=new SqlSessionFactoryBuilder().build(is);
		SqlSession s=f.openSession();
		
//		Class1 a=new Class1();
		
//		List<Class1> user=s.selectList("dao.Class1_dao.select",new searchInfo(" where name like '%%'"));
//		List<Class1> user1=s.selectList("dao.Class1_dao.select",new searchInfo(" where name like '%°à%'"));
//		s.delete("del", 1);
		s.insert("dao.Class1_dao.insert", new entity.Class1("Å£"));
		s.commit();
//		user.get(1).setA("°¢°¢°¢°¢°¢°¢°¢");
//		s.update("update",user.get(1));
//		s.commit();
		s.close();
//		SqlSession s1=f.openSession();
//		List<Class1> user1=s1.selectList("dao.Class1_dao.select",new searchInfo(" where name like '%°à%'"));
//		s.close();
//		for(Class1 t:user)
//			System.out.println(t.getA());
		
//		for(Class1 t:user1)
//			System.out.println(t.getA());
		
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
