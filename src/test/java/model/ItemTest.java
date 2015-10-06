package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testItemCreationWithValidName() throws Exception {
        Item pencil = new Item("Pencil");
        assertEquals("Pencil", pencil.getName());
    }

    @Test(expected = Exception.class)
    public void testItemCreationWithInvalidName() throws Exception {
        new Item("");
    }
}