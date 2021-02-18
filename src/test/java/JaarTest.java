import be.vdab.Jaar;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JaarTest {
    @Test
    @DisplayName("een jaar is deelbaar door 400 is een schrikkeljaar.")
    void eenJaarDeelbaarDoor400isEenSchrikkeljaar(){
        var jaar=new Jaar(2000);
        Assertions.assertThat(jaar.isSchrikkeljaar());
    }
    @Test
    void eenJaarDeelbaarDoor100isEenSchrikkeljaar(){
        var jaar=new Jaar(1900);
        Assertions.assertThat(jaar.isSchrikkeljaar());
    }
    @Test
    void eenJaarDeelbaarDoor4isEenSchrikkeljaar(){
        var jaar=new Jaar(1900);
        Assertions.assertThat(jaar.isSchrikkeljaar());
    }
    @Test
    void toStringGeeftHetJaarAlsTekst(){
        Assertions.assertThat(new Jaar(2015).toString().equals("2015"));
    }

    @Test
    void jarenMetHetzelfdeJaartalZijnGelijk() {
        Assertions.assertThat(new Jaar(2015)).isEqualTo(new Jaar(2015));
    }

    @Test
    void jarenMetVerschillendeJaartalZijnVerschillend() {
        Assertions.assertThat(new Jaar(2015)).isNotEqualTo(new Jaar(2016));
    }

    @Test
    void deHashCodeVanGelijkeJarenIsGelijk() {
        Assertions.assertThat(new Jaar(2015)).hasSameHashCodeAs(new Jaar(2015));
    }
}
