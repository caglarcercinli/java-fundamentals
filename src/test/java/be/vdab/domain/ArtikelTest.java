package be.vdab.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ArtikelTest {
    @Test
    void honderdEuroExclusiefMet8percentis108Euro(){
        Assertions.assertThat(new Artikel(BigDecimal.valueOf(100),BigDecimal.valueOf(6)).getPrijsInclusiefBtw().equals(BigDecimal.valueOf(107)));
    }

}