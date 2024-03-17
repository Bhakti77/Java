//syntax error
//logical error
//runtime error

public class Exception_handling {
    
    // Java program that demonstrates the use of throw

	public static void main(String[] args) {
		
		try{
			int a[] = {1,2,3};
			System.out.println(a[4]);
			throw new IndexOutOfBoundsException("Index nhi h");
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

}
}
