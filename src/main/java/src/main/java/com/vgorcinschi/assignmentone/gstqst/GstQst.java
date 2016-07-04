/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.vgorcinschi.assignmentone.gstqst;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static src.main.java.com.vgorcinschi.assignmentone.utils.NumberFormatter.validateDoubleValue;

/**
 *
 * @author vgorcinschi
 */
public class GstQst {

    private static final Logger log = LogManager.getLogger("GstQst");

    public static void run(Scanner sc) {
        log.info("Starting GstQst 'application' with a scanner("
                + sc.getClass().getCanonicalName() + ")");
        System.out.println("Hi. We'll try to calculate your purchase taxes. How"
                + " much did you pay?");
        double originalPrice = validateDoubleValue("price", 2, sc);
        final double QST = 0.1;
        final double GST = 0.05;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        System.out.println("Price: " + nf.format(originalPrice) + "\n"
                + "QST (10%): " + nf.format(originalPrice * QST) + "\n"
                + "GST (5%): " + nf.format(originalPrice * GST) + "\n" + "Total price: "
                + nf.format(originalPrice + (originalPrice * QST + originalPrice * GST)));

    }
}
