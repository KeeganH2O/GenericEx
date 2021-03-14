/*** The FirstList class implements a generic array.
*@author  Nathan Johnson
* @version 1.0
* @since   2021-03-07 
*/

public class FirstList<T>
{    

	private final int DEFAULT_SIZE=10;
       	private int currentItem=0;
       	private T arList[];
       	private int LastItem = 10;
  	@SuppressWarnings("unchecked")
    	public FirstList()
    	{        
		// arList=new T[DEFAULT_SIZE];   //causes a compile error                                        				   		// because T is cast to object                                        				  	 // later if we cast object to whatever T is,
				   // say a string,
                                                                    	    	// we have a runtime error                                        				 		 // We could use a java collection like ArrayList for this.                                                                                             		
		arList=(T[]) new Object[DEFAULT_SIZE];
         } 

	  @SuppressWarnings("unchecked")
	    public FirstList(int length)
	    {
		       // arList=new T[length]; //causes a compile error
		       arList=(T[]) new Object[length];
		       LastItem = length+1;
        }

 //Student writes a setter called addItem    //Write code to add an item to the end of the array   

	  public void addItem(T var) {
		  arList[currentItem] = var;
		  currentItem++;
	  }
	  
	  //@SuppressWarnings("unchecked")
	  public T getItem(int item) {
		  
		 return arList[item];
	  }
	  
	  public <T> void displayArray() {
		  
		  currentItem = 0;
		  
		  for(currentItem = 0; currentItem < 10; currentItem++) {
			  System.out.println(arList[currentItem]);
		  }
		  System.out.println("\n");
	  }//end display Array
	  
}


