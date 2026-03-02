public class w1_2 {
    public static void main(String[] args) {
        
        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result;

        // Decide pass/fail based on marks
        if (percentMarks >= 40.0) {
            result = 'P'; // Pass
        } else {
            result = 'F'; // Fail
        }

        System.out.println("Displaying Result:\n" + name + " with Roll Number " +
                           rollNumber + " has Scored " + percentMarks +
                           "% Marks and Result is " + result);
    }
}

