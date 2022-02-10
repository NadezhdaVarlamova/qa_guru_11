package gmail.com.varlamvanadia1996.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTests {
    @Test
    void SimpleTest1(){
        Assertions.assertTrue(2>3);
    }

    @Test
    void SimpleTest2(){
        Assertions.assertTrue(1>3);
    }

    @Test
    void SimpleTest3(){
        Assertions.assertTrue(3==3);
    }

    @Test
    void SimpleTest4(){
        Assertions.assertTrue(1!=3);
    }

}

