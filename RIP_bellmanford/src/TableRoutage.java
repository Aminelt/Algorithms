import java.util.ArrayList;

public class TableRoutage {
ArrayList<String> destination; 
ArrayList<String> distance ;   
ArrayList<String> route ; 

public TableRoutage(ArrayList<String> destination, ArrayList<String> distance, ArrayList<String> route) {
	super();
	this.destination = destination; 
	this.distance = distance;
	this.route=route ;
}

public TableRoutage(ArrayList<String> destination, ArrayList<String> distance) {
	super();
	this.destination = destination; 
	this.distance = distance;
}

public ArrayList<String> getDestination() {
	return destination;
}

public void setDestination(ArrayList<String> destination) {
	this.destination = destination;
}

public ArrayList<String> getDistance() {
	return distance;
}

public void setDistance(ArrayList<String> distance) {
	this.distance = distance;
}

public ArrayList<String> getRoute() {
	return route;
}

public void setRoute(ArrayList<String> route) {
	this.route = route;
}

public void ajouterDistance(int element) {
	this.distance.add(Integer.toString(element));
}

public void ajouterRoute(String element) {
	this.route.add(element);
}
public void ajouterDestination(String element) {
	this.destination.add(element);
}

public void modifierDistance(String r ,int index) {
this.distance.set(index, r)	;
}

public void modifierRoute(String r ,int index) {
this.route.set(index, r)	;
}
public void MiseAjourDelaTable(TableRoutage R1) {
	// pqrcourur les deux tqbles en comparant 
	for( String destR1 : R1.getDestination() ) {
		for(int i=0; i<this.getDestination().size();i++) {
			String destR2 = this.getDestination().get(i);
			if(!destR2.equals(destR1)) {
				this.ajouterDestination(destR1);
				int index = R1.destination.indexOf(destR1);
				this.ajouterDistance(Integer.parseInt(R1.distance.get(index))+1);
				this.ajouterRoute("R1");
			}
			else {
				int indexR2 = this.destination.indexOf(destR2);
				String routeurpassage = this.route.get(indexR2);
				
				if(routeurpassage.equals("R1")) {
					
					int indexR1= R1.getDestination().indexOf(destR1);
					
					String newcout=Integer.toString(Integer.parseInt(R1.distance.get(indexR1))+1);
					
					this.modifierDistance(newcout, indexR2);
					
				}
				
				int indexR1= R1.getDestination().indexOf(destR1);
				
				
				int newcout=Integer.parseInt(R1.getDistance().get(indexR1))+1;
				
				
				int oldcout= Integer.parseInt(this.getDistance().get(indexR2));
				
				if ((!routeurpassage.equals("R1"))  &&  (newcout<oldcout)){
					
					String newcoutStr = Integer.toString(newcout);
					
					this.modifierDistance(newcoutStr, indexR2);
					
					this.modifierRoute("R1", indexR2);
					
				}
			  
			}
		}
	
	}
}
public void Affichage() {
	for(String e : this.getDestination()) {
		System.out.print(e + " ");
	}
	System.out.println();
	for(String e : this.getDistance()) {
		System.out.print(e + " ");
	}
	
	System.out.println();
	for(String e : this.getRoute()) {
		System.out.print(e + " ");
	}
	
}

}