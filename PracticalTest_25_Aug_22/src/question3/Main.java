package question3;



public class Main {

	
	static void countObjects(Degree... degree){
		int pgcount = 0;
		int ugcount = 0;
		int degreecount = 0;
		for(Degree obj: degree) {
			if(obj instanceof Postgraduate) {
				pgcount++;
			}
			else if(obj instanceof Undergraduate) {
				ugcount++;
			}
			else {
				degreecount++;
			}
		}
		System.out.println(pgcount);
		System.out.println(ugcount);
		System.out.println(degreecount);
		
	}

     public static void main(String args[]) {
    	 
    	 Degree degree1 = new Degree();
    	 Degree degree2 = new Degree();
    	 Degree degree3 = new Degree();
    	 Degree degree4 = new Degree();
    	 Postgraduate pg1 = new Postgraduate();
    	 Postgraduate pg2 = new Postgraduate();
    	 Postgraduate pg3 = new Postgraduate();
    	 Undergraduate ug1 = new Undergraduate();
    	 Undergraduate ug2 = new Undergraduate();
    	 
		countObjects(degree1,degree2,degree3,degree4,pg1,pg2,pg3,ug1,ug2);
		
	 

	
}
}
