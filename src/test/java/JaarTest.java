import be.vdab.Jaar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class JaarTest {
    @Test
    @DisplayName("een jaar is deelbaar door 400 is een schrikkeljaar.")
    void eenJaarDeelbaarDoor400isEenSchrikkeljaar(){
        var jaar=new Jaar(2000);
        Assertions.assertTrue(jaar.isSchrikkeljaar());
    }
    @Test
    void eenJaarDeelbaarDoor100isEenSchrikkeljaar(){
        var jaar=new Jaar(2012);
        Assertions.assertTrue(jaar.isSchrikkeljaar());
    }
    @Test
    void eenJaarDeelbaarDoor4isEenSchrikkeljaar(){
        var jaar=new Jaar(1900);
        Assertions.assertTrue(jaar.isSchrikkeljaar());
    }
    @Test
    void toStringGeeftHetJaarAlsTekst(){
        Assertions.assertTrue(new Jaar(2015).toString().equals("2015"));
    }
}
