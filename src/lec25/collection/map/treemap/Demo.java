package lec25.collection.map.treemap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		Map<Integer, Object> treeMap = new TreeMap<Integer, Object>();
		treeMap.put(1, "B"); //1
		treeMap.put(5, "A"); //2
		treeMap.put(3, "H"); //3
		treeMap.put(2, "D"); //4
		treeMap.put(4, "B"); //5
		
		System.out.println(treeMap);
	}
}