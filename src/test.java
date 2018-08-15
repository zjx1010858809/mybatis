import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Class1;
import entity.Class2;

public class test {
	public static void main(String[] args) {
		InputStream is;
		try {
			is = Resources.getResourceAsStream("ae.xml");
		
		SqlSessionFactory f=new SqlSessionFactoryBuilder().build(is);
		SqlSession s=f.openSession();
		List<Class2> user=s.selectList("dao.Class2_dao.select");
		s.close();
		for(Class2 t:user)
			System.out.println(t.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
