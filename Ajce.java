import java.util.Scanner;
public class Ajce{
public static void main(String[] args){
int limit;
Scanner sc=new Scanner(System.in);
System.out.println("ENter the limits: ");
limit=sc.nextInt();

Thread t1=new Thread(new OddRunnable(limit));
Thread t2=new Thread(new EvenRunnable(limit));

t1.start();
t2.start();
}
}
class EvenRunnable implements Runnable{
int limit;
public EvenRunnable(int limit){
this.limit=limit;
}
public void run(){
for(int even=2;even<=limit;even+=2){
System.out.println("Even thread:"+even);
}}
}
class OddRunnable implements Runnable{
int limit;
public OddRunnable(int limit){
this.limit=limit;
}
public void run(){
for(int odd=1;odd<=limit;odd+=2){
System.out.println("Odd thread: "+odd);
}
}
}



