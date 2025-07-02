public class Ajce2 extends Thread
{
public void run(){
System.out.println("Runnning on" +Thread.currentThread
().getName());
}
public static void main(String[] args){
Ajce2 a1=new Ajce2();
Ajce2 a2=new Ajce2();
System.out.println("t1 thread priority:"+ a1.getPriority(10));
System.out.println(a2.getPriority());
a1.start();
a2.start();
}}