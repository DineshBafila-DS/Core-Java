//@Author Name: Dinesh Bafila
//Here we will see String object which are immutable(Unchangeable), and some its methods
class Str
{
public static void main(String args[])
{
String s1="Sachin";
s1.concat("Tendulkar");//will not add this string to original string as it is immutable
System.out.println(s1);
String s2="Sachin Tendulkar";
String s3="Gaurav";
String s4="GAURAV";
String s5=new String("Sachin");
System.out.println(s1.equals(s2));//True
System.out.println(s1==s2);//True because both refers to same instance
System.out.println(s1==s5);//False, because s5 refers to an instance created in nonpool
System.out.println(s1.equals(s5));
System.out.println(s3.equals(s4));
//substring in java
System.out.println(s3.substring(0,4));
//toLoweCase();, toUpperCase();,trim(),legnth(),startsWith();,endsWith();,charAt();,valueof()
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s2.trim());//remove white space from string
System.out.println(s2.length());
System.out.println(s2.startsWith("Sa"));
System.out.println(s2.endsWith("n"));
int a=10;
String s6=String.valueOf(a);//conver int into string
System.out.println(s6+10);
System.out.println(s1.charAt(0));
//replace method
String s7="Java is an objec oriented programming language";
String s8=s7.replace("Java","Green Talk");
System.out.println(s8);
}
}