
public class LinearProbingTest {

	public static void main(String[] args) {
     LinearProbingHashSet lp = new LinearProbingHashSet(5);
     lp.insertElement("ind","India");
     lp.insertElement("usa","America");
     lp.insertElement("uk","London");
     lp.insertElement("chi","China");
     lp.insertElement("uae","Emirates");
     
     String countryName =lp.get("ukk");
     System.out.println("CountryName:"+countryName);
	}
}



	
	class LinearProbingHashSet
	{
		String keys[]; // array
		String vals[]; //array
		int maxSize,currentSize;
		
		LinearProbingHashSet(int capacity) {
			currentSize=0;
			maxSize = capacity; //5
			keys = new String [ maxSize];
			vals = new String [ maxSize];
		}
		
		private int getSize() {
			return currentSize;
		}
		
		public String get(String keyToFind)
		{
			int i = hash(keyToFind);
			
			while(keys[i]!=null) {
				if(keys[i].equals(keyToFind)) 
					return vals[i]; //if found return it;
				
				i=(i+1)%maxSize;
			}
			return null;
		}
		
		private int hash(String key) {
			System.out.println("key.hashCode         : "+key.hashCode());
			System.out.println("key.hashCode%maxSize : "+(key.hashCode()%maxSize));
			return key.hashCode() % maxSize;//0 to 4
		}
								//"ind"			"India"
		public void insertElement(String key, String val) {
			System.out.println("inserting element...");
			int temp = hash(key);
			int i = temp; //0
			
			do {
					if(keys[i]==null) {
						keys[i]=key;
						vals[i]=val;
						currentSize++;
						return;
					}
						//ind         uae
					if(keys[i].equals(key)) {
						vals[i] = val;
						return;
					}
					i = (i+1)%maxSize; // 2%5=2
			} while (i!=temp);
		}
	}

	


