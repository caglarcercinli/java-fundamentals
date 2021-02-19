package be.vdab.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IsbnTest {

    @Test
    void hetIsbn9789027439642IsCorrect() {
        new Isbn(9789027439642L);
    }
    @Test
    void hetIsbn9781789096491IsCorrect() {
        new Isbn(9781789096491L);
    }
    @Test
    void hetIsbn978198217361IsTeKort() {
        assertThatIllegalArgumentException().isThrownBy(() ->
                new Isbn(978198217361L));
    }
    @Test
    void hetIsbn9781982173612IsTeKort() {
        assertThatIllegalArgumentException().isThrownBy(() ->
                new Isbn(97819821736126L));
    }
    @Test
    void nummerMetNullIsVerkeerd() {
        assertThatNullPointerException().isThrownBy(() -> new Isbn(0));
    }

    @Test void toStringGeeftHetNummerTerug() {
        var nummer = 9781982110581L;
        assertThat(new Isbn(nummer)).isEqualTo("9781982110581");
    }
}