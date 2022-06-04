import org.junit.Assert;
import org.junit.Test;

public class CapitalLettersTest {
    @Test
    public void shouldTextWriteInCappitalLetters() {
        //given
        CapitalLetters capitalLetters = new CapitalLetters();
        //when
        String textToCapitalLetters = capitalLetters.formatText("ala ma kota");
        //given
        Assert.assertEquals("ALA MA KOTA", textToCapitalLetters);

    }
}
