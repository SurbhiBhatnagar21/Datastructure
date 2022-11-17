
public class QuadraticHashingTest {


		private static void printValues(int arr[]) 
		{
			for(int i=0;i<arr.length;i++) {
				System.out.println("arr:"+arr[i]);
			}
		}
		public static void quadraticHashing(int table[],int size,int arr[],int N) 
		{

			for(int i=0;i<N;i++) 
			{
				
				int hashValue = arr[i]%size;
				if(table[hashValue]== -1)
					table[hashValue]=arr[i];
				else {
					for(int j=0;j<size;j++)
					{
						int t=(hashValue + j*j)%size;
						
						if(table[t]==-1)
						{
							table[t] =arr[i];
							break;
						}
					}
				}	
			}
			
			printValues(table);
		}
		
		public static void main(String[]args) {
			int arr[] = {103,700,76,85,92,73,28};
			int N=arr.length;
			int L =arr.length;
			int hashTable[]=new int[N];
			for(int i=0;i<hashTable.length;i++) {
				hashTable[i]=-1;
				
			}
			quadraticHashing(hashTable,N,arr, N);
		}

	}


