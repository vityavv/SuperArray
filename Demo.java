public class Demo {
	public static void removeDuplicates(SuperArray s) {
		for (int i = 0; i < s.size(); i++) {
			if (i != s.indexOf(s.get(i))) {
				s.remove(i);
				i--;
			}
		}
	}
	public static SuperArray findOverlap(SuperArray a, SuperArray b) {
		SuperArray result = new SuperArray(Math.min(a.size(), b.size()));
		for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
			if (a.size() > i && b.contains(a.get(i)) && !result.contains(a.get(i))) result.add(a.get(i));
			if (b.size() > i && a.contains(b.get(i)) && !result.contains(b.get(i))) result.add(b.get(i));
		}
		return result;
	}
	public static SuperArray zip(SuperArray a, SuperArray b) {
		SuperArray result = new SuperArray(a.size() + b.size());
		for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
			if (i < a.size()) result.add(a.get(i));
			if (i < b.size()) result.add(b.get(i));
		}
		return result;
	}
}
