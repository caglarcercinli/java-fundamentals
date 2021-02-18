package be.vdab.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class RekeningTest {
    private Rekening rekening;
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
}