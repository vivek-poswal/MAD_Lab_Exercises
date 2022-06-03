/*
1. Make your first inheritance based design
There were Pandavs and Kauravs. Arjun and Bheem were Pandavs. Duryodhan was a
Kaurav. Pandavs were characterized by their skills of fighting (fight ( )), obedience (obey
( )), and kindness (kind ( )). Though Bheem was little less kind but equally obedient as
Arjun. Kauravs were notorious for disobeying and cruelty. But Kauravs were fighters.
Kauravs were 100 in numbers, but one of them ‘Vikarn’ was a noble man- a good
fighter, kind and obedient. If you dive a little more in the history, you will come to know
that Pandavs and Kauravs were actually Bharatvanshi. And all bharatvanshis had been
fighters.
You are required to create a design first on paper and then write implementation on your machine. Make abstract classes 
and concrete classes. Decide which methods should be made abstract or non-abstract.
*/

//Main.java

public class Main
{
	public static void main(String[] args) {
		arjun a = new arjun();
	    duryodhan d = new duryodhan();
		
		a.fight();
		a.obey();
		a.kind();
		
		d.fight();
		d.obey();
		d.kind();
	}
}

//arjun.java

class arjun extends qualities{
    void obey()
    {
        System.out.println("obedient");
    }
    
    void kind()
    {
        System.out.println("kind");
    }
} 

//duryodhan.java

class duryodhan extends qualities{
    void obey()
    {
        System.out.println("Not obedient");
    }
    
    void kind()
    {
        System.out.println("Not kind");
    }
} 

//qualities.java
abstract class qualities{
    void fight()
    {
        System.out.println("All bharatvanshis are fighters");
    }
    
    abstract void obey();
    abstract void kind();
}
