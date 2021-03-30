
public class HourlyPaid extends Person{
	
	private double hoursWorked;
	

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public HourlyPaid(String name, double hoursWorked) {
		super(name);
		this.hoursWorked = hoursWorked;
	}

	public HourlyPaid(String name) {
		super(name);
	}
	
	public HourlyPaid () {
		super();
		hoursWorked = -1;
	}

	@Override
	public String toString() {
		return super.toString() + "\t[hoursWorked=" + hoursWorked + "]";
	}
	
	
	public void printCheck () {
		
		double pay = hoursWorked * 10;
		
		System.out.println("================= HOURLYPAID =================");
		System.out.println(toString());
		System.out.println("_____________");
		System.out.println("Gross Pay: "+pay+"\tNet Pay: "+Math.round(pay*.94));
		
		System.out.println("==============================================");
	}
	
	

	

}
