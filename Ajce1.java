import java.util.Scanner;
class Ajce1{
public static void main(String[] args){
Even e=new Even();
e.start();
Odd o=new Odd();
o.start();
}
}
class Even extends Thread{
public void run(){
for(int i=2;i<=10;i+=2){
System.out.println(i);

try{
	Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println(e);
}
}
}
}
class Odd extends Thread{
public void run(){
for(int i=1;i<=10;i=i+2){
System.out.println(i);

try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println(e);
}
}
}
}


