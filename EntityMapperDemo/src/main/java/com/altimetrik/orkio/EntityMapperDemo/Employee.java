package com.altimetrik.orkio.EntityMapperDemo;

import java.util.Date;

public class Employee {

	private int eId;
	private String fname;
	private String lname;
	private String address;
	private String accountNumber;
	private String officeAddress;
	private String permanentAddress;
	private String temporaryAdres;
	private int contact;
	private String fatherName;
	private String motherName;
	private int siblings;
	private String teamName;
	private String ProjectName;
	private String POName;
	private int teamSize;
	private String ScrumName;
	private String ODCName;
	private String PlaygroundEvent;
	private String shrijanTeamName;
	private String country;
	private String village;
	private int zipcode;
	private String tehsil;
	private String continent;
	private String area;
	private String zone;
	private String helpdeskNumber;
	// ------------------------------//
	private String department;
	private String ManagerName;
	private String ScrumMasterName;
	private String laptopAssigned;
	private String batteryName;
	private String bag;
	private String middleName;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String salary;
	private String tShirtSize;
	private String alternateNumber;
	private String extensionNumber;
	private String vehicleName;
	private String vehicleNumber;
	private String parkingBlock;
	private String vehicleModel;
	private Date dob;
	private Date doj;
	private String field49;
	private String field50;
	// -------------------

	public String getField49() {
		return field49;
	}

	public Employee(int eId, String fname, String lname, String address, String accountNumber, String officeAddress,
			String permanentAddress, String temporaryAdres, int contact, String fatherName, String motherName,
			int siblings, String teamName, String projectName, String pOName, int teamSize, String scrumName,
			String oDCName, String playgroundEvent, String shrijanTeamName, String country, String village, int zipcode,
			String tehsil, String continent, String area, String zone, String helpdeskNumber,
			String department,
			String managerName, String scrumMasterName, String laptopAssigned, String batteryName, String bag,
			String middleName, String addressLine1, String addressLine2, String addressLine3, String salary,
			String tShirtSize, String alternateNumber, String extensionNumber, String vehicleName, String vehicleNumber,
			String parkingBlock, String vehicleModel, Date dob, Date doj, String field49, String field50) {
		
		/*
		 * Employee employee = new Employee(6812, "neha", "mehta", "chandigarh",
		 * "122225555","yerwada", "PB", "pune",777, "pawan", "renu", 1, "CITI-",
		 * "russia IP", "chandan", 5,"AGILE",
		 * "ODC-citi","srijan","srijan manmeet","india","lalru",14090,
		 * "dera bassi","asia","nn","VM","01919191", "dept","manger","master",
		 * "THINKPAD","THINKPAD BATTERY BANK","WILDCRAFT",
		 * "NO","add1","add2","add3","12L",
		 * "XS","00000","000001","CIAZ","8888","D block","2020",new Date(),new
		 * Date(),"F49","F50");
		 */
		
		/*
		 * Employee employee = new Employee(6812, "neha", "mehta", "chandigarh",
		 * "122225555", "yerwada", "PB", "pune", 99999999, "pawan", "renu", 1,
		 * "russia IP", "CITI-", "DEVELOPMENT", "AWKASH", "chandan", "CHNADAN", 5,
		 * "AGILE", "citi", "shrijan", "shrijan-MANPREET", "INDIA", "lalru", 140501,
		 * "DERA BASSI", "ASIA", "vm", "OOOP", "122222", "CITIBANK","AWkash","CHAndan",
		 * "THINKPAD","THINKPAD BATTERY BANK","WILDCRAFT",
		 * "NO","add1","add2","add3","12L",
		 * "XS","00000","000001","CIAZ","8888","D block","2020",new Date(),new
		 * Date(),"F49","F50");
		 */

		//super();
		this.eId = eId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.accountNumber = accountNumber;
		this.officeAddress = officeAddress;
		this.permanentAddress = permanentAddress;
		this.temporaryAdres = temporaryAdres;
		this.contact = contact;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.siblings = siblings;
		this.teamName = teamName;
		ProjectName = projectName;
		POName = pOName;
		this.teamSize = teamSize;
		ScrumName = scrumName;
		ODCName = oDCName;
		PlaygroundEvent = playgroundEvent;
		this.shrijanTeamName = shrijanTeamName;
		this.country = country;
		this.village = village;
		this.zipcode = zipcode;
		this.tehsil = tehsil;
		this.continent = continent;
		this.area = area;
		this.zone = zone;
		this.helpdeskNumber = helpdeskNumber;
		this.department = department;
		ManagerName = managerName;
		ScrumMasterName = scrumMasterName;
		this.laptopAssigned = laptopAssigned;
		this.batteryName = batteryName;
		this.bag = bag;
		this.middleName = middleName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.salary = salary;
		this.tShirtSize = tShirtSize;
		this.alternateNumber = alternateNumber;
		this.extensionNumber = extensionNumber;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.parkingBlock = parkingBlock;
		this.vehicleModel = vehicleModel;
		this.dob = dob;
		this.doj = doj;
		this.field49 = field49;
		this.field50 = field50;
	}

	public void setField49(String field49) {
		this.field49 = field49;
	}

	public String getField50() {
		return field50;
	}

	public void setField50(String field50) {
		this.field50 = field50;
	}

