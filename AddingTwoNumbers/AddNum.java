
/*
 * Addition of two numbers
 */
public class AddNum
{
    private double num;
    
    /*Description - Adds the two numbers together.
     *Input - Double
     *Output - Double
     *Example - 1 + 1 = 2 
     */
    public AddNum(double num1, double num2)
    {
        num = num1 + num2;
    }
    
    /*Description - Prints out the sum of the two numbers
     */
    public void showAnswer()
    {
        System.out.println("Sum of num1 and num2 = " + num);
    }
}
