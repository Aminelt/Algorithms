import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//table 
        ArrayList<String> destinationR2 = new ArrayList<String>();
  
       
        destinationR2.add("Reseau1");
        destinationR2.add("Reseau2");
        destinationR2.add("Reseau4");
        destinationR2.add("Reseau17");
        destinationR2.add("Reseau24");
        destinationR2.add("Reseau30");
        destinationR2.add("Reseau42");
        ArrayList<String> distanceR2 = new ArrayList<String>();
        
        distanceR2.add("0");
        distanceR2.add("0");
        distanceR2.add("8");
        distanceR2.add("5");
        distanceR2.add("6");
        distanceR2.add("2");
        distanceR2.add("2");
        
        ArrayList<String> routeR2 = new ArrayList<String>();
        routeR2.add("directe");
        routeR2.add("directe");
        routeR2.add("R5");
        routeR2.add("R4");
        routeR2.add("R1");
        routeR2.add("R3");
        routeR2.add("R1");

        
// table R1
        ArrayList<String> destinationR1 = new ArrayList<String>();
        
        
        destinationR1.add("Reseau1");
        destinationR1.add("Reseau4");
        destinationR1.add("Reseau17");
        destinationR1.add("Reseau21");
        destinationR1.add("Reseau24");
        destinationR1.add("Reseau30");
        destinationR1.add("Reseau42");
        ArrayList<String> distanceR1 = new ArrayList<String>();
        
        distanceR1.add("2");
        distanceR1.add("3");
        distanceR1.add("6");
        distanceR1.add("4");
        distanceR1.add("5");
        distanceR1.add("10");
        distanceR1.add("3");



        
       TableRoutage tableR2 = new TableRoutage(destinationR2 ,distanceR2 ,routeR2) ;
       TableRoutage tableR1 = new TableRoutage(destinationR1 ,distanceR1) ;
       tableR2.Affichage(); 
       System.out.println("**************************************");
       tableR2.MiseAjourDelaTable(tableR1);
       tableR2.Affichage();
}
}
