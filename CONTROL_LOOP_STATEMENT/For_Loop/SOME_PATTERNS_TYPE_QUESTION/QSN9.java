class QSN9 {
	public static void main(String[] args) {
	
	    //outer loop (row-wise)
		for(char ch='C' ; ch>='A'; ch--) {
		   //inner loop (column-wise)
			for(int i=1; i<=3; i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}