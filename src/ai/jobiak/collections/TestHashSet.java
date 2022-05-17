package ai.jobiak.collections;
import java.util.*;
public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> colors=new HashSet<String>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("pink");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.contains("purple"));

	}

}
