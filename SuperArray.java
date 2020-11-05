class SuperArray {
	private String[] data;
	private int size;
	public SuperArray() {
		data = new String[10];
		size = 0;
	}
	public SuperArray(int initialCapacity) {
		data = new String[initialCapacity];
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean add(String element) {
		if (data.length == size) resize();
		data[size] = element;
		size++;
		return true;
	}
	public String get(int index) {
		return data[index];
	}
	public String set(int index, String element) {
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}
	public void add(int index, String element) {
		if (data.length == size) resize();
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		size++;
	}
	public String remove(int index) {
		String removing = data[index];
		for (int i = index; i < size - 1; i++) {
			data[i] = data[i+1];
		}
		size--;
		return removing;
	}
	public void clear() {
		data = new String[size];
		size = 0;
	}
	private void resize() {
		String[] newData = new String[data.length * 2];
		for (int i = 0; i < data.length; i++) newData[i] = data[i];
		data = newData;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public String toString() {
		if (size == 0) return "[]";
		String result = "[";
		for (int i = 0; i < size - 1; i++) {
			result += data[i] + ", ";
		}
		return result + data[size - 1] + "]";
	}
	public String[] toArray() {
		String[] result = new String[size];
		for (int i = 0; i < size; i++) {
			result[i] = data[i];
		}
		return result;
	}
	public boolean contains(String s) {
		for (int i = 0; i < size; i++) {
			if (data[i] == s || s != null && data[i].equals(s)) return true;
		}
		return false;
	}
	public int indexOf(String s) {
		for (int i = 0; i < size; i++) {
			if (data[i] == s || s != null && data[i].equals(s)) return i;
		}
		return -1;
	}

	public static void removeDuplicates(SuperArray s) {
		for (int i = 0; i < s.size(); i++) {
			if (i != s.indexOf(s.get(i))) s.remove(i);
		}
	}
	public static SuperArray findOverlap(SuperArray a, SuperArray b) {
		SuperArray result = new SuperArray(Math.min(a.size(), b.size()));
		for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
			if (a.size > i && b.contains(a.get(i)) && !result.contains(a.get(i))) result.add(a.get(i));
			if (b.size() > i && a.contains(b.get(i)) && !result.contains(b.get(i))) result.add(b.get(i));
		}
		return result;
	}
}
