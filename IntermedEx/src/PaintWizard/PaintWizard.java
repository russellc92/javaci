package PaintWizard;

import java.util.ArrayList;


// String nameCan, double cost, double cap, double coverage
public class PaintWizard {

	public static void main(String[] args) {
		CanProcess CanProcessing = new CanProcess();
		
		// Add cans of paint
		PaintCan CheapoMax = new PaintCan("CheapoMax", 19.99, 20.00, 10.00);
		PaintCan AverageJoe = new PaintCan("AverageJoe", 17.99, 15.00, 11.00);
		PaintCan DuluxourousPaints = new PaintCan("DuluxourousPaints", 25.00, 10.00, 20.00);
		PaintCan TestCanLOL = new PaintCan("TestCanLOLOLOL", 1.00, 100.00, 80.00);
		
		// add the cans to a list of cans
		ArrayList<PaintCan> Cans = new ArrayList<PaintCan>();
		Cans.add(CheapoMax);
		Cans.add(AverageJoe);
		Cans.add(DuluxourousPaints);
		Cans.add(TestCanLOL);
		 
		double roomVolume = 500;
		
		
		
		// cheapest price can for given room
		System.out.println(CanProcessing.findRoomCheapest(Cans, roomVolume));

		// Finds the can that has the least waste (least paint left over) from a given room
		System.out.println(CanProcessing.findLeastWaste(Cans, roomVolume));
		
		// Extra Method "Best Choice" : Find best total coverage for its price (cheapest)
		System.out.println(CanProcessing.findBestCoverageRatioPrice(Cans));
		
		
	}
	
	
}
		
/*

calculate which of the following three products, would be the cheapest to buy, for the room you are painting.  

Work out which one wastes the least.

Work out which is the best choice for any room (Cheapest).


CheapoMax (20 litre) £19.99
10m2 per litre

AverageJoes (15 Litre) £17.99
11m2 per litre

DuluxourousPaints (10 litre) £25
20m2 per litre

*/