//@Author Name: Dinesh Bafila
//Here we will see StringBuilder class.It is used to create mutable(modifiable) strings. We will also see some methods associated with it
class StrBuild
{
public static void main(String args[])
{
//nature of mutable
StringBuilder sb=new StringBuilder("Sachin");
sb.append("Tendulkar");//it will append tendulkar on original string
System.out.println(sb);
}
}