package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {

    @Test
    public void addIntegers() {
        // given
        AddService service = new AddService();

        // when
        Result result1 = service.add(8, 2);
        Result result2 = service.add(10, 5);
        
        

        // then
        assertEquals(result1.getResult(), 4);
        assertEquals(result2.getResult(), 2);
        
    }
}
