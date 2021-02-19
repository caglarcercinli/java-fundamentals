import be.vdab.domain.Rechthoek;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RechthoekTest {

    @Test
    void eenRechthoekOp5en3is15(){
        Assertions.assertThat(new Rechthoek(5,3).getOppervlakte()==15);
    }
    @Test
    void eenRechthoekOp5en3is16(){
        Assertions.assertThat(new Rechthoek(5,3).getOppervlakte()==16);
    }

    @Test
    void eenRechthoek34IsGelijkAanDezelfdeRechthoek() {
        Assertions.assertThat(new Rechthoek(3,4)).isEqualTo(new Rechthoek(3,4));
    }

    @Test
    void eenRechthoek34heeftDezelfdeHascodeMetDezelfdeRechthoek() {
        Assertions.assertThat(new Rechthoek(3,4)).hasSameHashCodeAs(new Rechthoek(3,4));
    }

    @Test
    void deLengteMagNiet0ofNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(
                ()->new Rechthoek(-3,4)
                );
    }
}
