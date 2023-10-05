package BasicInputOutput;

public class SimplePrintWithVariables {
    public static void main(String[] args){
        String name = "Joel Cabuyao";
        int age = 21;
        double weight = 54.5;
        boolean isMarried = false;

        System.out.printf(
            "My name is %s. I am %d years old. My weight id %.1f. Am I married? %b.",
            name,
            age,
            weight,
            isMarried
        );
    }
}
