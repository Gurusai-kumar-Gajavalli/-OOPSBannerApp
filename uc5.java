public class uc5 {

    public static void main(String[] args) {
        String[] lines = {
                String.join("", " ******  ", " ****** ", "   ******  ", "  ******  \n"),
                String.join("", "*      * ", "*      *", "  *      * ", " *        \n"),
                String.join("", "*      * ", "*      *", "  *      * ", " *        \n"),
                String.join("", "*      * ", "*      *", "  *******  ", "  ******  \n"),
                String.join("", "*      * ", "*      *", "  *        ", "        * \n"),
                String.join("", "*      * ", "*      *", "  *        ", "        * \n"),
                String.join("", " ******  ", " ****** ", "  *        ", "  ******  \n")
        };
        for (String line : lines) {
            System.out.print(line);
        }
    }
}