public class Lab3a
{
    public static void main(String[] args)
    {
        int[] anArray;  // declares an array of integers

        anArray = new int[5];  // allocates memory for 5 integers
        
        for ( int i=0; i < anArray.length; i++)
        {
        anArray[i]=i*100+100;
        	
      /*anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // etc.
        anArray[3] = 400;
        anArray[4] = 500; */
        }
        for ( int i=0; i< anArray.length; i++)
        {
        	System.out.println("Element at index " +  i + ": "+ anArray[i]);
        /*System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);*/
        }
    }
}


