public class InterfaceDemo{
  public static void main (String args []){

	Ball b = new Ball();
	    b.play();
	    b.roll();
	    b.bounce();

  }
}

interface Rollable{
   void roll(); // by default abstract and public
}

interface Bounceable{
   void bounce(); //by default abstract and public
}

class Toy{
     void Play(){
	//toy specific implementation
	System.out.println("Playing - toy implementaion");
  }
}
class Ball extends Toy implements Rollable,Bounceable{
   public void roll(){ // overriding - must to do
	System.out.println("Rolling- ball implementation");
  }
 //  public void bounce(){}  or
     
     public void bounce(){
	System.out.println("Bouncing- ball implementation");
  }
  
   void play(){
	//toy specific implementation
	System.out.println("Playing - ball implementaion");
  }

}

// class Ball IS_A Toy ans Ball IS rollable.