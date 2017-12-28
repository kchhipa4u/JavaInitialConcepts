package lec31.concurrency.threadcreation;
class MyThread extends Thread{
    public void run(){
           System.out.println("in run() method");
    }
}
 
public class MyClass {
    public static void main(String...args){
           System.out.println("In main() method");
           method1();
    }
    
    static void method1(){
           MyThread obj=new MyThread();   
           obj.start();
    }
}