class three_table_to_infinite {
	public static void main(String[] args) {
		int num=3;
		int num1=1;

		boolean b=true;
		while(b) {
			System.out.println(num+" * "+num1+" = "+ (num*num1));
			num1=num1+1;





/*Your original code had an infinite loop printing numbers very quickly. This can cause issues in some programming environments or editors:

Buffering: Some editors or IDEs don't immediately show the output on the screen. Instead, they "buffer" it and display everything at once when there's a lot to print. So, the numbers might not have been printed one by one as expected.

Too Fast: The loop was running so fast that it could be hard for the console (where output is shown) to keep up and display the numbers in real-time.*/


			try {
                		Thread.sleep(500);  // Adds a 500ms delay between prints
            		} 
			catch (InterruptedException e) {
                		e.printStackTrace();   // Print the error if it occurs
            		}
		}
	}
}
		