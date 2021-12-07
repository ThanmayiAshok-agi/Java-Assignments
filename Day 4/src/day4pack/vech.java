package day4pack;

public class vech {

}
interface IVehicle
{
	public double tunecost();
	
	public boolean CanCarry(int numPassengers);
}
class H implements IVehicle 
{
	public double tunecost() {

		return 500;
	}
	public boolean CanCarry(int numPassengers) {
		boolean status=true;
		if(numPassengers>10)
		{
			status=false;
		}
		return status;
	}
}