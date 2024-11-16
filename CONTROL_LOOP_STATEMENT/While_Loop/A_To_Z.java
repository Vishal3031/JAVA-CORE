class A_To_Z {
	public static void main(String[] args) {
		char ch='A';
		char ch1='Z';

		while(ch<=ch1) {
			System.out.println(ch);
			ch=(char)(ch+1);
			//ch++;
		}
	}
}