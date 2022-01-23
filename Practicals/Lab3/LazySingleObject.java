 //Early Initialization

public class LazySingleObject {

   //create an object of SingleObject
   private static LazySingleObject instance = null;

   //make the constructor private so that this class cannot be
   //instantiated
   private LazySingleObject(){}

   //Get the only object available
   public static LazySingleObject getInstance() {
        if (instance == null) {
            synchronized(LazySingleObject.class) {
                if (instance == null) {
                    instance = new LazySingleObject();
                }
            }
        }

        return instance;
    }

   public void showMessage(){
      System.out.println("Hello I'm Lazy!");
   }
}
 
