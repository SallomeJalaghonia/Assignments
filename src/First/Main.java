package First;
abstract class VowelCounter {
    abstract void countVowel(String input);
}

// შვილი კლასი
class VowelCounterImpl extends VowelCounter {
    @Override
    void countVowel(String input) {
        // ხმოვნების სიმბოლოები
        String vowels = "aeiouAEIOU";
        int count = 0;

        // ხმოვნებს ითვლის
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");
    }
}

public class Main {
    public static void main(String[] args) {
        // შვილი კლასი
        VowelCounter counter = new VowelCounterImpl();

        // მეთოდის გამოძახება
        counter.countVowel("I love testing");
    }
}