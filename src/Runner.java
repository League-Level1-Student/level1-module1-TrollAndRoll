
public class Runner
	{
		public static void main(String[] args) 
		{
			Person hi = new Person("Rabbit");
			hi.setSuperpower("Laser Vision");
			
			Person bye = new Person("Sheep");
			bye.setSuperpower("Super strenght");
			
			Person yes = new Person("Turtle");
			yes.setSuperpower("Super hearing");
			
			System.out.println(yes);
			System.out.println(hi);
			System.out.println(bye);
		}
	}
