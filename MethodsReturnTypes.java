public class MethodsReturnTypes {
    public MethodsReturnTypes() {
    }
 
    public static void main(String[] var0) {
       displayWelcomeMessage();
       byte var1 = 20;
       byte var2 = 30;
       double var3 = calculateAverage(var1, var2);
       System.out.println("The Average is: " + var3);
    }
 
    public static void displayWelcomeMessage() {
       System.out.println("Welcome to our program");
    }
 
    public static double calculateAverage(int var0, int var1) {
       return (double)(var0 + var1) / 2.0;
    }
 }
 