
package dataobjects;

import java.util.HashMap;

public enum DataStorage {

	INSTANCE;

	private HashMap<String, Object> storage = new HashMap<>();

	public Object get(String key) {
		return storage.get(key);
	}

	public void set(String key, Object value) {
		storage.put(key, value);
	}

}
