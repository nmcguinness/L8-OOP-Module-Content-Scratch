package ce01;

public class LicencePlate {
    private String fullLicencePlate;
    private String strYear, strCounty, strNumber;

    public String getStrYear() {
        return strYear;
    }

    public String getStrCounty() {
        return strCounty;
    }

    public String getStrNumber() {
        return strNumber;
    }

    public LicencePlate(String fullLicencePlate){
        this.fullLicencePlate = fullLicencePlate; //"262DL11662"

        //split the string into parts
        String[] parts = fullLicencePlate.split("\\s");

        if(parts != null && parts.length == 3) {
            this.strYear = parts[0];
            this.strCounty = parts[1];
            this.strNumber = parts[2];
        }
    }
    public String toString(){
        return strYear + "-" + strCounty + "-" + strNumber;
    }
}
