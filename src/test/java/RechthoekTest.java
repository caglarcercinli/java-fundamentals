import be.vdab.domain.Rechthoek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RechthoekTest {
    @Test
    void eenRechthoekOp5en3is15(){
        Assertions.assertTrue(new Rechthoek(5,3).getOppervlakte()==15);
    }
    @Test
    void eenRechthoekOp5en3is16(){
        Assertions.assertFalse(new Rechthoek(5,3).getOppervlakte()==16);
    }
}
