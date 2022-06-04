import java.util.Locale;

public class CapitalLetters implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase(Locale.ROOT);
    }

}
