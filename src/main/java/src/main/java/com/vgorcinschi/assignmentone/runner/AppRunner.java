/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.vgorcinschi.assignmentone.runner;

import java.util.Scanner;
import src.main.java.com.vgorcinschi.assignmentone.gstqst.GstQst;
import src.main.java.com.vgorcinschi.assignmentone.initials.InitialsPrinter;

/**
 *
 * @author vgorcinschi
 */
public class AppRunner {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            GstQst.run(sc);
            InitialsPrinter.run(sc);
        }
    }
}
