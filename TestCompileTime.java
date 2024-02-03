public class TestCompileTime
{

	public TestCompileTime()
	{}

	public static void main(String[] args)
	{
		int[] numbers = new int[4];
		for (int i=0; i<4; i++)
		{
			numbers[i] = i;
		}
		if(Debug.DEBUG)
  		{
			System.err.println("Debug is turned on");
			System.out.println();
			TestCompileTime t = new TestCompileTime();
	        for (int i : numbers){
				System.out.println("DEBUG_STATEMENT: number[" + i + "]=" + i);
			}
  		}
  		else {
			System.out.println("Debug is turned off");
		}
		for (int i=0; i<4; i++){
			int element = numbers[i];
			System.out.print(element + ", ");
		}
 	}



}