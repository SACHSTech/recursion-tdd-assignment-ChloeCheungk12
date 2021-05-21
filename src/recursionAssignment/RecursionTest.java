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


    
    
    
    
    
    
    
}


