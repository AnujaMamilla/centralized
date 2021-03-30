 package java1;

import java.util.HashMap;
import java.util.Map;

public class RepeatedString {

	public static void main(String[] args) {
      String s = "Anuja";
    Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
    
    for(int i = 0;i<s.length();++i) {
    	char c = s.charAt(i);
    	if(stringMap.containsKey(c)) {
    		int count = stringMap.get(c);
    		stringMap.put(c,++count);
    	}
    	else {
    		stringMap.put(c,1);
    	}
    	
    }
    for(Map.Entry<Character,Integer> entry :stringMap.entrySet()) {
    	System.out.println("Letter "+ entry.getKey() + "is repeated "+entry.getValue()+" times");
    }
	}

}
