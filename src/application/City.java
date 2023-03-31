package application;
import java.util.ArrayList;

public class City implements Comparable<City> {
	private String name;
	private int arialCost;
	private int walkingCost;
	private int drivingCost;
	private LinkedList<Dest> distenations = new LinkedList<Dest>();
	public City parent ;
	public int totalCost = -1 ;
	
	

	public City(String name, int arialCost, int walkingCost, int drivingCost, LinkedList<Dest> distenations,
			City parent, int totalCost) {
		super();
		this.name = name;
		this.arialCost = arialCost;
		this.walkingCost = walkingCost;
		this.drivingCost = drivingCost;
		this.distenations = distenations;
		this.parent = parent;
		this.totalCost = totalCost;
	}

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArialCost() {
		return arialCost;
	}

	public void setArialCost(int arialCost) {
		this.arialCost = arialCost;
	}

	public int getWalkingCost() {
		return walkingCost;
	}

	public void setWalkingCost(int walkingCost) {
		this.walkingCost = walkingCost;
	}

	public int getDrivingCost() {
		return drivingCost;
	}
	public ArrayList<String> findDistenations() {
		ArrayList<String> result = new ArrayList<>() ;
		Node<Dest> temp = distenations.getHead() ;
		while(temp != null) {
			if(temp.getData().getWalkingCost()!=-1 && temp.getData().getDrivingCost()!=-1 && temp.getData().getDrivingCost() != 0)
				result.add(temp.getData().getName()) ;
			temp = temp.getNext() ;
		}
		return result ;
	}

	public void setDrivingCost(int drivingCost) {
		this.drivingCost = drivingCost;
	}

	public LinkedList<Dest> getDistenations() {
		return distenations;
	}

	public void setDistenations(LinkedList<Dest> distenations) {
		this.distenations = distenations;
	}

	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		if (this.getName().compareTo(o.getName()) > 0)
			return 1;
		else if (this.getName().compareTo(o.getName()) < 0)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "City [" + (name != null ? "name=" + name + ", " : "")  + (parent != null ? "From=" + parent.getName() : "")
				+ "]\n";
	}
	
	public String tostring() {
		return "City [" + (name != null ? "name=" + name + ", " : "") + ", walkingCost="
				+ walkingCost + "km, drivingCost=" + drivingCost + "km, " + (parent != null ? "From=" + parent.getName() : "")
				+ "]\n";
	}
	

}