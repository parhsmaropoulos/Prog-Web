package mainpackage;

public class PhoneNumber {
    int phoneNumber;
    int ProgramID;

    public PhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void MakeCall() {
        //TODO create call object and start a call
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
