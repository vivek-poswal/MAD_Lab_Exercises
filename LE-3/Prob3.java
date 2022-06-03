/*
Ques 3. 
Beautiful Code: Separate out uncompromisers JUET students create a game of ducks. There were Rubber Ducks (RD),Wooden 
Ducks (WD), RedHead Ducks (RHD), and Lake Ducks (LD), as of now. There may be more in the future. As it can be guessed, 
all ducks can swim. RD and WD can’t fly. RD squeaks. WD is mute. RHD and LD quack. Design and Implement.You might be 
tempted to make an abstract class ‘Duck’ by keeping fly and quack behaviors abstract and swim behavior defined. 
Although this approach is not wrong, but definitely not the best. Think and write some beautiful code using interfaces.
*/

//Main.java

public class Main
{
	public static void main(String[] args) {
		duck wd = new WD();
		duck rd = new RD();
		duck rhd = new RHD();
		duck ld = new LD();
		
		wd.display();
		wd.performFly();
		wd.performQuack();
		wd.swim();
		
		
		rd.display();
		rd.performFly();
		rd.performQuack();
		rd.swim();
		
		rhd.display();
		rhd.performFly();
		rhd.performQuack();
		rhd.swim();
		
		ld.display();
		ld.performFly();
		ld.performQuack();
		ld.swim();
	}
}

interface quacking{
    void quack();
}


class quacks implements quacking{
    public void quack(){
        System.out.println("Quacks");
    }
}


class silent implements quacking{
    public void quack(){
        System.out.println("Silence");
    }
}


class squeak implements quacking{
    public void quack(){
        System.out.println("squeaks");
    }
}


interface fly{
    void flies();
}



class canf implements fly{
    public void flies(){
        System.out.println("can fly");
    }
}

class cannotf implements fly{
    public void flies(){
        System.out.println("cannot fly");
    }
}



class WD extends duck{
    public WD(){
        q = new silent();
        f = new cannotf();
    }
    
    public void display(){
        System.out.println("Wooden Duck");
    }
}


class RD extends duck{
    public RD(){
        q = new squeak();
        f = new cannotf();
    }
    
    public void display(){
        System.out.println("Rubber Duck");
    }
}



class RHD extends duck{
    public RHD(){
        q = new quacks();
        f = new canf();
    }
    
    public void display(){
        System.out.println("Red head Duck");
    }
}

class LD extends duck{
    public LD(){
        q = new quacks();
        f = new canf();
    }
    
    public void display(){
        System.out.println("Lake Duck");
    }
}

//duck.java

public abstract class duck{
    
    fly f ;
    quacking q ;
    
    public duck(){
        
    }
    
    public abstract void display();
    
    public void performFly(){
        f.flies();
    }
    
    public void performQuack(){
        q.quack();
    }
    
    public void swim(){
        System.out.println("All ducks float");
    }
}