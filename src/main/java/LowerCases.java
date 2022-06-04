import java.util.Locale;

public class LowerCases implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toLowerCase(Locale.ROOT);
    }
}
