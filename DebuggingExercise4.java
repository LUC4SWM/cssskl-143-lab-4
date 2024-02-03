class DebuggingExercise4{
    /* 2.2 Questions: (My IDE is IntelliJ)
     --- The variable watch window for me is on the mini debugging window, and you can add a watch by right-clicking on a blank spot then selecting " + New Watch...". You can use this to track the value of a variable at each step, and the implementation of the method being run on it.

     --- Method call stack can be found by pausing the program in the debug window, then looking on the subsection that says "Threads & Variables". This allows you to toggle through method calls and see the corresponding class/method in your editor window.
     */

    /* 2.3 Questions:
     --- a. Step Over (F8) - Executes a line of code then moves to the next.

     --- b. Step Into (F7) - Takes you to the first line of code in a method that's been defined in the same class or another class within the application.

     --- c. Step Out (Shift+F8) - Returns to the calling method, without stepping through each line of code

     --- d. "Continue" or Resume (F9) - Resumes the normal execution of the program, no stepping.


     */
    public static void main(String[] args){
        Account a = new Account("Dave");
        a.deposit(100);
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        a.withdraw(200);
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
    }
}