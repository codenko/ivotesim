package ivotesim;

import java.util.*;
import java.util.Map.Entry;

public class iVoteService {
	
	private int totalA;
	private int totalB;
	private int totalC;
	private int totalD;
	private int totalR;
	private int totalW;

	
	Hashtable<String, String> store = new Hashtable<String, String>();
	Hashtable<String, Integer> totals = new Hashtable<String, Integer>();
	
	
	//stores the student ID and answer associated
	public void setTable(String id, String ans){
		store.put(id,ans);		
	}
	//print everything stored
	public void printStore(){
 		Set<Entry<String, String>> set = store.entrySet();
 		Iterator<Entry<String, String>> it = set.iterator();
 		while(it.hasNext()){
 			Map.Entry<String,String> entry = (Map.Entry<String,String>) it.next();
 			System.out.print("\n" + entry.getKey() + " : " + entry.getValue());
 		} 		
 	}

	
	public void calculateTotals()
	{
		Enumeration<String> id = store.keys();
		//tally up
		while(id.hasMoreElements())
		{	
			String key = id.nextElement();
			String answer = store.get(key);	
			if(answer.equals("A")){
				totalA++;
				totals.put("A", totalA);
			}
			
			if(answer.equals("B")){
				totalB++;
				totals.put("B", totalB);
			}
			
			if(answer.equals("C")){
				totalC++;
				totals.put("C", totalC);
			}
			
			if(answer.equals("D")){
				totalD++;
				totals.put("D", totalD);
			}
			
			if(answer.equals("R")){
				totalR++;
				totals.put("Right", totalR);
			}
			
			if(answer.equals("W")){
				totalW++;
				totals.put("Wrong", totalW);
			}
			
		}
		
		//iterate through the set and each key value pair.
		Set<Entry<String, Integer>> set = totals.entrySet();
	 	Iterator<Entry<String, Integer>> iter = set.iterator();
	 	while(iter.hasNext()){
	 		Map.Entry<String, Integer> entry = (Map.Entry<String,Integer>) iter.next();
	 		System.out.println(entry.getKey() +" : " + entry.getValue());
	 	}
	}
}
    
	
	
	
	
	



