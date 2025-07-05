package DSA.BinarySearch.QuestionsLeetcode;

public class SmallestLetterQuestions03 {
    public static void main(String[] args) {

        // smallest letter

        char[] letter = {'c', 'f', 'j' };
        char target = 'c';
        char ans = nextGreatestLetter(letter, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letter, char target) {

        int start = 0;
        int end = letter.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letter[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letter[start % letter.length];

    }
}
