package lv.jg.lesson4.classwork.conditonalFlowControl;

public class SwitchStatement {
    public static void main(String[] args) {

        String drink = "coffee";

//switch - Keyword specifying switch statement
//(drink) - Single variable to test against
        switch (drink) {
            case "coffee": //Variable must match
                System.out.println("I would go for Java!");
                break; //Keyword telling to stop switch execution
                //Code to execute when value1 matches

            case "tea": //Variable must match
                System.out.println("Everything but Lipton");
                break;
                //Code to execute when value2 matches
                //Without break it falls through cases until first break

            default: //Fallback case
                 System.out.println("Uhg.. What?");
                //Code to execute when none of the above values match
        }
    }
}
