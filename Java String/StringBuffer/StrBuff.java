//@Author Name: Dinesh Bafila
//Here we will see StringBuffer class.It is used to create mutable(modifiable) strings. We will also see some methods associated with it
class StrBuff
{
public static void main(String args[])
{
//nature of mutable
StringBuffer sb=new StringBuffer("Sachin");
sb.append("Tendulkar");//it will append tendulkar on original string
System.out.println(sb);
//insert()
sb.insert(1,"Hello");
System.out.println(sb);
//replace()
sb.replace(1,3,"Java");
System.out.println(sb);
//delete()
sb.delete(1,8);
System.out.println(sb);
//reverse()
sb.reverse();
System.out.println(sb);
}
}
