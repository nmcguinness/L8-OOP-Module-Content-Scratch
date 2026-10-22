package ce01;

public class LicencePlateValidator {

    //region Validation Methods

    /**
     * Checks whether the sum of the digits in the year
     * equals the target sum.
     */
    public boolean validateYear(String year, int targetSum) {
        if (year == null || year.isEmpty()) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < year.length(); i++) {
            char digit = year.charAt(i);

            if (!Character.isDigit(digit)) {  //'0' = 48 (ASCII)
                return false;
            }

            sum += Character.getNumericValue(digit);
        }

        return sum == targetSum;
    }

    /**
     * Checks whether the county matches the supplied regex.
     */
    public boolean validateCounty(String county, String countyRegex) {
        return county != null
                && countyRegex != null
                && county.matches(countyRegex);
    }

    /**
     * Checks whether the registration number matches the supplied regex.
     */
    public boolean validateNumber(String number, String numberRegex) {
        return number != null
                && numberRegex != null
                && number.matches(numberRegex);
    }

    //endregion

    //region Combined Validation

    /**
     * Validates all three components of a license plate.
     */
    public boolean validate(
            LicencePlate licencePlate,
            String numberRegex,
            String countyRegex,
            int yearTargetSum) {

        if (licencePlate == null) {
            return false;
        }

        boolean isYearValid = validateYear(
                licencePlate.getYear(), yearTargetSum);

        boolean isCountyValid = validateCounty(
                licencePlate.getCounty(), countyRegex);

        boolean isNumberValid = validateNumber(
                licencePlate.getNumber(), numberRegex);

        return isYearValid && isCountyValid && isNumberValid;
    }

    //endregion
}