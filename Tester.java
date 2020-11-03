class Tester {
	public static void main(String[] args) {
		SuperArray letters = new SuperArray();
		System.out.println(letters.isEmpty());
		letters.add("a");
		letters.add("b");
		letters.add("c");
		System.out.println(letters.toString().equals("[a, b, c]"));
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
		System.out.println(!letters.contains(null));
		letters.add(null);
		System.out.println(letters.size() == 13);
		System.out.println(letters.get(11).equals("l"));
		System.out.println(letters.contains("k"));
		System.out.println(letters.contains(null));
	}
}
