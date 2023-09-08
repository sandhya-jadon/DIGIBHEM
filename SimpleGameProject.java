import java.util.Scanner;
class SimpleGameProject{
  public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
	int count = 0;
	int rand = (int)(Math.random() * 100) + 1;
	System.out.println("NOTE: you have to guess the number within 10 attempts and every wrong attempt will reduce 1 point \n but you will get 10 points when you will finally guess the right number"); 
	System.out.println("Enter the number");
	for(int i=1; i<=10; i++){
	  int num = s1.nextInt();
	  if(num == rand){
	    System.out.println("Congratulations! you Guessed the number");
		count = count+10;
		break;
	  }
	  else if(num > rand){
	    System.out.println("you have entered a big number");
		count = count-1;
		System.out.println("Enter small number");
	  }
	  else if(num < rand){
	    System.out.println("you have entered a small number");
		count = count-1;
		System.out.println("Enter big number");
	  }
	}
	System.out.println("your score is " + count + " points");
 }
}

 