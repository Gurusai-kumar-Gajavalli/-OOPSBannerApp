public class uc5 {

    public static class CharacterPatternMap {
        private final char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public CharacterPatternMap(char character) {
            this.character = character;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        public void setPattern(String[] pattern) {
            this.pattern = pattern;
        }
    }

    public static String[] buildBanner(String word, CharacterPatternMap[] patterns) {
        StringBuilder[] bannerLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            for (CharacterPatternMap map : patterns) {
                if (map.getCharacter() == c) {
                    String[] charPattern = map.getPattern();
                    for (int i = 0; i < 7; i++) {
                        bannerLines[i].append(charPattern[i]).append("  ");
                    }
                }
            }
        }

        String[] result = new String[7];
        for (int i = 0; i < 7; i++) {
            result[i] = bannerLines[i].toString();
        }
        return result;
    }

    public static void main(String[] args) {
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };

        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S)
        };

        String[] banner = buildBanner("OOPS", patterns);
        for (String line : banner) {
            System.out.println(line);
        }
    }
}