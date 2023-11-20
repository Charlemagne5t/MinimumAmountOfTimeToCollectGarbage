import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String[] garbage = {"MMM","PGM","GP"};
        int[] travel = {3,10};

        Assert.assertEquals(37, new Solution().garbageCollection(garbage, travel));
    }
}
