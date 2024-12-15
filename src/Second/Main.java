package Second;
interface ReplaceA {
    String replaceSymbolA(String input);
}
interface ReplaceB {
    String replaceSymbolB(String input);
}

// კლასი, რომელიც ორივე ინტერფეისს იმპლემენტაციას უკეთებს
class ReplaceSymbols implements ReplaceA, ReplaceB {
    @Override
    public String replaceSymbolA(String input) {
        // ყველა 'a' სიმბოლო იცვლება 'z'-ით
        return input.replace('a', 'z');
    }

    @Override
    public String replaceSymbolB(String input) {
        // ყველა 'b' სიმბოლო იცვლება 'w'-ით
        return input.replace('b', 'w');
    }
}
public class Main {
    public static void main(String[] args) {
        // ReplaceSymbols კლასის ობიექტის შექმნა
        ReplaceSymbols replacer = new ReplaceSymbols();

        // ReplaceSymbolA
        String resultA = replacer.replaceSymbolA("Lela");
        System.out.println("replaceSymbolA შედეგი: " + resultA); // Output: Lelz

        // ReplaceSymbolB
        String resultB = replacer.replaceSymbolB("Gabelaia");
        System.out.println("replaceSymbolB შედეგი: " + resultB); // Output: Gawelaia
    }
}
