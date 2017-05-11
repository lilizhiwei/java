package java2;

class An{
   public void move(){
      System.out.println("动物可以移动");
   }
}
 
class Do extends An{
   public void move(){
      System.out.println("狗可以跑和走");
   }
}
 
public class TestDog{
   public static void main(String args[]){
      An a = new An(); // Animal 对象
      An b = new Do(); // Dog 对象
 
      a.move();// 执行 Animal 类的方法
 
      b.move();//执行 Dog 类的方法
   }
}
