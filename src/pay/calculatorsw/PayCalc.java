package pay.calculatorsw;

public class PayCalc {

    private double hourlyRate, hours, oTHours, dTHours, shiftDiff;

    public PayCalc(double hourlyRate, double hours, double oTHours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.oTHours = oTHours;
    }

    public PayCalc() {
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public double getoTHours() {
        return oTHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setoTHours(double oTHours) {
        this.oTHours = oTHours;
    }

    public double getdTHours() {
        return dTHours;
    }

    public void setdTHours(double dTHours) {
        this.dTHours = dTHours;
    }

    public double getShiftDiff() {
        return shiftDiff;
    }

    public void setShiftDiff(double shiftDiff) {
        this.shiftDiff = shiftDiff;
    }

    public double getPay() {
        return (hourlyRate)*(hours+(oTHours*1.5)+(dTHours *2))+(shiftDiff*(hours+oTHours+dTHours));
       
    }

}
