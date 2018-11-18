import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by haniyeaslani on 2018/11/16.
 */

public class ComplexCalculator {
    private ArrayList<Double> nummbers = new ArrayList<Double>();
    private ArrayList<String> actions = new ArrayList<String>();
    private double result=0;



    public ArrayList<Double> GetNummber() {
        System.out.print("please enter your nummber: ");
        Scanner scanner = new Scanner(System.in);
        nummbers.add(scanner.nextDouble());
        return nummbers;
    }

    public ArrayList<String> Action() {
        System.out.print("enter your action: ");
        Scanner scanner = new Scanner(System.in);
        actions.add(scanner.next());
        return actions;
    }
    public void calculate(){

            for (int i=0 ; i>=nummbers.size() ; i++) {
                String myactions =actions.get(i);

              switch (myactions){
                  case "+":
                      result += nummbers.get(i);
                      break;
                  case "-":
                      result -= nummbers.get(i);
                      break;

                  case "*":
                      result *= nummbers.get(i);
                      break;
                  case "/":
                      result /= nummbers.get(i);
                      break;
                  case "=":
                      System.out.print(result);

                      break;



              }
            }
                

        }







}
