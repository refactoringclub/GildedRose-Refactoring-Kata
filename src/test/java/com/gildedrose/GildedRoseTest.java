package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void testZeroes() {
        Item[] items = new Item[] { new Item("zero", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("nottherightname", app.items[0].name);
    }

}
