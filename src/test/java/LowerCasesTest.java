import org.junit.Assert;
import org.junit.Test;

public class LowerCasesTest {
    @Test
    public void shouldTextWriteInCappitalLetters() {
        //given
        LowerCases lowerCases = new LowerCases();
        //when
        String textToLowerCases = lowerCases.formatText("ALA MA PSA");
        //given
        Assert.assertEquals("ala ma psa", textToLowerCases);

    }

}
