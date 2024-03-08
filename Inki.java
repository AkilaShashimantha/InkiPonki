public class Inki{



public static void main(String[] args){

String pinki = "donki";   
String blinki ="Pinki";
String rinki = "monkey";

Inki ponki = new Inki(pinki);

Inki ponki2 = new Inki(pinki, blinki, rinki);

}

public Inki(String a){

System.out.println(a);

}

public Inki(String a, String b, String c){

System.out.println(b +" "+a);
System.out.println(a +" "+c);
System.out.println(b +" "+a+" "+c);

}

}