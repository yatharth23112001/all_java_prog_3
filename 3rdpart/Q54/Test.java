class Test
{
	public static void main(String[] args) {
		String Str = new String("   Welcome Ayan   ");
		System.out.println("Return Value :");
		System.out.println(Str.length());
		System.out.println(Str.trim());
		Str = Str.trim();
		System.out.println(Str.length());
	}
}