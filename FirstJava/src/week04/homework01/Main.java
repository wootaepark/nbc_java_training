package week04.homework01;

public class Main {
    public static void main(String[] args) {
        boolean calculatedEnded = false;

        try{
            calculatedEnded = CalculatorApp.start();
        }
        catch(BadInputException e){
            System.out.println(e.getMessage());
        }




    }
}
