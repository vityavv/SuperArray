class SuperArray {
	private String[] data;
	private int size;
	public SuperArray() {
		data = new String[10];
		size = 0;
	}
	public SuperArray(int initialCapacity) {
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Initial capacity may not be less than zero");
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
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for SuperArray with size " + size);
		}
		return data[index];
	}
	public String set(int index, String element) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for SuperArray with size " + size);
		}
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}
	public void add(int index, String element) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for SuperArray with size " + size);
		}
		if (data.length == size) resize();
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		size++;
	}
	public String remove(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for SuperArray with size " + size);
		}
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
	public int lastIndexOf(String s) {
		for (int i = size - 1; i >= 0; i++) {
			if (data[i] == s || s != null && data[i].equals(s)) return i;
		}
		return -1;
	}
	public boolean equals(SuperArray other) {
		if (other.size() != size) return false;
		for (int i = 0; i < size; i++) {
			if (!(other.get(i) == data[i] || other.get(i) != null && other.get(i).equals(data[i]))) return false;
		}
		return true;
	}
}
