/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.vgorcinschi.assignmentone.initials;

import java.util.Scanner;
import static org.apache.commons.lang3.StringUtils.isAlpha;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static src.main.java.com.vgorcinschi.assignmentone.utils.StringValidator.stringValidator;

/**
 *
 * @author vgorcinschi
 */
public class InitialsPrinter {

    private static final Logger log = LogManager.getLogger("InitialsPrinter");

    public static void run(Scanner sc) {
        log.info("Starting InitialsPrinter 'application' with a scanner("
                + sc.getClass().getCanonicalName() + ")");
        System.out.print("Hello. ");
        String firstName = stringValidator((s) -> {
            return s.length() >= 1;
        },
                () -> "The input must be at least one letter long.",
                "first name", sc);
        System.out.println("Very well. Now your last name.");
        String lastName = stringValidator((s) -> {
            return (s.length() >= 2 && isAlpha(s));
        }, () -> "The input must be at least two letters long. Only letters are allowed.",
                "surname", sc);
        System.out.println("Your initials are: " + firstName.toUpperCase().charAt(0) + "."
                + lastName.toUpperCase().charAt(0) + ".");
    }
}
