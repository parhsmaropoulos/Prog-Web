package mainpackage;

public class Program {
	
	//Identification details
	String Name;
	int ID;
	
	//Program characteristics
	int FreeCallsPerMonth;
	int FreeMessagesPerMonth;
	Boolean CanCallAbroad;
	
	//Charges
	int PricePerMonth;
	int PricePerCall;
	int PricePerMessage;
	
	int TotalChargeThisMonth;
	
	
	public Program(String name, int ID, int FCPM, int FMPM,Boolean CCA, int PPMo, int PPMe, int PPC ) {
		this.Name = name;
		this.ID = ID;
		this.FreeCallsPerMonth = FCPM;
		this.FreeMessagesPerMonth = FMPM;
		this.CanCallAbroad = CCA;
		this.PricePerMonth = PPMo;
		this.PricePerMessage = PPMe;
		this.PricePerCall = PPC;
	}
	
	public  void addCharge(int charge, int total) {
		total = this.getTotalChargeThisMonth();
		
		total = total + charge;
		
		this.setTotalChargeThisMonth(total);
	}
	
	public void resetCharge() {
		this.setTotalChargeThisMonth(0);
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getFreeCallsPerMonth() {
		return FreeCallsPerMonth;
	}

	public void setFreeCallsPerMonth(int freeCallsPerMonth) {
		FreeCallsPerMonth = freeCallsPerMonth;
	}

	public int getFreeMessagesPerMonth() {
		return FreeMessagesPerMonth;
	}

	public void setFreeMessagesPerMonth(int freeMessagesPerMonth) {
		FreeMessagesPerMonth = freeMessagesPerMonth;
	}

	public Boolean getCanCallAbroad() {
		return CanCallAbroad;
	}

	public void setCanCallAbroad(Boolean canCallAbroad) {
		CanCallAbroad = canCallAbroad;
	}

	public int getPricePerMonth() {
		return PricePerMonth;
	}

	public void setPricePerMonth(int pricePerMonth) {
		PricePerMonth = pricePerMonth;
	}

	public int getPricePerCall() {
		return PricePerCall;
	}

	public void setPricePerCall(int pricePerCall) {
		PricePerCall = pricePerCall;
	}

	public int getPricePerMessage() {
		return PricePerMessage;
	}

	public void setPricePerMessage(int pricePerMessage) {
		PricePerMessage = pricePerMessage;
	}

	public int getTotalChargeThisMonth() {
		return TotalChargeThisMonth;
	}

	public void setTotalChargeThisMonth(int totalChargeThisMonth) {
		TotalChargeThisMonth = totalChargeThisMonth;
	}
	
	
	
}
