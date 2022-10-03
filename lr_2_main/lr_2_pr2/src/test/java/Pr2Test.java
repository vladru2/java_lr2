import org.junit.Assert;
import org.junit.Test;
import ru.rsatu.Pr2;

public class Pr2Test {
    @Test
    public void testIntToJson() {
        int x = 1;
        String jsonExample = "1";
        Assert.assertEquals(jsonExample, Pr2.intToJson(x));
    }

    @Test
    public void testJsonToInt() {
        String json = "1";
        Assert.assertEquals(1, Pr2.jsonToInt(json));
    }
}
