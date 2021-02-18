package be.vdab.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;

class VeilingTest {
    private Veiling veiling;
    @BeforeEach
    void beforeEach(){
        veiling=new Veiling();
    }

    @Test
    void Nadat€1000BodDoenHoogsteBodis1000€() {
        //var veiling=new Veiling();
        veiling.doeBod(BigDecimal.valueOf(1000));
        assertThat(veiling.getHoogsteBod().equals(BigDecimal.valueOf(1000)));
    }
    @Test
    void Nadat€2000BodDoenHoogsteBodis2000€() {
        //var veiling=new Veiling();
        veiling.doeBod(BigDecimal.valueOf(2000));
        assertThat(veiling.getHoogsteBod().equals(BigDecimal.valueOf(1000)));
    }
}