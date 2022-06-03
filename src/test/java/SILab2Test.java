import org.junit.jupiter.api.Test;

import java.util.List;
 import static  org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void everyBranchAndStatementTest(){
        List<String> test_case_1=List.of();
        List<String> test_case_2=List.of("0","#");

        IllegalArgumentException arg1, arg2;

        arg1=assertThrows(IllegalArgumentException.class,()->SILab2.function(test_case_1));
        assertTrue(arg1.getMessage().contains("List length should be greater than 0"));

        arg2=assertThrows(IllegalArgumentException.class,()->SILab2.function(test_case_2));
        assertTrue(arg2.getMessage().contains("List length should be a perfect square"));

        List<String> slucaj3=List.of("0", "#" , "0" , "#" , "0" ,"#", "0" ,"#" ,"#");
        List<String> slucaj3_1=List.of("2","#","2","#","4","#","2","#","#");

        assertEquals(SILab2.function(slucaj3),slucaj3_1);
    }
}
