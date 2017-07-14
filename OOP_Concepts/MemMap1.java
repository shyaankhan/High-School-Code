
public class MemMap1 {


public static void main(String[] args)
{
Frog kermit = new Frog(10, "Kermit");
Frog freddo = new Frog(20, "Freddo");
change1(kermit, freddo);
System.out.println("After change1 " + kermit); // kermit calls the toString method
change2(kermit, freddo);
System.out.println("After change2 " + kermit);
kermit.birthday();
freddo.birthday();
freddo.birthday();
kermit = change3(kermit, freddo);
System.out.println("After change3 " + kermit);
}
public static void change1(Frog f1, Frog f2)
{
f1 = f2;
System.out.println("Leaving change1 " + f1);
}
public static void change2(Frog f1, Frog f2)
{
f1.changeWeight(f2.getWeight());
System.out.println("Leaving change2 " + f1);
}
public static Frog change3(Frog f1, Frog f2)
{
f1 = f2;
return f1;
}
}
