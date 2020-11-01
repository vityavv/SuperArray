class Tester {
	public static void main(String[] args) {
		SuperArray letters = new SuperArray();
		letters.add("a");
		letters.add("b");
		letters.add("c");
		letters.add("d");
		letters.add("e");
		letters.add("f");
		letters.add("g");
		System.out.println(letters.size() == 7);
		System.out.println(letters.get(4).equals("e"));
		letters.set(4, "4");
		System.out.println(letters.get(4).equals("4"));
		letters.add("h");
		letters.add("i");
		letters.add("j");
		letters.add("k");
		letters.add("l");
		System.out.println(letters.size() == 12);
		System.out.println(letters.get(11).equals("l"));
	}
}
