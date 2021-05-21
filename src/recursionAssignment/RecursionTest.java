package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    

    // count7 Tests
    @Test
    public void Test1(){
        // Base case
        assertEquals(0, Recursion.count7(0));
    }

    @Test
    public void Test2(){
        // Recursion tests
        assertEquals(2, Recursion.count7(717));
    }

    @Test
    public void Test3(){
        // Recursion tests
        assertEquals(5, Recursion.count7(71789777));
    }

    @Test
    public void Test4(){
        // Extreme Case- all 7's
        assertEquals(9, Recursion.count7(777777777));
    }

    @Test
    public void Test5(){
        // Extreme case- no 7's
        assertEquals(0, Recursion.count7(1234568));
    }

    @Test
    public void Test6(){
        // Extreme Case- all 0's
        assertEquals(0, Recursion.count7(0000000));
    }


    
    
    
    
    
    
    
}