	/*
	 * public Employee(int eId, String fname, String lname, String address, String
	 * accountNumber, String officeAddress, String permanentAddress, String
	 * temporaryAdres, int contact, String fatherName, String motherName, int
	 * siblings, String teamName, String projectName, String department, String
	 * managerName, String scrumMasterName, String pOName, int teamSize, String
	 * scrumName, String oDCName, String playgroundEvent, String shrijanTeamName,
	 * String country, String village, int zipcode, String tehsil, String continent,
	 * String area, String zone, String helpdeskNumber) {
	 * 
	 * 
	 * Employee employee=new Employee(6812, "neha", "mehta", "chandigarh",
	 * "122225555","yerwada", "PB","pune",99999999,"pawan","renu",
	 * 1,"russia IP","CITI-","DEVELOPMENT","AWKASH",
	 * "chandan","CHNADAN",5,"AGILE","citi","shrijan",
	 * "shrijan-MANPREET","INDIA","lalru",140501,"DERA BASSI",
	 * "ASIA","vm","OOOP","122222");
	 * 
	 * 
	 * 
	 * super(); this.eId = eId; this.fname = fname; this.lname = lname; this.address
	 * = address; this.accountNumber = accountNumber; this.officeAddress =
	 * officeAddress; this.permanentAddress = permanentAddress; this.temporaryAdres
	 * = temporaryAdres; this.contact = contact; this.fatherName = fatherName;
	 * this.motherName = motherName; this.siblings = siblings; this.teamName =
	 * teamName; ProjectName = projectName; this.department = department;
	 * ManagerName = managerName; ScrumMasterName = scrumMasterName; POName =
	 * pOName; this.teamSize = teamSize; ScrumName = scrumName; ODCName = oDCName;
	 * PlaygroundEvent = playgroundEvent; this.shrijanTeamName = shrijanTeamName;
	 * this.country = country; this.village = village; this.zipcode = zipcode;
	 * this.tehsil = tehsil; this.continent = continent; this.area = area; this.zone
	 * = zone; this.helpdeskNumber = helpdeskNumber; }
	 */

	public String getLaptopAssigned() {
		return laptopAssigned;
	}

	public void setLaptopAssigned(String laptopAssigned) {
		this.laptopAssigned = laptopAssigned;
	}

	public String getBatteryName() {
		return batteryName;
	}

	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}

	public String getBag() {
		return bag;
	}

	public void setBag(String bag) {
		this.bag = bag;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String gettShirtSize() {
		return tShirtSize;
	}

	public void settShirtSize(String tShirtSize) {
		this.tShirtSize = tShirtSize;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getExtensionNumber() {
		return extensionNumber;
	}

	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getParkingBlock() {
		return parkingBlock;
	}

	public void setParkingBlock(String parkingBlock) {
		this.parkingBlock = parkingBlock;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getTemporaryAdres() {
		return temporaryAdres;
	}

	public void setTemporaryAdres(String temporaryAdres) {
		this.temporaryAdres = temporaryAdres;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getSiblings() {
		return siblings;
	}

	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}

	public String getScrumMasterName() {
		return ScrumMasterName;
	}

	public void setScrumMasterName(String scrumMasterName) {
		ScrumMasterName = scrumMasterName;
	}

	public String getPOName() {
		return POName;
	}

	public void setPOName(String pOName) {
		POName = pOName;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getScrumName() {
		return ScrumName;
	}

	public void setScrumName(String scrumName) {
		ScrumName = scrumName;
	}

	public String getODCName() {
		return ODCName;
	}

	public void setODCName(String oDCName) {
		ODCName = oDCName;
	}

	public String getPlaygroundEvent() {
		return PlaygroundEvent;
	}

	public void setPlaygroundEvent(String playgroundEvent) {
		PlaygroundEvent = playgroundEvent;
	}

	public String getShrijanTeamName() {
		return shrijanTeamName;
	}

	public void setShrijanTeamName(String shrijanTeamName) {
		this.shrijanTeamName = shrijanTeamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getTehsil() {
		return tehsil;
	}

	public void setTehsil(String tehsil) {
		this.tehsil = tehsil;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getHelpdeskNumber() {
		return helpdeskNumber;
	}

	public void setHelpdeskNumber(String helpdeskNumber) {
		this.helpdeskNumber = helpdeskNumber;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", accountNumber=" + accountNumber + ", officeAddress=" + officeAddress + ", permanentAddress="
				+ permanentAddress + ", temporaryAdres=" + temporaryAdres + ", contact=" + contact + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", siblings=" + siblings + ", teamName=" + teamName
				+ ", ProjectName=" + ProjectName + ", POName=" + POName + ", teamSize=" + teamSize + ", ScrumName="
				+ ScrumName + ", ODCName=" + ODCName + ", PlaygroundEvent=" + PlaygroundEvent + ", shrijanTeamName="
				+ shrijanTeamName + ", country=" + country + ", village=" + village + ", zipcode=" + zipcode
				+ ", tehsil=" + tehsil + ", continent=" + continent + ", area=" + area + ", zone=" + zone
				+ ", helpdeskNumber=" + helpdeskNumber + ", department=" + department + ", ManagerName=" + ManagerName
				+ ", ScrumMasterName=" + ScrumMasterName + "]";
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/*
	 * public Employee(int eId, String fname, String lname, String address, String
	 * accountNumber) { super(); this.eId = eId; this.fname = fname; this.lname =
	 * lname; this.address = address; this.accountNumber = accountNumber; }
	 */
}
