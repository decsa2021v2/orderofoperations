public class MathOperationsExample {
    public static void main(String[] args) {
        //in Java the same order of operations
        //are followed as math
        //we can perform math operations with
        //literal values (numbers we hardcode in)


        //we can use variables


        //we can mix literals and variables


        //remember human readability is important when writing code
        //it is useful to give help where possible
        //there is no harm in putting parenthesis around expressions
        //to make it easier to read
        //as long as you are not changing the expected outcome


        //in programming we have an operator
        //you may not be familiar with it
        //it is called modulus and it uses the % symbol

        //an easy way to think about modulus is
        //you create a clock with Z amount of numbers
        //you go around that clock a certain amount of hours and will end
        //(hours % Z) on a value that is you answer
        //in short modulus will
        //    return to you the remainder of division

        //for this expression below
        //we have a clock with 7 digits (0-6)
        //we will go around that clock 11 hours
        //modulus occurs on the same level as multiplication and division
        //in order of operations


        //the computer requires very specific directions
        //if you give the computer two whole numbers to divide together
        //it will treat the answer as being a whole number only


        //even if we are storing the answer in a double or float data type


        //in order to get a floating point answer
        //we must make at least one
        //of the values a floating point number or
        //it must be stored in a double variable


        //sometimes we are given a double answer
        //but we only care about the integer portion of the answer
        //to accomplish this request
        //we will to temporarily convert our double answer to be of type int
        //this is known as typecasting
        //to typecast we place (TYPE) before the answer we want to convert
        //   replace the word TYPE with whatever data_type we want to convert to


        //Math.random() [which we will see about in more detail soon returns a double number]
        //we want a number between 1 and 10
        //we need to typecast the answer we get from
        //the expression to be an int so our result
        //is between 1 and 10 (whole numbers only)


        //sometimes we may need to or want to increase or decrease
        //some variable by only 1 (this happens often inside loops)
        //instead of typing variable_name + 1 or variable_name - 1 constantly
        //we can instead say variable_name++ or variable_name--
        //however the ++ or -- can go before or after the variable_name
        //and that impacts the overall results


        //using the ++ or -- after the variable_name
        //does the operation AFTER the line
        //of code is executed
        //this means that we do 4 (value in firstNumber) * 3 and get 12,
        //once we are done with that
        //we increase firstNumber to 5 because of the ++


        //using the ++ or -- before the variable_name
        //does the operation BEFORE the other operations
        //meaning that the number is increased first
        //then the operations happen
        //this means that we first increase firstNumber to 5
        //and then we do * 3 to get our answer of 15


    }//end of main
}//end of class

