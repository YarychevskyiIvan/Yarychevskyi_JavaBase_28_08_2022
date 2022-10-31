import com.hillel.yarychevskyi.lessons.lesson16.ArraysUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilTest {
    static int [] arraysTest;
    @BeforeAll
    static void beforeAll (){
        arraysTest = new int[] {5,5,5,5,5};
    }
    @Test
   public void test1 (){
       assertTrue(ArraysUtil.getArrays(new int[5][5]));
    }
    @Test
    public void test2 (){
        assertFalse (ArraysUtil.getArrays(null));
    }
    @Test
    public void test3 (){
        double value = ArraysUtil.getArithmeticMeanArrays(new int[]{});
        assertEquals(0.0, value);
    }
    @Test
    public void test4 (){
        double value = ArraysUtil.getArithmeticMeanArrays(null);
        assertEquals(0.0, value);
    }
    @Test
    public void test5 (){
        double value = ArraysUtil.getArithmeticMeanArrays(arraysTest);
        assertEquals(5.0, value);
    }

}
