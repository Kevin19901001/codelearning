package unit05.practice;

/**
 * This practice is practice 22.
 * @author Kevin
 * @since 2017-08-04
 */
public class EnumSwitch {

    EnumPractice practice;

    public EnumSwitch(EnumPractice practice){
        this.practice = practice;
    }

    public void describe(){
        System.out.print("This worth: ");
        switch(practice){
            case ONE:
            case TWO:
                System.out.println("under 5.");
                break;
            case FIVE:
                System.out.println("under 10");
                break;
            case TEN:
            case TWENTY:
                System.out.println("under 50.");
                break;
            case FIFTY:
                System.out.println("under 100.");
                break;
            default:
                System.out.println("100.");
        }
    }

    public static void main(String[] args){
        EnumSwitch inexpensive = new EnumSwitch(EnumPractice.TWO);
        EnumSwitch middle = new EnumSwitch(EnumPractice.TWENTY);
        EnumSwitch expensive = new EnumSwitch(EnumPractice.FIFTY);
        inexpensive.describe();
        middle.describe();
        expensive.describe();
    }

}
