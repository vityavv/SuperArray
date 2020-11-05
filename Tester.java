import java.util.Arrays;
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
		letters.add(11, "q");
		System.out.println(letters.get(12).equals("l"));
		System.out.println(letters.get(11).equals("q"));
		System.out.println(letters.remove(11).equals("q"));
		System.out.println(letters.get(11).equals("l"));
		System.out.println(letters.indexOf("l") == 11);
		System.out.println(letters.indexOf(null) == 12);
		System.out.println(letters.toString());
		System.out.println(Arrays.toString(letters.toArray()));

		SuperArray b = new SuperArray();
		b.add("a");b.add("4");b.add("l");b.add("4");
		System.out.println(b.toString());
		SuperArray.removeDuplicates(b);
		System.out.println(b.toString());
		System.out.println(SuperArray.findOverlap(letters, b).toString());
		System.out.println(SuperArray.findOverlap(b, letters).toString());
		System.out.println(letters.contains("a"));
		System.out.println(letters.contains(b.get(0)));
		letters.clear();
		System.out.println(letters.size() == 0);
		SuperArray c = new SuperArray();
		c.add("a");c.add(null);c.add("4");c.add("l");c.add("4");
		SuperArray d = new SuperArray();
		d.add("a");d.add(null);d.add("4");d.add("l");d.add("4");
		System.out.println(!letters.equals(b));
		System.out.println(d.equals(c));
		System.out.println(d.lastIndexOf("4") == 4);
	}
}
