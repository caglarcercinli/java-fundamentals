package be.vdab.domain;

public class Rechthoek {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }
    public int getOppervlakte(){
        return lengte*breedte;
    }
    public int getOmtrek(){
        return (lengte+breedte)*2;
    }
}
