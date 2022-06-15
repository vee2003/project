public class StrRev {  
    	public static void main(String[] args) {  
        	// Initialize array  
        	String[] arr = new String[] {"Hi", "I'm", "Andrea", "Anne", "Orca"};  
        	for (int i = 0; i < arr.length; i++) {  
            	System.out.print(arr[i] + " ");  
        	}  

        	System.out.println();  

        	// Reverse the order of array
        	for (int i = arr.length-1; i >= 0; i--) {  
            	System.out.print(arr[i] + " ");  
        	}  
    	}  
}  