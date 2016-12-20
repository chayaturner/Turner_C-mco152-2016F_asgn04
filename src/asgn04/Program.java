package asgn04;

public class Program {

	public static void main(String[] args) {
		VotingData votingData = new VotingData();
		
		//display election results using the 5 observers 
		votingData.setVotes(100000,  200000, 30000);	
		FavorRepublicanDisplay repDisplay = new FavorRepublicanDisplay(votingData);
		votingData.setVotes(100000,  200000, 30000);	
		FavorDemocraticDisplay demDisplay = new FavorDemocraticDisplay(votingData);
		votingData.setVotes(100000,  200000, 30000);		
		DemocraticPopRepublicanElecDisplay demPopRepElecDisplay = new DemocraticPopRepublicanElecDisplay(votingData);
		votingData.setVotes(100000,  200000, 30000);	
		HonestElecFavorDemocraticPopDisplay honestElecFavorDemPopDisplay = new HonestElecFavorDemocraticPopDisplay(votingData);
		votingData.setVotes(100000,  200000, 30000);	
		HonestDisplay honestDisplay = new HonestDisplay(votingData);
	}

}
