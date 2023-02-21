package collectioncomteam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPLTeam 
{
	List l=new ArrayList();
	Scanner sc=new Scanner(System.in);
	public void add()
	{
		System.out.println("enter team name");
		String name=sc.next();
		System.out.println("enter points");
		int points=sc.nextInt();
		char[] resu=new char[5];
		for(int i=0;i<resu.length;i++)
		{
			resu[i]=sc.next().charAt(0);
		}
		Team t=new Team(name,points,resu);
		l.add(t);
		System.out.println("Team is added");
	}
	public void remove()
	{
		System.out.println("enter team name");
		String name=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Team t=(Team)l.get(i);
			if(t.name.equals(name))
			{
				l.remove(t);
				System.out.println("object is removed");
				return;
			}
		}
		System.out.println("data is not found");
	}
	public void search()
	{
		System.out.println("enter team name");
		String name=sc.next();
		for(int i=0;i<l.size();i++)
		{
			Team t=(Team)l.get(i);
			if(t.name.equals(name))
			{
				System.out.println(t.name);
				for(int j=0;j<t.result.length;j++)
				{
					System.out.println(t.results[j]);
				}
				return;	
			}
	}
		System.out.println("data is not found");
	}
	public void filter()
	{
		System.out.println("what you want to search");
		char check=sc.next().charAt(0);
		System.out.println("how many times you want to check");
		int ht=sc.nextInt();
		for(int i=0;i<l.size();i++)
		{
			int count=0;
			Team t=(Team)l.get(i);
			char []resu=t.results;
			for(int j=0;j<resu.length;j++)
			{
				if(resu[j]==check)
				{
					count++;
					{
						if(count==ht)
						{
							System.out.println(t.name);
							break;
						}
					else
					{
						count=0;
					}
				}
				}
			}


		
	
	
	
	
	
	
	
	


	
	
	
	
	