package main;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;;
public class LargestCombinedNumber {
	
	
	public static String largestCombinedNumber(List<Integer> l){
		
		TreeSet<String> tree= new TreeSet<>(new Comparator<String>() {
			// Does not return 0 when they are equal so duplicates can exist
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				int result;
				if(Integer.parseInt(s1+s2) >= Integer.parseInt(s2+s1))
					result = 1;
				else result = -1;
				
				return result;
				}			
		});
		for(Integer i :l){
			tree.add(i.toString());
		}
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = tree.descendingIterator();
		while(it.hasNext()){
			sb.append(it.next());
		}
		return sb.toString();
	}
}
