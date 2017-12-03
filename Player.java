import java.util.ArrayList;


public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card>  oneRoundCard;
	
	public Player(String name , int chips){
		this.name = name;
		this.chips = chips;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void sayHello(){
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
	
	public int makeBet(){
		int bet=1;
		if(chips<=0){
			bet=0;
		}
		return bet;
	}
	
	public void setOneRoundCard(ArrayList cards){
		oneRoundCard = new ArrayList<Card>();
		oneRoundCard=cards;
		
	}
	
	public boolean hitMe(){
		setOneRoundCard(oneRoundCard);
		int ThisRank = 0 ; 
		for (int i =0;i<oneRoundCard.size();i++)
		{
			Card thisRound = oneRoundCard.get(i);
			ThisRank = thisRound.getRank();
			
		}
		if (ThisRank==11||ThisRank==12||ThisRank==13){
			ThisRank = 10;
		}
		else if(ThisRank==1){
			ThisRank = 1;
		}
		else{
			ThisRank = ThisRank;
		}
		ThisRank+=ThisRank;
		
		if (ThisRank<=16 ){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public int getTotalValue(){
		setOneRoundCard(oneRoundCard);
		int total = 0 ; 
		for (int i =0;i<oneRoundCard.size();i++)
		{
			Card thisRound = oneRoundCard.get(i);
			total= thisRound.getRank();
			
		}
		if (total==11||total==12||total==13){
			total = 10;
		}
		else if(total==1){
			total = 1;
		}
		else{
			total = total;
		}
		total+=total;
		return total;


	}
	
	public int getCurrentChips(){
		chips = (chips - bet);
		return chips;
	}
	
	public void increaseChips (int diff){
		
	}
	

}
