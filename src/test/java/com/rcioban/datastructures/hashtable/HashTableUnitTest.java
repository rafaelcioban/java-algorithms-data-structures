package com.rcioban.datastructures.hashtable;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import static org.junit.Assert.assertFalse;

public class HashTableUnitTest {

    private HashTable<String, Integer> myTestHashTable;

    @Before
    public void setUp() {
        this.myTestHashTable = new HashTable();
    }

    @Test
    public void testHashTable() {
        // When
        myTestHashTable.put("4", 40);
        myTestHashTable.put("6", 60);
        myTestHashTable.put("4", 70);
        myTestHashTable.put("8", 80);
        myTestHashTable.put("9", 90);
        myTestHashTable.put("5", 50);

        // Then
        assertTrue(myTestHashTable.keyExists("4"));
        assertTrue(myTestHashTable.keyExists("6"));
        assertFalse(myTestHashTable.keyExists("2"));
        assertFalse(myTestHashTable.keyExists("10"));
        assertEquals(new Integer(40), myTestHashTable.get("4"));
        assertEquals(new Integer(50), myTestHashTable.get("5"));
    }
}
