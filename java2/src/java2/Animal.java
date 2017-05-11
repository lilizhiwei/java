package java2;

class Dd{
    void go(){
        System.out.println("animal go");
    }
}

class Dog extends Dd{
    void go(){
        //调用父类方法
        super.go();
    }
}

public class Animal {
	//驱动函数
	public static void  main(String[] args){
	    Dog dog=new Dog();
	    dog.go();
	}
}