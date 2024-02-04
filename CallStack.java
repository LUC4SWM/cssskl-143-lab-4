public class CallStack{

  // Called by func1()
  void func2 (){
         System.out.println("In func2 method");
         int a = 0;
         int b;
         b = 10 / a;

   }

   //Called by Main
   void func1(){
	  System.out.println("In func1 method");
	  try {
          this.func2();
      } catch (Exception e) {
          System.out.println("[Call to 'func2' was stopped because you can't divide by zero.]");
      }
	  System.out.println("Back in func1 method");

   }


   public static void main (String args[]){
      CallStack myCallStack;
      myCallStack = new CallStack();
      System.out.println("In the main method");
      myCallStack.func1 ();

   }
}

