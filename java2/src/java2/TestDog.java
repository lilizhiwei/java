package java2;

class An{
   public void move(){
      System.out.println("��������ƶ�");
   }
}
 
class Do extends An{
   public void move(){
      System.out.println("�������ܺ���");
   }
}
 
public class TestDog{
   public static void main(String args[]){
      An a = new An(); // Animal ����
      An b = new Do(); // Dog ����
 
      a.move();// ִ�� Animal ��ķ���
 
      b.move();//ִ�� Dog ��ķ���
   }
}
