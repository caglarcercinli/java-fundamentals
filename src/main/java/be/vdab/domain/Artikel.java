package be.vdab.domain;

import java.math.BigDecimal;

public class Artikel {
    private final BigDecimal prijsExclusiefBtw;
    private final BigDecimal btwPercentage;

    public Artikel(BigDecimal prijsExclusiefBtw, BigDecimal btwPercentage) {
        this.prijsExclusiefBtw = prijsExclusiefBtw;
        this.btwPercentage = btwPercentage;
    }
    public BigDecimal getPrijsInclusiefBtw(){
        return prijsExclusiefBtw.add(prijsExclusiefBtw.multiply(btwPercentage).divide(BigDecimal.valueOf(100)));
    }
}
