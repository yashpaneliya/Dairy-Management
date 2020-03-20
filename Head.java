import java.util.*;
import java.io.*;
import java.lang.*;
class Head 
{
	File mfin,ifin,cfin,pfin;
	BufferedReader br1,br2,br3,br4;
	Head()
	{
		try
		{
		
		mfin=new File("milk.txt");
		br1=new BufferedReader(new FileReader(mfin));
		ifin=new File("icecream.txt");
		br2 = new BufferedReader(new FileReader(ifin));
		cfin=new File("chocolate.txt");
		br3 = new BufferedReader(new FileReader(cfin));
		pfin=new File("paneer.txt");
		br4 = new BufferedReader(new FileReader(pfin));
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	
	
	public static Scanner in=new Scanner(System.in);
	void viewRecord() throws FileNotFoundException,IOException,InterruptedException
	{
		try
		{
		
		mfin=new File("milk.txt");
		br1=new BufferedReader(new FileReader(mfin));
		ifin=new File("icecream.txt");
		br2 = new BufferedReader(new FileReader(ifin));
		cfin=new File("chocolate.txt");
		br3 = new BufferedReader(new FileReader(cfin));
		pfin=new File("paneer.txt");
		br4 = new BufferedReader(new FileReader(pfin));
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		int i=0;
		String s=new String();
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\t\t\tAmount of milk in storage in litres:");
		
		while((s=br1.readLine())!=null)
		{
			System.out.print("\t\t\t"+s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\n\t\t\tAmount of Icecream in storage in litres:");
		
		while((s=br2.readLine())!=null)
		{
			System.out.print("\t\t\t"+s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\n\t\t\tAmount of Chocolate in storage in kilograms:");
		
		while((s=br3.readLine())!=null)
		{
			System.out.print("\t\t\t"+s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\n\t\t\tAmount of Paneer in storage in kilograms:");
		
		while((s=br4.readLine())!=null)
		{
			System.out.print("\t\t\t"+s);
		}
		System.out.println("\n****************************************************************************************************************************");
	}
	
	
    void addItems()throws FileNotFoundException,IOException,InterruptedException
	{
		char ch;
		int am=0;
		Scanner in=new Scanner(System.in);
		do
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("\n****************************************************************************************************************************");
		System.out.println("\t\t\tWhich item you want to add?\n\t\t\t1.Milk\n\t\t\t2.Icecream\n\t\t\t3.Chocolate\n\t\t\t4.Paneer\n\t\t\t5.Exit");
		ch=in.next().charAt(0);
		System.out.println("****************************************************************************************************************************");
		switch(ch)
		{
			case 'm':
			String str1=new String();
			mfin=new File("milk.txt");
		br1=new BufferedReader(new FileReader(mfin));
				str1=br1.readLine();
				System.out.println("\nCurrent Amount:");
				System.out.println(str1);
				//br1.flush();
				am=Integer.parseInt(str1);
				System.out.println("****************************************************************************************************************************");
				System.out.println("\t\t\tEnter amount to add : ");
				System.out.println("****************************************************************************************************************************");
				int temp=in.nextInt();
				am+=temp;
				FileWriter f=new FileWriter("milk.txt");
				f.write(String.valueOf(am));
				f.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println(am);
				break;
			
			
			case 'i':
			ifin=new File("icecream.txt");
		br2 = new BufferedReader(new FileReader(ifin));
			String str2=new String();
				str2=br2.readLine();
				System.out.println("\nCurrent Amount:");
				am=Integer.parseInt(str2);
				System.out.println("****************************************************************************************************************************");
				System.out.println("\t\t\tEnter amount to add : ");
				System.out.println("****************************************************************************************************************************");
				int temp2=in.nextInt();
				am+=temp2;
				FileWriter f2=new FileWriter("icecream.txt");
				f2.write(String.valueOf(am));
				f2.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println(am);
				break;
			
			
			case 'c':
			cfin=new File("chocolate.txt");
		br3 = new BufferedReader(new FileReader(cfin));
			String str3=new String();
				str3=br3.readLine();
				System.out.println("\nCurrent Amount:");
				am=Integer.parseInt(str3);
				System.out.println("****************************************************************************************************************************");
				System.out.println("\t\t\tEnter amount to add : ");
				System.out.println("****************************************************************************************************************************");
				int temp3=in.nextInt();
				am+=temp3;
				FileWriter f3=new FileWriter("chocolate.txt");
				f3.write(String.valueOf(am));
				f3.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println(am);
				break;
			
			
			case 'p':
			pfin=new File("paneer.txt");
		br4 = new BufferedReader(new FileReader(pfin));
			String str4=new String();
				str4=br4.readLine();
				System.out.println("\nCurrent Amount:");
				am=Integer.parseInt(str4);
				System.out.println("****************************************************************************************************************************");
				System.out.println("\t\t\tEnter amount to add : ");
				System.out.println("****************************************************************************************************************************");
				int temp4=in.nextInt();
				am+=temp4;
				FileWriter f4=new FileWriter("paneer.txt");
				f4.write(String.valueOf(am));
				f4.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println(am);
				break;
			default:
					System.exit(0);
					break;
		}	
		System.out.println("****************************************************************************************************************************");
		System.out.println("\n\n\n\n\t\t\tWant to add more?[Y/N] : ");
		ch=in.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
	
	
	void home()throws InterruptedException,IOException
	{
		char ch;
		String psd=new String();
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("****************************************************************************************************************************");
		System.out.println("\t\t\tWho are you?[Admin[a]/Branch Manager[b]]");
		System.out.println("****************************************************************************************************************************");
		ch=in.next().charAt(0);
		if(ch=='a'||ch=='A')
		{
			System.out.println("****************************************************************************************************************************");
		System.out.println("\n\n\n\n\n\t\t\tUsername : Admin\n\t\t\tPassword : ");
		psd=in.next();
		if(psd.equals("admin"))
		{
			do{
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				System.out.println("****************************************************************************************************************************");
				System.out.println("\t\t\tEnter the choice:\n\t\t\t1.View Records\n\t\t\t2.Add Items\n\t\t\t3.Exit");
				System.out.println("****************************************************************************************************************************");
				ch=in.next().charAt(0);
				
				switch(ch)
				{
					case '1':
					try
					{
						viewRecord();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
						break;
					case '2':
						try{
							addItems();
						}
					catch(Exception e)
					{
						System.out.println(e);
					}
					break;
					case '3':
						System.exit(0);
						break;
					default:
						System.out.println("Wrong Choice!!!!");
				}
				System.out.println("****************************************************************************************************************************");
				System.out.println("\n\t\t\tDo you want to  continue?[Y/N]:");
				ch=in.next().charAt(0);
			}while(ch=='y'||ch=='Y');
		}
			else
			{
				System.out.println("Wrong Password!!!!");
				home();
			}
		}
		else if(ch=='b'||ch=='B')
		{
			do{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			System.out.println("****************************************************************************************************************************");
			System.out.println("\n\n\t\t\tWhich City?\n\t\t\t1.Surat[S]\n\t\t\t2.Ahmedabad[A]\n\t\t\t3.Nadiad[N]\n\t\t\t4.Vadodara[V]");
			System.out.println("****************************************************************************************************************************");
			ch=in.next().charAt(0);
			switch(ch)
			{
				case 's':
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					Surat s=new Surat();
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\t\tEnter the choice:\n\t\t\t1.View Records\n\t\t\t2.Order Items");
					System.out.println("****************************************************************************************************************************");
					ch=in.next().charAt(0);
					switch(ch)
					{
						case '1':
						try
						{
							s.viewRecord();
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
						case '2':
						try{s.orderItems();}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
					}
					break;
				case 'a':
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					Ahmedabad a=new Ahmedabad();
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\t\tEnter the choice:\n\t\t\t1.View Records\n\t\t\t2.Order Items");
					System.out.println("****************************************************************************************************************************");
					ch=in.next().charAt(0);
					switch(ch)
					{
						case '1':
						try
						{
							a.viewRecord();
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
						case '2':
						try{a.orderItems();}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
					}
					break;
				case 'n':
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
					Nadiad n=new Nadiad();
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\t\tEnter the choice:\n\t\t\t1.View Records\n\t\t\t2.Order Items");
					System.out.println("****************************************************************************************************************************");
					ch=in.next().charAt(0);
					switch(ch)
					{
						case '1':
						try
						{
							n.viewRecord();
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
						case '2':
						try{n.orderItems();}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
					}
					break;
				case 'v':
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				Vadodara v=new Vadodara();
				System.out.println("****************************************************************************************************************************");
					System.out.println("\t\t\tEnter the choice:\n\t\t\t1.View Records\n\t\t\t2.Order Items");
					System.out.println("****************************************************************************************************************************");
					ch=in.next().charAt(0);
					switch(ch)
					{
						case '1':
						try
						{
							v.viewRecord();
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
						case '2':
						try{v.orderItems();}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
					}		
					break;					
				default:
					break;
			}
			System.out.println("****************************************************************************************************************************");
				System.out.println("\n\t\t\tDo you want to  continue?[Y/N]:");
				ch=in.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		}
	}
	public static void main(String []args)throws IOException,InterruptedException
	{
		Head h=new Head();
		h.home();
	}
}	
	
class Surat
{
	File smfin,sifin,scfin,spfin;
	BufferedReader sbr1,sbr2,sbr3,sbr4;
	Scanner in=new Scanner (System.in);
	Surat()
	{
		
	}
	void viewRecord() throws FileNotFoundException,IOException,InterruptedException
	{
		try
		{
		
		smfin=new File("smilk.txt");
		sbr1=new BufferedReader(new FileReader(smfin));
		sifin=new File("sicecream.txt");
		sbr2 = new BufferedReader(new FileReader(sifin));
		scfin=new File("schocolate.txt");
		sbr3 = new BufferedReader(new FileReader(scfin));
		spfin=new File("spaneer.txt");
		sbr4 = new BufferedReader(new FileReader(spfin));
		}	
		catch(Exception e)
		{
			System.out.print(e);
		}
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		int i=0;
		String s=new String();
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("Amount of milk in storage in litres:");
		
		while((s=sbr1.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Icecream in storage in litres:");
		
		while((s=sbr2.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Chocolate in storage in kilograms:");
		
		while((s=sbr3.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Paneer in storage in kilograms:");
		
		while((s=sbr4.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
	}
	void orderItems()throws FileNotFoundException,IOException,InterruptedException
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("****************************************************************************************************************************");
		System.out.println("\n\t\t\tWhich Item you want to order?\n\t\t\t1.Milk\n\t\t\t2.Icecream\n\t\t\t3.Chocolate\n\t\t\t4.Paneer\n");
		System.out.println("****************************************************************************************************************************");
		char ch=in.next().charAt(0);
		int am=0;
		int sm=0;
		int temp=0;
		switch(ch)
		{
			case 'm':
				String str1=new String();
				String str2=new String();
				File mfin=new File("milk.txt");
				BufferedReader br1=new BufferedReader(new FileReader(mfin));
				smfin=new File("smilk.txt");
				sbr1=new BufferedReader(new FileReader(smfin));
				str1=br1.readLine();
				System.out.println("\nCurrent Amount in Head:"+str1);
				str2=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str2);
				am=Integer.parseInt(str1);
				sm=Integer.parseInt(str2);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f=new FileWriter("milk.txt");
				f.write(String.valueOf(am));
				f.close();
				FileWriter fo=new FileWriter("smilk.txt");
				fo.write(String.valueOf(sm));
				fo.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'i':
				String str3=new String();
				String str4=new String();
				File ifin=new File("icecream.txt");
				BufferedReader br2=new BufferedReader(new FileReader(ifin));
				sifin=new File("sicecream.txt");
				sbr2=new BufferedReader(new FileReader(sifin));
				str3=br2.readLine();
				System.out.println("\nCurrent Amount in Head:"+str3);
				str4=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str4);
				am=Integer.parseInt(str3);
				sm=Integer.parseInt(str4);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f2=new FileWriter("icecream.txt");
				f2.write(String.valueOf(am));
				f2.close();
				FileWriter fo2=new FileWriter("sicecream.txt");
				fo2.write(String.valueOf(sm));
				fo2.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'c':
				String str5=new String();
				String str6=new String();
				File cfin=new File("chocolate.txt");
				BufferedReader br3=new BufferedReader(new FileReader(cfin));
				scfin=new File("schocolate.txt");
				sbr3=new BufferedReader(new FileReader(sifin));
				str5=br3.readLine();
				System.out.println("\nCurrent Amount in Head:"+str5);
				str6=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str6);
				am=Integer.parseInt(str5);
				sm=Integer.parseInt(str6);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f3=new FileWriter("chocolate.txt");
				f3.write(String.valueOf(am));
				f3.close();
				FileWriter fo3=new FileWriter("schocolate.txt");
				fo3.write(String.valueOf(sm));
				fo3.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'p':
				String str7=new String();
				String str8=new String();
				File pfin=new File("paneer.txt");
				BufferedReader br4=new BufferedReader(new FileReader(pfin));
				spfin=new File("spaneer.txt");
				sbr4=new BufferedReader(new FileReader(spfin));
				str7=br4.readLine();
				System.out.println("\nCurrent Amount in Head:"+str7);
				str8=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str8);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f4=new FileWriter("paneer.txt");
				f4.write(String.valueOf(am));
				f4.close();
				FileWriter fo4=new FileWriter("spaneer.txt");
				fo4.write(String.valueOf(sm));
				fo4.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
		}
	}
	
}

class Ahmedabad
{
	File smfin,sifin,scfin,spfin;
	BufferedReader sbr1,sbr2,sbr3,sbr4;
	Scanner in=new Scanner (System.in);
	Ahmedabad()
	{
		
	}
	void viewRecord() throws FileNotFoundException,IOException,InterruptedException
	{
		try
		{
		
		smfin=new File("amilk.txt");
		sbr1=new BufferedReader(new FileReader(smfin));
		sifin=new File("aicecream.txt");
		sbr2 = new BufferedReader(new FileReader(sifin));
		scfin=new File("achocolate.txt");
		sbr3 = new BufferedReader(new FileReader(scfin));
		spfin=new File("apaneer.txt");
		sbr4 = new BufferedReader(new FileReader(spfin));
		}	
		catch(Exception e)
		{
			System.out.print(e);
		}
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		int i=0;
		String s=new String();
		System.out.println("****************************************************************************************************************************");
		System.out.println("Amount of milk in storage in litres:");
		
		while((s=sbr1.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Icecream in storage in litres:");
		
		while((s=sbr2.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Chocolate in storage in kilograms:");
		
		while((s=sbr3.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Paneer in storage in kilograms:");
		
		while((s=sbr4.readLine())!=null)
		{
			System.out.print(s);
		}
System.out.println("\n****************************************************************************************************************************");
	}
	void orderItems()throws FileNotFoundException,IOException,InterruptedException
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("****************************************************************************************************************************");
		System.out.println("\n\t\t\tWhich Item you want to order?\n\t\t\t1.Milk\n\t\t\t2.Icecream\n\t\t\t3.Chocolate\n\t\t\t4.Paneer\n");
		System.out.println("****************************************************************************************************************************");
		char ch=in.next().charAt(0);
		int am=0;
		int sm=0;
		int temp=0;
		switch(ch)
		{
			case 'm':
				String str1=new String();
				String str2=new String();
				File mfin=new File("milk.txt");
				BufferedReader br1=new BufferedReader(new FileReader(mfin));
				smfin=new File("amilk.txt");
				sbr1=new BufferedReader(new FileReader(smfin));
				str1=br1.readLine();
				System.out.println("\nCurrent Amount in Head:"+str1);
				str2=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str2);
				am=Integer.parseInt(str1);
				sm=Integer.parseInt(str2);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f=new FileWriter("milk.txt");
				f.write(String.valueOf(am));
				f.close();
				FileWriter fo=new FileWriter("amilk.txt");
				fo.write(String.valueOf(sm));
				fo.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'i':
				String str3=new String();
				String str4=new String();
				File ifin=new File("icecream.txt");
				BufferedReader br2=new BufferedReader(new FileReader(ifin));
				sifin=new File("aicecream.txt");
				sbr2=new BufferedReader(new FileReader(sifin));
				str3=br2.readLine();
				System.out.println("\nCurrent Amount in Head:"+str3);
				str4=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str4);
				am=Integer.parseInt(str3);
				sm=Integer.parseInt(str4);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f2=new FileWriter("icecream.txt");
				f2.write(String.valueOf(am));
				f2.close();
				FileWriter fo2=new FileWriter("aicecream.txt");
				fo2.write(String.valueOf(sm));
				fo2.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'c':
				String str5=new String();
				String str6=new String();
				File cfin=new File("chocolate.txt");
				BufferedReader br3=new BufferedReader(new FileReader(cfin));
				scfin=new File("achocolate.txt");
				sbr3=new BufferedReader(new FileReader(sifin));
				str5=br3.readLine();
				System.out.println("\nCurrent Amount in Head:"+str5);
				str6=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str6);
				am=Integer.parseInt(str5);
				sm=Integer.parseInt(str6);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f3=new FileWriter("chocolate.txt");
				f3.write(String.valueOf(am));
				f3.close();
				FileWriter fo3=new FileWriter("achocolate.txt");
				fo3.write(String.valueOf(sm));
				fo3.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'p':
				String str7=new String();
				String str8=new String();
				File pfin=new File("paneer.txt");
				BufferedReader br4=new BufferedReader(new FileReader(pfin));
				spfin=new File("apaneer.txt");
				sbr4=new BufferedReader(new FileReader(spfin));
				str7=br4.readLine();
				System.out.println("\nCurrent Amount in Head:"+str7);
				str8=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str8);
				am=Integer.parseInt(str7);
				sm=Integer.parseInt(str8);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f4=new FileWriter("paneer.txt");
				f4.write(String.valueOf(am));
				f4.close();
				FileWriter fo4=new FileWriter("apaneer.txt");
				fo4.write(String.valueOf(sm));
				fo4.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
		}
	}
	
}

class Vadodara
{
	File smfin,sifin,scfin,spfin;
	BufferedReader sbr1,sbr2,sbr3,sbr4;
	Scanner in=new Scanner (System.in);
	Vadodara()
	{
		
	}
	void viewRecord() throws FileNotFoundException,IOException,InterruptedException
	{
		try
		{
		
		smfin=new File("vmilk.txt");
		sbr1=new BufferedReader(new FileReader(smfin));
		sifin=new File("vicecream.txt");
		sbr2 = new BufferedReader(new FileReader(sifin));
		scfin=new File("vchocolate.txt");
		sbr3 = new BufferedReader(new FileReader(scfin));
		spfin=new File("vpaneer.txt");
		sbr4 = new BufferedReader(new FileReader(spfin));
		}	
		catch(Exception e)
		{
			System.out.print(e);
		}
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		int i=0;
		String s=new String();
		System.out.println("****************************************************************************************************************************");
		System.out.println("Amount of milk in storage in litres:");
		
		while((s=sbr1.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Icecream in storage in litres:");
		
		while((s=sbr2.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Chocolate in storage in kilograms:");
		
		while((s=sbr3.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Paneer in storage in kilograms:");
		
		while((s=sbr4.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
	}
	void orderItems()throws FileNotFoundException,IOException,InterruptedException
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("**************************************************Enter amount to buy : *****************************************************");
		System.out.println("\n\t\t\tWhich Item you want to order?\n\t\t\t1.Milk\n\t\t\t2.Icecream\n\t\t\t3.Chocolate\n\t\t\t4.Paneer\n");
		System.out.println("**************************************************Enter amount to buy : *****************************************************");
		char ch=in.next().charAt(0);
		int am=0;
		int sm=0;
		int temp=0;
		switch(ch)
		{
			case 'm':
				String str1=new String();
				String str2=new String();
				File mfin=new File("milk.txt");
				BufferedReader br1=new BufferedReader(new FileReader(mfin));
				smfin=new File("vmilk.txt");
				sbr1=new BufferedReader(new FileReader(smfin));
				str1=br1.readLine();
				System.out.println("\nCurrent Amount in Head:"+str1);
				str2=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str2);
				am=Integer.parseInt(str1);
				sm=Integer.parseInt(str2);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f=new FileWriter("milk.txt");
				f.write(String.valueOf(am));
				f.close();
				FileWriter fo=new FileWriter("vmilk.txt");
				fo.write(String.valueOf(sm));
				fo.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'i':
				String str3=new String();
				String str4=new String();
				File ifin=new File("icecream.txt");
				BufferedReader br2=new BufferedReader(new FileReader(ifin));
				sifin=new File("vicecream.txt");
				sbr2=new BufferedReader(new FileReader(sifin));
				str3=br2.readLine();
				System.out.println("\nCurrent Amount in Head:"+str3);
				str4=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str4);
				am=Integer.parseInt(str3);
				sm=Integer.parseInt(str4);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f2=new FileWriter("icecream.txt");
				f2.write(String.valueOf(am));
				f2.close();
				FileWriter fo2=new FileWriter("vicecream.txt");
				fo2.write(String.valueOf(sm));
				fo2.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'c':
				String str5=new String();
				String str6=new String();
				File cfin=new File("chocolate.txt");
				BufferedReader br3=new BufferedReader(new FileReader(cfin));
				scfin=new File("vchocolate.txt");
				sbr3=new BufferedReader(new FileReader(sifin));
				str5=br3.readLine();
				System.out.println("\nCurrent Amount in Head:"+str5);
				str6=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str6);
				am=Integer.parseInt(str5);
				sm=Integer.parseInt(str6);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f3=new FileWriter("chocolate.txt");
				f3.write(String.valueOf(am));
				f3.close();
				FileWriter fo3=new FileWriter("vchocolate.txt");
				fo3.write(String.valueOf(sm));
				fo3.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'p':
				String str7=new String();
				String str8=new String();
				File pfin=new File("paneer.txt");
				BufferedReader br4=new BufferedReader(new FileReader(pfin));
				spfin=new File("vpaneer.txt");
				sbr4=new BufferedReader(new FileReader(spfin));
				str7=br4.readLine();
				System.out.println("\nCurrent Amount in Head:"+str7);
				str8=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str8);
				am=Integer.parseInt(str7);
				sm=Integer.parseInt(str8);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f4=new FileWriter("paneer.txt");
				f4.write(String.valueOf(am));
				f4.close();
				FileWriter fo4=new FileWriter("vpaneer.txt");
				fo4.write(String.valueOf(sm));
				fo4.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
		}
	}
	
}

class Nadiad
{
	File smfin,sifin,scfin,spfin;
	BufferedReader sbr1,sbr2,sbr3,sbr4;
	Scanner in=new Scanner (System.in);
	Nadiad()
	{
		
	}
	void viewRecord() throws FileNotFoundException,IOException,InterruptedException
	{
		try
		{
		
		smfin=new File("nmilk.txt");
		sbr1=new BufferedReader(new FileReader(smfin));
		sifin=new File("nicecream.txt");
		sbr2 = new BufferedReader(new FileReader(sifin));
		scfin=new File("nchocolate.txt");
		sbr3 = new BufferedReader(new FileReader(scfin));
		spfin=new File("npaneer.txt");
		sbr4 = new BufferedReader(new FileReader(spfin));
		}	
		catch(Exception e)
		{
			System.out.print(e);
		}
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		int i=0;
		String s=new String();
		System.out.println("****************************************************************************************************************************");
		System.out.println("Amount of milk in storage in litres:");
		
		while((s=sbr1.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Icecream in storage in litres:");
		
		while((s=sbr2.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Chocolate in storage in kilograms:");
		
		while((s=sbr3.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
		System.out.println("\nAmount of Paneer in storage in kilograms:");
		
		while((s=sbr4.readLine())!=null)
		{
			System.out.print(s);
		}
		System.out.println("\n****************************************************************************************************************************");
	}
	void orderItems()throws FileNotFoundException,IOException,InterruptedException
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		System.out.println("**************************************************Enter amount to buy : *****************************************************");
		System.out.println("\n\t\t\tWhich Item you want to order?\n\t\t\t1.Milk\n\t\t\t2.Icecream\n\t\t\t3.Chocolate\n\t\t\t4.Paneer\n");
		System.out.println("**************************************************Enter amount to buy : *****************************************************");
		char ch=in.next().charAt(0);
		int am=0;
		int sm=0;
		int temp=0;
		switch(ch)
		{
			case 'm':
				String str1=new String();
				String str2=new String();
				File mfin=new File("milk.txt");
				BufferedReader br1=new BufferedReader(new FileReader(mfin));
				smfin=new File("nmilk.txt");
				sbr1=new BufferedReader(new FileReader(smfin));
				str1=br1.readLine();
				System.out.println("\nCurrent Amount in Head:"+str1);
				str2=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str2);
				am=Integer.parseInt(str1);
				sm=Integer.parseInt(str2);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f=new FileWriter("milk.txt");
				f.write(String.valueOf(am));
				f.close();
				FileWriter fo=new FileWriter("nmilk.txt");
				fo.write(String.valueOf(sm));
				fo.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'i':
				String str3=new String();
				String str4=new String();
				File ifin=new File("icecream.txt");
				BufferedReader br2=new BufferedReader(new FileReader(ifin));
				sifin=new File("nicecream.txt");
				sbr2=new BufferedReader(new FileReader(sifin));
				str3=br2.readLine();
				System.out.println("\nCurrent Amount in Head:"+str3);
				str4=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str4);
				am=Integer.parseInt(str3);
				sm=Integer.parseInt(str4);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f2=new FileWriter("icecream.txt");
				f2.write(String.valueOf(am));
				f2.close();
				FileWriter fo2=new FileWriter("nicecream.txt");
				fo2.write(String.valueOf(sm));
				fo2.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
			case 'c':
				String str5=new String();
				String str6=new String();
				File cfin=new File("chocolate.txt");
				BufferedReader br3=new BufferedReader(new FileReader(cfin));
				scfin=new File("nchocolate.txt");
				sbr3=new BufferedReader(new FileReader(sifin));
				str5=br3.readLine();
				System.out.println("\nCurrent Amount in Head:"+str5);
				str6=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str6);
				am=Integer.parseInt(str5);
				sm=Integer.parseInt(str6);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f3=new FileWriter("chocolate.txt");
				f3.write(String.valueOf(am));
				f3.close();
				FileWriter fo3=new FileWriter("nchocolate.txt");
				fo3.write(String.valueOf(sm));
				fo3.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
				
			case 'p':
				String str7=new String();
				String str8=new String();
				File pfin=new File("paneer.txt");
				BufferedReader br4=new BufferedReader(new FileReader(pfin));
				spfin=new File("npaneer.txt");
				sbr4=new BufferedReader(new FileReader(spfin));
				str7=br4.readLine();
				System.out.println("\nCurrent Amount in Head:"+str7);
				str8=sbr1.readLine();
				System.out.println("\nCurrent Amount in Branch:"+str8);
				am=Integer.parseInt(str7);
				sm=Integer.parseInt(str8);
				System.out.println("**************************************************Enter amount to buy : *****************************************************");
				temp=in.nextInt();
				
				if(am<temp)
				{
					System.out.println("****************************************************************************************************************************");
					System.out.println("\t\tNot enough amount available!!! Please order after some time!!!");
					System.out.println("\t\tSorry for inconvenience!!!!!");
					System.out.println("****************************************************************************************************************************");
					System.exit(0);
				}
				am-=temp;
				sm+=temp;
				FileWriter f4=new FileWriter("paneer.txt");
				f4.write(String.valueOf(am));
				f4.close();
				FileWriter fo4=new FileWriter("npaneer.txt");
				fo4.write(String.valueOf(sm));
				fo4.close();
				/*System.out.println("Want to go to home ? [Y/N]:");
				ch=in.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					home();
				}*/
				System.out.println("\nCurrent Amount:");
				System.out.println(sm);
				break;
		}
	}
	
}
