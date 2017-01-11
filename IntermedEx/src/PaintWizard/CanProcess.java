package PaintWizard;

import java.util.ArrayList;

public class CanProcess {

	public String findRoomCheapest(ArrayList<PaintCan> can, double roomVol)
	{
		double temp;
		double cansReq = 0;
		double priceTemp = 999.0;
		String canName = "";
		for(PaintCan cann: can)
		{
			temp = roomVol / cann.getCoverageLitre(); // find out how many litres we need.
			cansReq = Math.ceil(temp / cann.getCapacity()); // amt of cans from litres it has and needed
			if(priceTemp > (cansReq * cann.getPrice()))
			{
				priceTemp = cansReq * cann.getPrice();
				canName = cann.getName();
			}
		}
		return canName;
	}

	public String findLeastWaste(ArrayList<PaintCan> can, double roomVol)
	{
		double temp;
		double cansReq = 0.0;
		double cansReqTemp = 0.0;
		double wastage = 999.0;
		String canName = "n";

		for(PaintCan cann: can)
		{
			temp = cann.getCapacity() * cann.getCoverageLitre();
			cansReqTemp = roomVol/temp;
			cansReq = Math.ceil(roomVol/temp);		
			if(wastage > (cansReq - cansReqTemp))
			{
				wastage = cansReq - cansReqTemp;
				canName = cann.getName();
			}
		}
		return canName;
	}

	public String findBestCoverageRatioPrice(ArrayList<PaintCan> can)
	{// Extra Method "Best Choice" : Find best total coverage for its price (cheapest pice per litre)
		String canName = "";
		double totCoverage = 0.0;
		double pricePerLitre = 999999.0;
		for(PaintCan cann: can)
		{
			totCoverage = cann.getCapacity() * cann.getCoverageLitre();
			if(pricePerLitre > totCoverage / cann.getPrice())
			{
				pricePerLitre = totCoverage / cann.getPrice();
				canName = cann.getName();
			}
		}		
		return canName;
	}
}
