import static org.junit.Assert.*;

public class TradeTest {

    @org.junit.Test
    public void value() {
        var trade1 = new Trade("PPSPP","WES",23,43.211);
        assertEquals((23*43.211),trade1.value(),0.001);
    }
}