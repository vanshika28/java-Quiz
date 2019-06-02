import java.util.Scanner;
class songs{
	public static void sng(){
	System.out.println("Who has sing the song ANKH MARE??");
			 System.out.println("1-) Arjit singh  2-) Atif Aslam 3-)Kumar Sanu 4-)Hardy Sandhu");
			 Scanner s = new Scanner(System.in);
			 int a = s.nextInt();
			 if (a!=3){
				 System.out.println("Wrong answer");
			 }
			 else{
				 System.out.println("Correct answer");
			 }
}
}
class movies extends songs {
	public static void movie(){
		System.out.println("Who is the Director of ANDHADHUN ??");
	    System.out.println("1-) SriRam 2-) Karan johar 3-) Bansali 4-) Rajamouli");
		Scanner s = new Scanner(System.in);
			 int b = s.nextInt();
			 if(b!=1){
				 System.out.println("wrong answer");
			 }
			 else{
				 System.out.println("correct answer");
			 }
	}
}
class Politics extends songs {
	public static void politic(){
		System.out.println("Who is the prime Minister of India");
			 System.out.println("1-) Narendr Modi  2-) Manmohan Singh 3-) Arvind kejriwal");
			 Scanner s = new Scanner(System.in);
			 int d= s.nextInt();
			 if(d!=1){
				 System.out.println("Wrong answer");
			 }
			 else{
				 System.out.println("Correct answer");
			 }
		
	}
}
class Sports extends Politics{
	public static void sport(){
		 System.out.println("Who is the Captain of Indian Cricket team");
			 System.out.println("1-)Ms Dhoni 2-) Virat kholi 3-) Rohit Sharma 4-) Dhawan");
			 Scanner s = new Scanner(System.in);
			 int c = s.nextInt();
			 if(c!=2){
				 System.out.println("wrong answer");
			 }
			 else{
				 System.out.println("Correct answer");
			 }
	}
}
class Quiz1{
	public static void main(String args[]){
		Sports ss = new Sports();
		Scanner w = new Scanner(System.in);
		System.out.println(" 1-Enter ur choice");
		System.out.println(" 2 -Quiz about sports");
		System.out.println("3-Quiz about politics");
		System.out.println("4-Quiz about songs");
		System.out.println("5-Quiz about movies");
		int ch =  w.nextInt();
		switch(ch){
			case 1 :
		     ss.sport();
		     break;
			 case 2:
		     ss.politic();
			 break;
			 case 3:
		     ss.sng();
			 break;
			 case 4:
		     movies m = new movies();
		     m.movie();
		    break;
			default :
			System.out.println("Invalid choice");
			break;
	}
}}