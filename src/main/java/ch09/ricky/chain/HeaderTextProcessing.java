package ch09.ricky.chain;

public class HeaderTextProcessing extends ProcessingObject<String>{
    @Override
    protected String handleWork(String input) {
        return "From Raoul, Mario and Alan: " + input;
    }
}
