package ce01;

public class LicencePlate {

    /*
     * Examples:
     * 191 L 12345
     * 11 L 12345
     * 131 L 12345
     * 132 L 12345
     */

    //region Fields
    private String year;
    private String county;
    private String number;
    //endregion

    //region Getters & Setters
    public String getYear() {
        return year;
    }

    public String getCounty() {
        return county;
    }

    public String getNumber() {
        return number;
    }
    //endregion

    //region Constructor
    public LicencePlate(String rawLicensePlate) {
        // TODO: Handle null input and malformed registration strings.
        String[] parts = rawLicensePlate.trim().split("\\s+");

        if (parts.length == 3) {
            this.year = parts[0];
            this.county = parts[1];
            this.number = parts[2];
        }
    }
    //endregion

    //region Overrides
    @Override
    public String toString() {
        return "LicensePlate{" +
                "year='" + year + '\'' +
                ", county='" + county + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
    //endregion
}