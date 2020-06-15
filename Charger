package FirstPackage;
 
import java.sql.Time;
import java.util.ArrayList;

enum ChargerStatus{empty,busy}
enum ModelCharger{OC450kw,DC50KW,HVC300PD,HVC100PUS}
enum kind{overnight,quick}
 enum Manufacture{ABB, HELIOX}
public class Charger extends Item {
	 public static ModelCharger overnight=ModelCharger.DC50KW;
	public static double priceOfOvernightCharger,priceOfFastCharger;
    
	public static ModelCharger fast=ModelCharger.DC50KW;
	public static int ID;
	public static int westNumberOfOverNightCharging=0,eastNumberOfFastCharging=0,eastNumberOfOverNightCharging=0,westNumberOfFastCharging=0;
	public double power;
	public BusCharged chargingSchedule;
	public ModelCharger model;	
	public Manufacture manufacture;
	public String Id;
	public Place place;
	public ChargerStatus status;
	
	public ArrayList<ArrayList<Time> > chargerSchedule 
    = new ArrayList<ArrayList<Time> >();
	public ArrayList<Bus> busCharged=new ArrayList<>();
	public ArrayList<Time> schedule=new ArrayList<Time>();
	public Time startOfCharging,endOfCharging;
	public static ArrayList<Time> scheduleWest=new ArrayList<Time>();
	public static ArrayList<Time> scheduleEast=new ArrayList<Time>();
	public Bus[] busList;
	public Charger() {
		this.manufacture=Manufacture.HELIOX;
		this.model=ModelCharger.OC450kw;
		if (this.model.equals(ModelCharger.OC450kw)) this.power=450;
		ID++;
		this.Id=""+ID+this.getModel();
		this.power=450;
		this.status=ChargerStatus.empty;
		this.chargingSchedule=new BusCharged();
	}
	
	
	public Charger(ModelCharger model,Place p) {
		this.model=model;
		     if(this.model.equals(ModelCharger.OC450kw)) this.power=450;
		else if(this.model.equals(ModelCharger.DC50KW))this.power=50;
		else if(this.model.equals(ModelCharger.HVC300PD))this.power=300;
		else if(this.model.equals(ModelCharger.HVC100PUS))this.power=100;
		ID++;
		this.Id=""+p+""+ID+this.getModel();
		
		this.status=ChargerStatus.empty;
		this.chargingSchedule=new BusCharged();
	}
	
	public Charger(double p,ModelCharger model) {
		this.price=p;
		this.model=model;
		if (this.model.equals(ModelCharger.OC450kw)) this.power=450;
		else if(this.model.equals(ModelCharger.HVC300PD)) this.power=50;
		else if(this.model.equals(ModelCharger.HVC300PD))this.power=300;
		else this.power=100;
		ID++;
		this.Id=""+this.model+ID;
		this.chargingSchedule=new BusCharged();
	}
	public Charger(Charger g) {
		this.model=g.model;
		this.power=g.power;
		this.Id=g.Id;
	}
	public ModelCharger  getModel() {
		return this.model;
	}
	public void setModel(ModelCharger m) {
		this.model=m;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double p) {
		this.power=p;
	}
	public void setId(String id) {
		this.Id=id;
		}
	public String getId() {
	return Id;	
	}
public String toString() {
	return "this charger's model is "+this.model+" the time of charging is "+this.startOfCharging+" until "+this.endOfCharging+ "in the "+ this.place;
}
public boolean equals(Charger otherObject) {
	if(otherObject==null)
		return false;
	else if(getClass()!=otherObject.getClass())
		return false;
	else {
		Charger otherCharger=(Charger)otherObject;
		return(model.equals(otherCharger.model) && power==otherCharger.power && 
				 this.Id==otherObject.Id )        ;
	}
}


public void ShowMainChargerSchedule() {
	System.out.println("  Charger "+ this.Id);
	System.out.println("bus  \t"+"Start\t"+"\tfinish"+"\tNextTrip");
	this.chargingSchedule.showSchedule();
	
	
}
}
