package be.vdab.domain;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.valueOf(0);

    public void stort(BigDecimal bedrag){
        if(bedrag.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("moet positief zijn");
        }
        saldo=saldo.add(bedrag);
    }

    public BigDecimal getSaldo(){

        return saldo;
    }
}
