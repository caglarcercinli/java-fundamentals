package be.vdab;

public class Jaar {
    private final int jaar;

    public Jaar(int jaar) {
        this.jaar = jaar;
    }
    public boolean isSchrikkeljaar(){
        if (jaar%400==0){
            return true;
        }
        if (jaar%100==0){
            return false;
        }
        return jaar%4 == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(jaar);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jaar){
            var ander =(Jaar) obj;
            return jaar== ander.jaar;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return jaar;
    }
}
