package java2;

class Dd{
    void go(){
        System.out.println("animal go");
    }
}

class Dog extends Dd{
    void go(){
        //���ø��෽��
        super.go();
    }
}

public class Animal {
	//��������
	public static void  main(String[] args){
	    Dog dog=new Dog();
	    dog.go();
	}
}