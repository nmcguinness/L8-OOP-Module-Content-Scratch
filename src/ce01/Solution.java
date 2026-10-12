package ce01;
import java.util.ArrayList;

public class Solution {

    public static void run() {

        // Helper to tell you what directory to put your data file in.
        System.out.println(
                "Put your data file in: "
                        + System.getProperty("user.dir"));

        long startTimeNS = System.nanoTime();

        // Read all file contents.
        char dataDelimiter = ',';
        String filePath = "data/ce01/ce01_data.txt";

        ArrayList<String> rawLicensePlateList =
                FileUtils.readDelimitedFile(
                        filePath, dataDelimiter);

        // Exit if the file could not be read or contains no data.
        if (rawLicensePlateList == null
                || rawLicensePlateList.isEmpty()) {
            return;
        }

        // Conditions for success.
        String numberRegex = ".*6.*6.*";
        String countyRegex = ".*L.*";
        int yearTargetSum = 10;

        // Create the validator.
        LicencePlateValidator validator =
                new LicencePlateValidator();

        // Parse contents into LicensePlate objects and validate them.
        for (String rawLicensePlate : rawLicensePlateList) {

            LicencePlate licensePlate =
                    new LicencePlate(rawLicensePlate);

            boolean isValid = validator.validate(
                    licensePlate,
                    numberRegex,
                    countyRegex,
                    yearTargetSum);

            // We found a match!
            if (isValid) {
                System.out.println("Found: " + licensePlate);
            }
        }

        long finishTimeNS = System.nanoTime();

        System.out.println(
                "Execution time (ms): "
                        + (finishTimeNS - startTimeNS) / 1E6);
    }
}