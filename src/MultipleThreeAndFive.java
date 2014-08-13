
public class MultipleThreeAndFive {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("The sum of all the multiples of 3 or 5 below 1000 is "+sumOfMultipleThreeAndFive(10));
    }
    
    static int sumOfMultipleThreeAndFive(int range)
    {
	int result = 0;
	for(int i=1;i<range;i++){
	    if(i%3==0||i%5==0)
	    {
		result+=i;
	    }
	}
	return result;
    }

}
