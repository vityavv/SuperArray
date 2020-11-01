class SuperArray {
	private String[] data;
	private int size;
	public SuperArray() {
		data = new String[10];
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
	private void resize() {
		String[] newData = new String[data.length + 1];
		for (int i = 0; i < data.length; i++) newData[i] = data[i];
		data = newData;
	}
}
