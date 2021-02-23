package be.vdab.domain;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;

import java.math.BigDecimal;

public class WinstService {
    private final OpbrengstRepository totaleOpbrengst;
    private final KostRepository totaleKost;

    public WinstService(OpbrengstRepository totaleOpbrengst, KostRepository totaleKost) {
        this.totaleOpbrengst = totaleOpbrengst;
        this.totaleKost = totaleKost;
    }


    public BigDecimal getWinst() {
      return totaleOpbrengst.findTotaleOpbrengst().subtract(totaleKost.findTotaleKost());
    }

}
