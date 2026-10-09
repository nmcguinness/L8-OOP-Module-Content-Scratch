package ce01;

public class LicencePlate {
    private String fullLicencePlate;
    private String strYear, strCounty, strNumber;

    public LicencePlate(String fullLicencePlate){
        this.fullLicencePlate = fullLicencePlate; //"262DL11662"

        //split the string into parts
        String[] parts = fullLicencePlate.split("[0-9]{3}[A-Z]{1,2}[0-9]{1,5}");

        if(parts != null && parts.length == 3) {
            this.strNumber = parts[0];
            this.strCounty = parts[1];
            this.strYear = parts[2];
        }
    }
    public String toString(){
        return strYear + "-" + strCounty + "-" + strYear;
    }
}
