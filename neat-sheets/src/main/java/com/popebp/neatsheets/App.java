/**
 * @copyright Copyright (c) 2018 - Charles `sparticvs` Timko
 *
 * @author      Charles `sparticvs` Timko <sparticvs@popebp.com>
 */
package com.popebp.neatsheets;

import java.io.*;
import java.util.*;
import com.google.gson.*;

public class App 
{
    public static void main( String[] args )
    {
        if(args.length != 1) {
            System.out.println( "Usage rquires a single argument" );
            return;
        }

        System.out.println("Argument is: " + args[0]);

        FileReader ynabReader = null;
        try {
            ynabReader = new FileReader(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Not a file: " + e.getMessage());
            return;
        }

        YNABFile file;
        Gson gson = new Gson();

        if(args[0].endsWith(".yroot")) {
            file = gson.fromJson(ynabReader, YNABRoot.class);
        } else if(args[0].endsWith(".ydevice")) {
            file = gson.fromJson(ynabReader, YNABDevice.class);
        } else if(args[0].endsWith(".ymeta")) {
            file = gson.fromJson(ynabReader, YNABMeta.class);
        } else {
            System.out.println("Unsupported File");
            return;
        }

        System.out.println(file.toString());
    }
}
