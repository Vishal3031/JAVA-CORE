class QSN14 {
	public static void main(String[] args) {
		int num=9;
	   //outer loop (row-wise)
		for(int i=1; i<=3;i++) {
		   //inner loop (column-wise)
			for(int j=1; j<=3; j++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
		}
	}
}