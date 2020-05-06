 package FirstPackage;
  enum Model{small,Big}

public class Battery {
	public Model model;
	public int capacity; //{294,394};
	public double stateOfCharching;
	
	public static int ID=0;
	public String Id;
    public double chargingStateBeforeTrip;
	public double chargingStateAfterTrip;
	public double chargingStateBeforeCharging;
	public double chargingStateAftercharging;
	public Battery() {
		this.model=Model.small;
		int s;
		if (this.model.equals(Model.small))  s=394;
		else s=300;
		this.capacity=s;
		this.stateOfCharching=s;
		ID++;
		this.Id=ID+" "+this.capacity;
	}
	public Battery(Model m) {
		this.model=m;
		int s;
		if (this.model.equals(Model.small))  s=294;else   s=394;
		this.capacity=s;
		
		this.stateOfCharching=s
				;
		ID++;
		this.Id=ID+" "+this.capacity;
	}
	public Battery(Battery b) {
		this.model=b.model;
		this.capacity=b.capacity;
		this.stateOfCharching=b.stateOfCharching;
		ID++;
		this.Id=ID+" "+this.capacity;
	}
	public Model getModel() {
		return this.model;
	}
	public void setModel(Model m) {
		this.model=m;
	}
	public int getCapacity() {
		return capacity;}
	public void setCapacity(int c)
	{
		this.capacity=c;
	}
	public double getStateOfCHarging() {
		return this.stateOfCharching;
	}
	public void setStateOfCHarging(double s)
	{
		this.stateOfCharching=s;	
	}
	public String getID() {
		return this.Id;
	}
	public String toString() {
		return "this battery "+this.model+"has  capacity "+this.capacity+"and satate of charging is"+ this.stateOfCharching
				+"its Id is "+Id;
	}
	public boolean equals(Object otherObject) {
		if(otherObject==null)
			return false;
		else if(getClass()!=otherObject.getClass())
			return false;
		else {
			Battery otherBattery=(Battery)otherObject;
			return(model.equals(otherBattery.model) && capacity==otherBattery.capacity 
					&& this.stateOfCharching==otherBattery.stateOfCharching && this.Id==otherBattery.Id )        ;
		}
	}
}

