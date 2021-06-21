package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    


    // count7 Tests
    @Test
    public void Test1_1(){
        // Base case
        assertEquals(0, Recursion.count7(0));
    }

    @Test
    public void Test1_2(){
        // Recursion tests
        assertEquals(2, Recursion.count7(717));
    }

    @Test
    public void Test1_3(){
        // Recursion tests
        assertEquals(5, Recursion.count7(71789777));
    }

    @Test
    public void Test1_4(){
        // Corner Case- all 7's
        assertEquals(9, Recursion.count7(777777777));
    }

    @Test
    public void Test1_5(){
        // Corner case- no 7's
        assertEquals(0, Recursion.count7(1234568));
    }

    @Test
    public void Test1_6(){
        // Corner Case- all 0's
        assertEquals(0, Recursion.count7(0000000));
    }

    @Test
    public void Test2_1(){
        assertEquals("", Recursion.changePi(""));
    }

    @Test
    public void Test2_2(){
        // Recursive step case
        assertEquals("3.14", Recursion.changePi("pi"));
    }
    @Test
    public void Test2_3(){
        // Recursive step case
        assertEquals("3.143.14", Recursion.changePi("pipi"));
    }
    @Test
    public void Test2_4(){
        // recursive step case
        assertEquals("3.14abc3.14", Recursion.changePi("piabcpi"));
    }

    @Test
    public void Test2_5(){
        // corner case
        assertEquals("i3.143.143.143.14p", Recursion.changePi("ipipipipip"));
    }

    @Test
    public void Test2_6(){
        // corner case
        assertEquals("pp3.14ii", Recursion.changePi("pppiii"));
    }

    @Test
    public void Test3_1(){
        assertEquals("piza", Recursion.stringClean("pizza"));
    }

    @Test
    public void Test3_2(){
        assertEquals("", Recursion.stringClean(""));
    }

    @Test
    public void Test3_3(){
        assertEquals("hlo", Recursion.stringClean("hhhlllooo"));
    }
    
    @Test
    public void Test3_4(){
        // corner case
        assertEquals("h", Recursion.stringClean("hhhhhhhhhhhhh"));
    }


    @Test
    public void Test3_5(){
        // corner case
        assertEquals("abcde", Recursion.stringClean("aaaaaaabbbbbbbbbbbcccccccccdeeeeeeee"));
    }   
    

    
    
}


