// SCS2204 Tutorial 06 Question 01
object Q1 {
    // Starting point
    def main(args: Array[String]) = {

        var ALPHABET = Array("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        // Get the ending value
        print("Enter ending value: " );
        var n = scala.io.StdIn.readInt();
        
        // Validate input
        while(n <= 0) {
            println("Please enter valid value!");
            print("Enter ending value: " );
            n = scala.io.StdIn.readInt();
        }
    
        // Display the output
        println("Fibonacci sequence for " + n + ": " + Fibonacci(n));
    }

    // Function to calculate value
    def Encryption(PlainText: String, Shift :Int): String = {
        
    }

    def Decryption(HiddenText: String, Shift :Int): String = {
        
    }
    
}