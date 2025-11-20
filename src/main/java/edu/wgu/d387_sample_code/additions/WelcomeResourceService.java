package edu.wgu.d387_sample_code.additions;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeResourceService {

    public static String getWelcomeMessage(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Labels", locale);
        return resourceBundle.getString("welcome_message");
    }

}
