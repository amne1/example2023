import java.util.ArrayList;
//hey
/**
 * @author amnes
 */
public class SharedData 
{
	/**
	 * array is the array of numbers
	 * winArray is the array of successful tries of the threads
	 * flag is the flag for knowing if the sum is found
	 * b is the wanted number to check
	 */
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array is the array of numbers
	 * @param bis the wanted number to check
	 * -constructor-
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return the success of the tries
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray is the array of successful tries of the threads
	 * it sets the WinArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return the WinArray
	 * get that array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the b that is the wanted checked number
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return the flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * sets the flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
