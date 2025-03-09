import java.util.HashMap;
import java.util.Map;

public class Testing2 {
	
	public void strRev() {
		String a = "Sandy Ravon";
		String b =" ";
		
		for(int i =a.length()-1;i>=0;i--) {
			b = b + a.charAt(i);
			if(i==4) {
				System.out.println(a.charAt(i));
			}
		}
		
		System.out.println(b);
	}
	public void strAry() {
		String a = "Sandy Ravon";
		String[] ab = a.split(" ");
		System.out.print("String[]: [");
		for(int i =0;i<ab.length;i++) {
			
			System.out.print(ab[i]);
			if(i!=ab.length-1) {
				System.out.print(" ");	
			}
			
		}
		System.out.println("]");
		
	}
	public void swapStr() {
		String a = "SandyGe";
		String b ="";
		
		/*
		 * int n =1; for(int i=0;i<a.length();i++) {
		 * 
		 * if(i%2==0) { b = b+ a.charAt(i); System.out.println("if : "+b);
		 * 
		 * } else { b = a.charAt(i)+b; System.out.println("else : "+b); }
		 * 
		 * } System.out.println("out : "+b);
		 */
		//&&&&&&&&&&&&&&&&&&&&&&&	
		 char[] ch = a.toCharArray();
		 
	        // Traverse the character array
	        for (int i = 0; i < ch.length-1; i = i+ 2) {
	 
	            // Swapping the characters
	            char temp = ch[i];
	            ch[i] = ch[i + 1];
	            ch[i + 1] = temp;
	        }
	 
	        System.out.println( new String(ch));
	    
	}
	
	public void numberOfSubstring() {
		String a = "Sandy Ravon ";
		String b="";
		int count=0;
		
		//System.out.println(a.substring(2,1));
		
		  for(int i=0;i<=a.length();i++) {
			  for(int j =i+1;j<=a.length();j++) { 
				  b =  a.substring(i,j);
				  System.out.println(b);
				  count++;
				  }
			  }	 
		  System.out.println(count);
		}
	
	public void replaceString() {
		String a = "Sangy";
		String b ="";
		char c;
		
		for(int i =0;i<a.length();i++) {
			c = a.charAt(i);
			if(i==3) {
			b = b + 'd';
			}
			else {
				b = b + c;
			}			
		}
		System.out.println(b);
	}
	
	public void removeStartZeros() {
		String a = "000012356090";
		int Start=0;
		char c;
		int n = 'z' - 'a';
		boolean m = false;
		for(int i =0;i<a.length();i++) {
			c= a.charAt(i);
			if(c!='0') {
				Start = i;
				break;
			}
			
		}
		System.out.println(a.substring(Start,a.length()));
		System.out.println(n);
		System.out.println(!m);
		
		
	}
	
	public void str() {
		
		String a = "santhosh";
		String b = "Compssasnys";
		Map<Character,Integer> hash = new HashMap<Character,Integer>();
		Map<Character,Integer> hash1 = new HashMap<Character,Integer>();
		
		
		for(int i =0;i<a.length();i++) {
			if(hash.containsKey(a.charAt(i))) {
				hash.put(a.charAt(i), hash.get(a.charAt(i))+1);
			}
			else {
				hash.put(a.charAt(i), 0);
			}
			
			
		}
            
		 for (char c : b.toCharArray()) {
	            if (hash.containsKey(c)) {
	                hash1.put(c, hash1.getOrDefault(c, 0) + 1);
	            }
	        }
      
     for(Map.Entry m : hash1.entrySet()) {
    	
    	 int e = Integer.parseInt(m.getValue().toString());
    	 if(e>0) {
    		 e=e+1;
    		 System.out.println(m.getKey().toString()+"="+e);
    	 }
    	
     }
      
    	  System.out.println(hash1);
      }
		
			
			


	
	
	public static void main(String[] args) {
		Testing2 t = new Testing2();
		//t.strRev();
		//t.strAry();
		//t.swapStr();
		//t.numberOfSubstring();
		//t.replaceString();
		//t.removeStartZeros();
		t.str();
		
			}

}
