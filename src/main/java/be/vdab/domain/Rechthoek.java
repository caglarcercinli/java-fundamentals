package be.vdab.domain;

import java.util.Objects;

public class Rechthoek {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte) {
        if (lengte>0 && breedte>0){
            this.lengte = lengte;
            this.breedte = breedte;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public int getOppervlakte() {
        return lengte * breedte;
    }

    public int getOmtrek() {
        return (lengte + breedte) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rechthoek) {
            var ander = (Rechthoek) obj;
            return lengte == ander.lengte && breedte == ander.breedte;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedte,lengte);
    }
}
