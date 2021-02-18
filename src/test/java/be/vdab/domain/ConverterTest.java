package be.vdab.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class ConverterTest {
    @Test
    @DisplayName("dat klopt")
    void eenInchIs2Komma54Centimeters(){
       assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ONE))
    .isEqualByComparingTo("2.53");
    }

}