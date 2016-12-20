package asgn04;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		VotingData state1 = new VotingData();
		VotingData state2 = new VotingData();
		VotingData state3 = new VotingData();
		VotingData state4 = new VotingData();
		VotingData state5 = new VotingData();
		
		//display election results using the 5 observers 
		state1.setVotes(100000,  200000, 30000);	
		FavorRepublicanDisplay repDisplay = new FavorRepublicanDisplay(state1);
		state2.setVotes(100000,  200000, 30000);	
		FavorDemocraticDisplay demDisplay = new FavorDemocraticDisplay(state2);
		state3.setVotes(100000,  200000, 30000);		
		DemocraticPopRepublicanElecDisplay demPopRepElecDisplay = new DemocraticPopRepublicanElecDisplay(state3);
		state4.setVotes(100000,  200000, 30000);	
		HonestElecFavorDemocraticPopDisplay honestElecFavorDemPopDisplay = new HonestElecFavorDemocraticPopDisplay(state4);
		state5.setVotes(100000,  200000, 30000);	
		HonestDisplay honestDisplay = new HonestDisplay(state5);
	}

}
