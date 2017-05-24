package binary_search;

public class Main {

	public static int calculateIndexMidLength(int loIndex,int hiIndex){
		int returnValue=0;
		if(loIndex<hiIndex){
			
		}
		return returnValue;
		
	}
	
	static int[] arrs = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}
	;
	public static int binarySearch(int e,int[] arr){
		
		int loIndex = 0;
		int hiIndex = arr.length-1;
		while(loIndex<=hiIndex){
		
			int midIndex =  loIndex +( (hiIndex-loIndex)/2) ;	
			System.out.println("Mid :"+midIndex+" Lo : "+loIndex +" Hi: "+hiIndex);
	
			if(e== arr[midIndex] ){
				return  arr[midIndex];
			}
			
			if(  e>arr[midIndex]){
				loIndex = midIndex+1;
				
			}
			if( e< arr[midIndex] ){
				hiIndex = midIndex-1;
			}
			
	

		}
		
		
		
		
		
		
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binarySearch(1,arrs));;
	}

}
