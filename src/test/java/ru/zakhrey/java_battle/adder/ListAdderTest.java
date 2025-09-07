package ru.zakhrey.java_battle.adder;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.zakhrey.java_battle.adder.ListAdder.addDoubleToList;

public class ListAdderTest {

    @Test
    public void add2ElementsTest() {
        val list = new ArrayList<Double>();

        addDoubleToList(list, 5);
        assertEquals(5, list.size());

        addDoubleToList(list, 7);
        assertEquals(12, list.size());
    }

}
