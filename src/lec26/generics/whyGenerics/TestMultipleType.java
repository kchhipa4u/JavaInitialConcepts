package lec26.generics.whyGenerics;

class KeyValue<K, V> {

	private K key;
	private V value;

	public KeyValue(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "KeyValue [key=" + key + ", value=" + value + "]";
	}
}

public class TestMultipleType {

	public static void main(String[] args) {
		KeyValue<Integer, String> kv1 = new KeyValue<>(1, "Rohan");
		System.out.println(kv1);
	}
}
