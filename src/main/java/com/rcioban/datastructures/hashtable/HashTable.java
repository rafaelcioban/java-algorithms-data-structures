package com.rcioban.datastructures.hashtable;

/**
 * Basic implementation of a HashTable
 *
 * @author rcioban
 */
public class HashTable<K,V> {

	private static final int TABLE_SIZE = 100;
	private HashTableRecord[] tableData = new HashTableRecord[TABLE_SIZE];
	
	public void put(K key, V value) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (!isEmpty(slot)) {
			slot = hash(keyCode, ++step);
		}
		tableData[slot] = new HashTableRecord<K, V>(key, value);
	}
	
	public boolean keyExists(K key) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
			slot = hash(keyCode, ++step);
		}
		if (tableData[slot] != null) return true;
		return false;
	}
	
	public V get(K key) {
		int keyCode = key.hashCode();
		int step = 0;
		int slot = hash(keyCode, step);
		while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
			slot = hash(keyCode, ++step);
		}
		if (tableData[slot] != null) return (V) tableData[slot].getData();
		return null;
	}
	
	private int hash(int key, int step) {
		if (step == 0)
			return key % TABLE_SIZE;
		return (key % TABLE_SIZE + step*step) % TABLE_SIZE;
	}
	
	private boolean isEmpty(int slot) {
		return tableData[slot] == null;
	}
	
	private class HashTableRecord<K, V> {
		K key;
		V data;
		
		public HashTableRecord(K key, V data) {
			this.key = key;
			this.data = data;
		}
		
		public K getKey() {
			return this.key;
		}
		
		public V getData() {
			return this.data;
		}
	}
	
	public static void main(String[] args) {
		HashTable ht = new HashTable();

		System.out.println(ht.keyExists("2"));
		System.out.println(ht.keyExists("4"));
		System.out.println(ht.get(2));
	}
}
