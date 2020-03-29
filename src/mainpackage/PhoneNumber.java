package mainpackage;

public class PhoneNumber {
    int phoneNumber;
    int ProgramID;

    public PhoneNumber() {
        this.phoneNumber = generatePhoneNumber();
    }
    
    public int generatePhoneNumber() {
    	this.phoneNumber = 98345;
    	return phoneNumber;
    }

    
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getProgramID() {
        return ProgramID;
    }

    public void setProgramID(int programID) {
        ProgramID = programID;
    }
}
