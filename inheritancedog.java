import java.util.*;

class dog{
protected String name;
dog(){}
dog(String n){
name=n;
}
String getname(){
return name;
}
String speak(){
return "bark";
}
}
class labrordog extends dog{
private String color;
private int weight;
labrordog(String n,String c,int w){
name=n;
color=c;
weight=w;
}
String speak(){
return "woof";
}
int weight(){
return weight;
}
}

public class inheritancedog {
public static void main(String[] args) {
labrordog obj1=new labrordog("jimmy", "white", 20);
System.out.println(obj1.speak());
System.out.println(obj1.weight());
}

}