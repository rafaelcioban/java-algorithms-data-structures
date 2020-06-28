package com.rcioban.datastructures.hashtable;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class HashTableTest {

    private HashTable<String, Integer> myTestHashTable;

    @Before
    public void setUp() {
        this.myTestHashTable = new HashTable();
    }

    @Test
    public void testHashTable() {
        // When
        this.myTestHashTable.put("4", 40);
        this.myTestHashTable.put("6", 60);
        this.myTestHashTable.put("4", 70);
        this.myTestHashTable.put("8", 80);
        this.myTestHashTable.put("9", 90);
        this.myTestHashTable.put("5", 50);

        // Then
        assertTrue(this.myTestHashTable.keyExists("4"));
        assertTrue(this.myTestHashTable.keyExists("6"));
        assertFalse(this.myTestHashTable.keyExists("2"));
        assertFalse(this.myTestHashTable.keyExists("10"));
        assertEquals(new Integer(40), this.myTestHashTable.get("4"));
        assertEquals(new Integer(50), this.myTestHashTable.get("5"));
    }
}
