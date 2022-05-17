package ai.jobiak.collections;
import java.math.BigInteger;
import java.util.*;
public class TestHashSet3 {

 public static void main(String[] args) {		
		HashSet<Course> courseSet=new HashSet<Course>();
		Course c1=new Course("BCL1","Computer Basics",20,500);
		Course c2=new Course("PGL1","Algorithms",40,2500);
		Course c3=new Course("AdvProgL3","Java Programming",60,5000);//what Java feels about them we don't care
		Course c4=new Course("AdvProgL3","Java Programming",60,5000);
		//System.out.println(c3.hashCode());
		//System.out.println(c4.hashCode());
		Course.add(c1);
		Course.add(c2);
		Course.add(c3);//In Java objects are compared with or by value means hashCode means==
		Course.add(c4);
		Course.add(null);//null is distinct or unique
		Course.add(null);
		System.out.println(courseSet);
		System.out.println(courseSet.size());
	}
}
