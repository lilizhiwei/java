package java2;


public class Test {
    public static void main(String[] args) {
      show(new Cat());  // �� Cat ������� show ����
      show(new Dog1());  // �� Dog ������� show ����
                
      Anima a = new Cat();  // ����ת��  
      a.eat();               // ���õ��� Cat �� eat
      Cat c = (Cat)a;        // ����ת��  
      c.work();        // ���õ��� Cat �� catchMouse
  }  
            
    public static void show(Anima a)  {
      a.eat();  
        // �����ж�
        if (a instanceof Cat)  {  // è�������� 
            Cat c = (Cat)a;  
            c.work();  
        } else if (a instanceof Dog1) { // ���������� 
            Dog1 c = (Dog1)a;  
            c.work();  
        }  
    }  
}
 
abstract class Anima {  
    abstract void eat();  
}  
  
class Cat extends Anima {  
    public void eat() {  
        System.out.println("����");  
    }  
    public void work() {  
        System.out.println("ץ����");  
    }  
}  
  
class Dog1 extends Anima {  
    public void eat() {  
        System.out.println("�Թ�ͷ");  
    }  
    public void work() {  
        System.out.println("����");  
    }  
}

