package be.vdab.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class RekeningTest {
    private Rekening rekening;
    private static final BigDecimal TWEE = BigDecimal.valueOf(2);
  @BeforeEach
  void beforeEach(){
      rekening=new Rekening();
  }
  @DisplayName("zero saldo")
    @Test
    void hetSaldoVanEenNieuweRekeningis0€() {
        //var rekening=new Rekening();
        assertThat(rekening.getSaldo().equals(BigDecimal.ZERO));
    }

    @Test
    void hetGestortebedragMagNietNullZijn() {
      assertThatIllegalArgumentException().isThrownBy(
              ()->rekening.stort(BigDecimal.ZERO)
      );
    }


    @Test
    void eenNieuweRekeningHeeftGeenStortingen() {
      assertThat(rekening.getStortingen()).isEmpty();
    }
    @Test
    void nadatJe10€StortIsErEenStortingVan10€() {
        rekening.stort(BigDecimal.TEN);
        assertThat(rekening.getStortingen()).containsOnly(BigDecimal.TEN);
    }
    @Test
    void nadatJe10€En1€StortZijnDeStortingen10€En1€() {
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getStortingen())
                .containsExactly(BigDecimal.TEN, BigDecimal.ONE);
    }
    @Test
    void nadatJe10€En1€En2€StortZijnDeStortingenGesorteerd1€En2€En10€() {
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        rekening.stort(TWEE);
        assertThat(rekening.getStortingenGesorteerd()).isSorted()
.containsExactly(BigDecimal.ONE, TWEE, BigDecimal.TEN); }
}