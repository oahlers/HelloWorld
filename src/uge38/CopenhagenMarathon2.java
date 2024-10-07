package uge38;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.*;

public class CopenhagenMarathon2 {
    public static void main(String[] args) throws IOException{
        FileReader src = new FileReader("src//uge38//Copenhagen Marathon.txt");
        BufferedReader runnerfile = new BufferedReader(src);

        String runnerdata = runnerfile.readLine();

        while (runnerdata != null){
            String[] runnerdatasplit = runnerdata.split(",");
            String runnm = runnerdatasplit[0];
            int runnr = Integer.parseInt(runnerdatasplit[1]);
            String rungrp = runnerdatasplit[2];

            //Uses a method to print the information
            participantinfo(runnm, runnr, rungrp);

            runnerdata = runnerfile.readLine();
        }
    }

    static void participantinfo(String name, int participationnumber, String startinggroup) throws IOException{
        FileWriter wrt = new FileWriter("Participant"+participationnumber+".txt");
        PrintWriter printer = new PrintWriter(wrt);
        printer.println("Dear " + name);
        printer.println("We are happy to recieve your registration to the Copenhagen marathon!");
        printer.println("Your starting number is: " + participationnumber);
        printer.println("You start in group: " + startinggroup);

        printer.println("please check in ten minutes before the race is scheduled to start");
        printer.close();
    }
}