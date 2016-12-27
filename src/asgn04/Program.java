package asgn04;

public class Program {

	public static void main(String[] args) {
		
		VotingData states = new VotingData();	
		
		HonestDisplay honestDisplay = new HonestDisplay(states);
		DemocraticPopRepublicanElecDisplay demPopRepElecDisplay = new DemocraticPopRepublicanElecDisplay(states);
		FavorDemocraticDisplay favorDemDisplay = new FavorDemocraticDisplay(states);
		FavorRepublicanDisplay favorRepDisplay = new FavorRepublicanDisplay(states);
		HonestElecFavorDemocraticPopDisplay honestElecFavorDemPopDisplay = new HonestElecFavorDemocraticPopDisplay(states);
		
		
		int[] demVotes = new int[5];
		int[] repVotes = new int[5];
		int[] elecDemVotes = new int[5];
		int[] elecRepVotes = new int[5];
		
		//STATE 1
		demVotes[0] = 10000;
		repVotes[0] = 20000;
		elecDemVotes[0] = 0;
		elecRepVotes[0] = 15;
		
		//STATE 2
		demVotes[1] = 60000;
		repVotes[1] = 50000;
		elecDemVotes[1] = 20;
		elecRepVotes[1] = 0;
		
		//STATE 3
		demVotes[2] = 15500;
		repVotes[2] = 25000;
		elecDemVotes[2] = 0;
		elecRepVotes[2] = 30;
		
		//STATE 4
		demVotes[3] = 12000;
		repVotes[3] = 8000;
		elecDemVotes[3] = 30;
		elecRepVotes[3] = 0;
		
		//STATE 5
		demVotes[4] = 50000;
		repVotes[4] = 6850;
		elecDemVotes[4] = 12;
		elecRepVotes[4] = 0;
		
		//set the votes
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
		
		//Change the votes and set them again.
		//displays will automatically resend their updated messages:
	
		//STATE 1
		demVotes[0] = 16000;
		repVotes[0] = 400000;
		elecDemVotes[0] = 0;
		elecRepVotes[0] = 13;
		
		//STATE 2
		demVotes[1] = 17800;
		repVotes[1] = 1000;
		elecDemVotes[1] = 5;
		elecRepVotes[1] = 0;
		
		//STATE 3
		demVotes[2] = 5000;
		repVotes[2] = 6000000;
		elecDemVotes[2] = 0;
		elecRepVotes[2] = 30;
				
		//STATE 4
		demVotes[3] = 12000;
		repVotes[3] = 12345;
		elecDemVotes[3] = 30;
		elecRepVotes[3] = 0;
				
		//STATE 5
		demVotes[4] = 1200;
		repVotes[4] = 60500;
		elecDemVotes[4] = 0;
		elecRepVotes[4] = 12;
		
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
	}

}
