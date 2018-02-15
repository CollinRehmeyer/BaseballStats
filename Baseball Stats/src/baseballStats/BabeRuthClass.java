package baseballStats;
import java.util.Scanner;

public class BabeRuthClass 
{
	public static String playerName;
	public static double atBats;
	public static double hits;
	public static double doubles;
	public static double triples;
	public static double homeRuns;
	public static double runs;
	public static double walks;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input player name");
		playerName = input.nextLine();
		
		System.out.println("Input # of at-bats");
		atBats = input.nextDouble();
		
		System.out.println("input # of hits");
		hits = input.nextDouble();
		
		System.out.println("input # of doubles");
		doubles = input.nextDouble();
		
		System.out.println("input # of triples");
		triples = input.nextDouble();
		
		System.out.println("input # of home runs");
		homeRuns = input.nextDouble();
		
		System.out.println("input # of runs");
		runs = input.nextDouble();
		
		System.out.println("input # of walks");
		walks = input.nextDouble();
		
		System.out.println("Batting average is: " + findBA());
		System.out.println("On base percentage is: " + findOBP());
		System.out.println("Slugging percentage is: " + findSLG());
		System.out.println("OBP plus SLG is: " + findOBS());
		System.out.println("Total bases is: " + findTB());
	}
	
	public static double findBA()
	{
		return hits / atBats;
	}
	
	public static double findOBP()
	{
		return (hits + walks) / (atBats + walks);
	}
	
	public static double findSLG()
	{
		return (runs + (2 * doubles) + (3 * triples) + (4 * homeRuns)) / atBats;
	}
	
	public static double findOBS()
	{
		return findOBP() + findSLG();
	}
	
	public static double findTB()
	{
		return (runs + (2 * doubles) + (3 * triples) + (4 * homeRuns));
	}
}
