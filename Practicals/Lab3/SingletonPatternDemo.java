public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      LazySingleObject object = LazySingleObject.getInstance();
      SingleObject object1 = SingleObject.getInstance();

      //show the message
      object.showMessage();
      object1.showMessage();
   }
}
