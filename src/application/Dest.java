package application;

public class Dest implements Comparable<Dest> {
	private String name;
	private int arialCost;
	private int walkingCost;
	private int drivingCost;
	private String from;

	public Dest(String name) {
		super();
		this.name = name;
	}

	public Dest(String name, int arialCost, int walkingCost, int drivingCost, String from) {
		super();
		this.name = name;
		this.arialCost = arialCost;
		this.walkingCost = walkingCost;
		this.drivingCost = drivingCost;
		this.from = from;
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

	public void setDrivingCost(int drivingCost) {
		this.drivingCost = drivingCost;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public int compareTo(Dest o) {
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
		return "Dest [name=" + name + ", arialCost=" + arialCost + ", walkingCost=" + walkingCost + ", drivingCost="
				+ drivingCost + ", from=" + from + "]";
	}

}
