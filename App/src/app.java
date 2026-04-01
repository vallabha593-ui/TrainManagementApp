import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class app {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        System.out.println("Train ID Validation:");
        if (trainMatcher.matches()) {
            System.out.println(trainId + " is VALID");
        } else {
            System.out.println(trainId + " is INVALID");
        }

        System.out.println("\nCargo Code Validation:");
        if (cargoMatcher.matches()) {
            System.out.println(cargoCode + " is VALID");
        } else {
            System.out.println(cargoCode + " is INVALID");
        }
    }
}