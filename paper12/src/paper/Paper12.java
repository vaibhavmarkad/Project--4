package paper;

public class Paper12 {
	
	public static void main(String[] args) {
        String input = "   I Love India   ";
        String output = removeSpaces(input);
        System.out.println(output);
    }

    public static String removeSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

       
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}


