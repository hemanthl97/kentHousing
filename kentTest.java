public class kentTest
{
	public static void main(String[] args) {
		
		
		//pass arguments before executing the code 
		//pass like this "1,2,3,4" 5
		String numArr[] = args[0].split(",");
		long toAdd = Long.parseLong(args[1]);
		
        char resArr[] = myAdd(numArr,toAdd);

        
        //output print
        for(char ch : resArr){
            System.out.print(ch+",");
        }		
	}
	
	
	public static char[] myAdd(String numArr[], long toAdd){
	    
	    //converting array to number
		StringBuilder str = new StringBuilder();
        for (String  n : numArr){
             str.append(n);
        } 
        
        //adding the  number and converting back to array
        long  res = Integer.parseInt(str.toString())    +   toAdd;
        String resString = Long.toString(res);
        
        char resArr[] = resString.toCharArray();
	    
	    return resArr;
	}
	
	
	
}

/*
public class kentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inputs
				long numArr[] = {5,6,7,8};
				long toAdd = 500;
				
			    char resArr[] = myAdd(numArr,toAdd);
		        
		        //output print
				System.out.print("[");
		        for(char ch : resArr){
		        
		            System.out.print(ch+",");
		            
		            

	}
		        System.out.print("]");

}
	public static char[] myAdd(long numArr[], long toAdd){
	    
    	//converting array to number
	StringBuilder str = new StringBuilder();
    for (long n : numArr){
         str.append(n);
    } 
    
    //adding the  number and converting back to array
    long  res = Integer.parseInt(str.toString())    +   toAdd;
    String resString = Long.toString(res);
    
    char resArr[] = resString.toCharArray();
    
    return resArr;
}


}*/
