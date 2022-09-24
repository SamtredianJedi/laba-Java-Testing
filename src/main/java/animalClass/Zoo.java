package animalclass;

import org.apache.logging.log4j.*;

import java.util.ArrayList;
public class Zoo {
	private static final Logger LOGGER = LogManager.getLogger(Zoo.class);
	
    private ArrayList<Avaries> avarie = new ArrayList<>();
   private int avarieAmount;
   private final int area;
   private final String address;

    public Zoo(int area, String address, ArrayList<Avaries> avarie){
        this.area = area;
        this.address = address;
        this.setAvarieAmount(avarie.size());
    }
    public Zoo(int area, String address){
        this.area = area;
        this.address = address;
    }

    //Getters
    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public int getAvariesAmount() {
        return getAvariesAmount();
    }

    
    public int getCosts(){
        int result = 0;
        for(Avaries v : avarie){
            result += v.getPrice();
        }
        return result;
    }


    public void addAvaries(Avaries avarie){
        int sumArea = 0;
        for (Avaries avaries : this.avarie) {
            sumArea += avaries.getArea();
        }
        //Checks if There is enough Area to Add new Avarie
        if(sumArea + avarie.getArea() > this.area){
            LOGGER.info("Not Enough Space To Add Avarie");
        }else{
            this.avarie.add(avarie);
        }

        setAvarieAmount(getAvarieAmount() + 1);
    }

    public void removeAvarie(Avaries avarie){
        this.avarie.remove(avarie);

    }


    @Override
    public String toString() {
        String result = "This animalclass.Zoo Contains: \n";
        for(Avaries v : avarie){
            result += "Avarie Of " + v.getAnimalType() +"'s"
                    + "\nAvarie Area: " + v.getArea()
                    +"\n---------\n";
        }
        return result;
    }
	public int getAvarieAmount() {
		return avarieAmount;
	}
	public void setAvarieAmount(int avarieAmount) {
		this.avarieAmount = avarieAmount;
	}
}
