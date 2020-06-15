package FirstPackage;

import java.sql.Time;
enum Direction{west,east}
enum RouteStatus{empty,busy}

public class Route {
	static int ID;

	public Time time;
	public Direction direction;
	public String Id;
	public RouteStatus status;

	Bus bas;
    public static int distance=40;
	public Place place;
	public Bus[] basList;
	public double stateOfChargingBeforeTrip,stateOfChargingAfterTrip;


	@SuppressWarnings("deprecation")
	public Route(Time t) {
		this.status=status.empty;
		this.time=t;	
		this.direction=Direction.east;
		this.Id=""+this.direction+this.time+"";
		ID++;
		this.place=Place.west;
		this.bas=new Bus();
	}
	public Route(Time t,Direction s) {
		this.status=RouteStatus.empty;
		this.time=t;
		this.direction=s;	

		if(this.direction==Direction.east)this.place=Place.west;
		else if (this.direction==Direction.west) this.place=Place.east;
		this.Id= ""+this.direction+this.time+"";
		this.bas=new Bus();
		
	}
	public Route(Route r) {
		this.status=r.status;
		this.time=r.time;	
		this.direction=r.direction;
		this.Id=""+this.direction+this.time+"";
		ID++;
		this.place=r.place;


	}

	public void makeItBusy() {
		this.status=RouteStatus.busy;
	}

	public String toString()
	{
		return "In the "+this.place+"  at the time "+this.time+" and it is "+this.status+"by the bus \t"+this.bas.id+ " stateOfCharging: \t"+(int)this.stateOfChargingBeforeTrip +"\tthe state of charging after reip is\t"+(int)this.stateOfChargingAfterTrip; 

	}


	public boolean equals(Object otherObject) {
		if(otherObject==null)return false;
		else if(this.getClass()!=otherObject.getClass())
			return false;
		else {
			Route r= (Route) otherObject;
			return(this.Id==r.Id);}		
	}



} 



