class QSN11 {
	public static void main(String[] args) {
	   //outer loop(row-wise)
		for(int i=1; i<=3; i++) {
		   //inner loop (column-wise)
			for(char ch='C';ch>='A';ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}