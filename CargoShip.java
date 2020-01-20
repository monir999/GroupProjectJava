package exercises;

	public class CargoShip extends Ship {
	
    public int CargoCapacity;

    public CargoShip()

{

    CargoCapacity = 0;
}

    public CargoShip (int cc, String n, String y)

{

    	super(n,y);

    	CargoCapacity = cc;

}

    public int getCargoCapacity() {

    	return CargoCapacity;

}

    public void setCargoCapacity(int cargoCapacity) {

    	this.CargoCapacity = cargoCapacity;



    public String toString(){

    	return "The ship's name is: " + getShipName() + " and the ship's cargo capacity is: " + getCargoCapacity() + " and the ship's year is: " + getShipYear();

}

}

	
	


