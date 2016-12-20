package asgn04;

public class Program {

	public static void main(String[] args) {
		VotingData votingData = new VotingData();
		CurrentElectionDisplay display1 = new CurrentElectionDisplay(votingData);
		
		votingData.setVotes(100000,  200000, 15);	
		votingData.setVotes(30000,  20000, 5);
		
		//display election results using the 5 observers 
		votingData.setVotes(100000,  200000, 15);
		FavorRepublicanDisplay repDisplay = new FavorRepublicanDisplay(votingData);
		votingData.setVotes(100000,  200000, 15);
		FavorDemocraticDisplay demDisplay = new FavorDemocraticDisplay(votingData);
		votingData.setVotes(100000,  200000, 15);	
		DemocraticPopRepublicanElecDisplay demPopRepElecDisplay = new DemocraticPopRepublicanElecDisplay(votingData);
		votingData.setVotes(100000,  200000, 15);
		HonestElecFavorDemocraticPopDisplay honestElecFavorDemPopDisplay = new HonestElecFavorDemocraticPopDisplay(votingData);
		votingData.setVotes(100000,  200000, 15);
		HonestDisplay honestDisplay = new HonestDisplay(votingData);
	}

}
