package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider == 0){
            System.out.println("division by zero");

        }

        int dividedValue = dividend/divider;
        int multipliedResults = dividedValue*divider;

            if(multipliedResults == dividend ) {
            System.out.println("can be divided completely");
        }else{
                if(multipliedResults == 0){
                    System.out.println("division by zero");
            }else{
                    System.out.println("can not de divided");
                }
        }
    }
}
