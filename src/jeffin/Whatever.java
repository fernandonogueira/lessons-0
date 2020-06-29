package jeffin;

import jeffin.exceptions.FPSLimitInvalidException;
import jeffin.exceptions.InvalidGraphicQualityOptionException;

public class Whatever {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.setFpsLimit(144);
        configuration.setGraphicQuality(null);

        validate(configuration);

    }

    public static void validate(Configuration configuration) {
        if (configuration.getGraphicQuality() == null) {
            throw new InvalidGraphicQualityOptionException();
        }
        validateFpsLimit(configuration.getFpsLimit());
    }

    public static void validateFpsLimit(int fpsLimit) {
        if (fpsLimit < 0 || fpsLimit > 300) {
            throw new FPSLimitInvalidException();
        }
    }

}
