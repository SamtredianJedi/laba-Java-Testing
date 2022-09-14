package enums;


	enum CoffeeSize {

	    BIG(8), LARGE(10),HUGE(12),OVERWHELMING();
	    private int ounces ;

	    static {
	        System.out.println("static block ");
	    }
	    {
	        System.out.println("instance block");
	    }

	    private CoffeeSize(int ounces){
	        this.ounces = ounces;
	        System.out.println(ounces);
	    }
	    private CoffeeSize(){
	        this.ounces = 20;
	        System.out.println(ounces);
	    }

	    public int getOunces() {
	        return ounces;
	    }
	} 


