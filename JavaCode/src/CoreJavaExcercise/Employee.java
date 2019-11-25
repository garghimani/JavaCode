package CoreJavaExcercise;

public class Employee {
	
	private int empNo;
	private String empName; 
	private String address; 
	private String state;
	private int zipCode;
	private String phone; 
	private String designation;
	private int experienceinYears;
	private String emailAddress;
	private double basicSal; 
	private double hra; 
	private double bonus;
	
	//Constructor 
	public Employee(int empNo, String empName, String address, String state, int zipCode, String phone, String designation,
			int experienceinYears, String emailAddress, double basicSal, double hra) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone;
		
		if(designation == "M") {
			this.designation = "MANAGER";
		}
		else if(designation == "L"){
			this.designation = "LEAD";
		}
		else if(designation == "A"){
			this.designation = "ANALYST";
		}
		else
			this.designation = " ";
		
		this.experienceinYears = experienceinYears;
		this.emailAddress = emailAddress;
		this.basicSal = basicSal;
		this.hra = hra;
		this.bonus = (0.001*basicSal)/100;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExperienceinYears() {
		return experienceinYears;
	}

	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double totalSalary(double basic, double hra, double bonus) {
		
		double totalSal = (basic+hra+((bonus/100)*basic));
		
		return totalSal;
		
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee(12345, "JOHN SMITH", "123 BROOKLYN ST", "CALIFORNIA", 95134, "454-230-8212", "M", 10,
				                    "JOHN.SMITH@GMAIL.COM",300000, 1230);
		
		System.out.println("Emp No.        : "+emp.getEmpNo());
		System.out.println("Emp Name       : "+emp.getEmpName());
		System.out.println("Address        : "+emp.getAddress());
		System.out.println("State          : "+emp.getState());
		System.out.println("Zip Code       : "+emp.getZipCode());
		System.out.println("Phone No.      : "+emp.getPhone());
		System.out.println("Designation    : "+emp.getDesignation());
		System.out.println("Experience     : "+emp.getExperienceinYears());
		System.out.println("Email Address  : "+emp.getEmailAddress());
		System.out.println("Basic          : "+emp.getBasicSal());
		System.out.println("HRA            : "+emp.getHra());
		System.out.println("Bonus          : "+emp.getBonus());
		System.out.println("Total Salary   : "+emp.totalSalary(emp.getBasicSal(), emp.getHra(), emp.getBonus()));
		
		

	
		

	}

}
