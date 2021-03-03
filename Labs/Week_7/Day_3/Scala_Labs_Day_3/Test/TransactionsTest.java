import org.junit.Test;

import static org.junit.Assert.*;
//import default._
import defaults.Trade;
public class TransactionsTest {

    @Test
    public void amount() {
        var t5 = new Transactions("T1", "APPL", 100, 15.25);
        assertEquals( 1726.875,t5.amount(),0.001);

    }
}