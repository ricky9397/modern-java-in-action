package ch09.ricky.chain;

public class SpellCheckerProcessing extends ProcessingObject<String>{
    @Override
    protected String handleWork(String input) {
        return input.replaceAll("labda", "lambda");
    }
}
