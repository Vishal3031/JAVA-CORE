class Z_to_A {
	public static void main(String[] args) {
		char ch='Z';
		char ch1='A';

		while(ch>=ch1) {
			System.out.println(ch);
			ch=(char)(ch-1);
			//ch--;
		}
	}
}