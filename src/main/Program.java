package main;

import asgn04.DemocraticPopRepublicanElecDisplay;
import asgn04.FavorDemocraticDisplay;
import asgn04.FavorRepublicanDisplay;
import asgn04.HonestDisplay;
import asgn04.HonestElecFavorDemocraticPopDisplay;
import asgn04.VotingData;

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
		demVotes[1] = 5000;
		repVotes[1] = 6000;
		elecDemVotes[1] = 20;
		elecRepVotes[1] = 0;
		
		//STATE 3
		demVotes[2] = 5000;
		repVotes[2] = 6000;
		elecDemVotes[2] = 20;
		elecRepVotes[2] = 0;
		
		//STATE 4
		demVotes[3] = 5000;
		repVotes[3] = 6000;
		elecDemVotes[3] = 20;
		elecRepVotes[3] = 0;
		
		//STATE 5
		demVotes[4] = 5000;
		repVotes[4] = 6000;
		elecDemVotes[4] = 20;
		elecRepVotes[4] = 0;
		
		//set the votes
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
		
		//Change the votes and set them again.
		//displays will automatically resend their updated messages:
	
		//STATE 1
		demVotes[0] = 40000;
		repVotes[0] = 10000;
		elecDemVotes[0] = 0;
		elecRepVotes[0] = 15;
		
		//STATE 2
		demVotes[1] = 20000;
		repVotes[1] = 1000000;
		elecDemVotes[1] = 10;
		elecRepVotes[1] = 0;
		
		//STATE 3
		demVotes[2] = 5000;
		repVotes[2] = 6000;
		elecDemVotes[2] = 20;
		elecRepVotes[2] = 0;
				
		//STATE 4
		demVotes[3] = 5000;
		repVotes[3] = 6000;
		elecDemVotes[3] = 20;
		elecRepVotes[3] = 0;
				
		//STATE 5
		demVotes[4] = 5000;
		repVotes[4] = 6000;
		elecDemVotes[4] = 20;
		elecRepVotes[4] = 0;
		
		states.setVotes(demVotes, repVotes, elecDemVotes, elecRepVotes);
	}

}
