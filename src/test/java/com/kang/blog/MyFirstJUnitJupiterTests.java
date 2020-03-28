package com.kang.blog;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.kang.blog.util.Calculator;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private  Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

}