package java2;


public class SuperDemo {
    public static void main(String []args) {
        new SubClass().showMessage();
    }
}
 
class SuperClass {
    int k = 50;
}
 
class SubClass extends SuperClass {
    int k =100;
    public void showMessage() {
        System.out.printf("super.i = %d, this.i = %d\n", k, k);
    }
}

