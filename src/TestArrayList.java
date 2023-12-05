import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>(100);
		list.add(10);
		list.add(30);  // int 
		list.add(20);   // int
		
		//System.out.println(list);
		list.add(2, 40);
		list.add(5); 
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains(41));
		//System.out.println("works");
		System.out.println(list.get(3));
//		for(Integer x:list)
//		{
//			System.out.println(x+1);
//		}
		
		//for(Integer x:list)
//		{
//			System.out.println(x+1);
//		}
	}
}
