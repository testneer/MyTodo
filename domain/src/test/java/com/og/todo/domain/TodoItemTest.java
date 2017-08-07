package com.og.todo.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by orenegauthier on 07/08/2017.
 */

public class TodoItemTest {


    private static final String ITEM_TITLE = "do it";

    private TodoItem item;
    @Before
    public void setUp() {
        item = new TodoItem(ITEM_TITLE);
    }

    @Test
    public void test_WHEN_item_created_THEN_title_is_correct() {
        assertEquals(item.getTitle(), ITEM_TITLE);
    }
}
