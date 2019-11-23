package CollectionDemo;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
	Map<Integer,String> hm=new HashMap<Integer,String>();

{
System.out.println("List of students :");
hm.put(1,"Manav");    
hm.put(2,"Mansi");    
hm.put(3,"Neha");


for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
	}


Map<Integer,String> tm=new HashMap<Integer,String>();
{
	
	System.out.println("List of teachers :");
	tm.put(1,"Sampada");    
	tm.put(2,"Shweta");    
	tm.put(3,"Shruti");

}
for(Map.Entry n:tm.entrySet())
{
	System.out.println(n.getKey()+" "+n.getValue());
	}

System.out.println("Enter key value");
int i=sc.nextInt();
switch
{
case(i=1)
{
for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getValue());	}
}

for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getValue());	}

for(Map.Entry n:tm.entrySet())
{
	System.out.println(n.getValue());
	}
}

}


}


