/**
 * @copyright Copyright (c) 2018 - Charles `sparticvs` Timko
 *
 * @author      Charles `sparticvs` Timko <sparticvs@popebp.com>
 */
package com.popebp.neatsheets;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.*;
import com.popebp.neatsheets.compat.ynab.*;

public class App 
{
    static final String YNAB_SETTINGS_YROOT = ".ynabSettings.yroot";
    static final String YNAB_BUDGET_YMETA = "Budget.ymeta";
    static final String YNAB_DEVICE_DIR = "devices";
    static final String YNAB_BUDGET_YFULL = "Budget.yfull";

    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Path ynabRootDir = null;
        Path ynabSettingsRoot = null;
        Path ynabBudgetRootDir = null;
        Path ynabBudgetMeta = null;
        Path ynabBudgetDataDir = null;
        Path ynabBudgetFull = null;

        YNABRoot ynabRoot = null;
        YNABMeta ynabMeta = null;
        YNABBudget ynabBudget = null;

        // Will target 2 parameters here soon. Want to start by listing the budgets.
        if(args.length != 1) {
            System.err.println("Usage: neat-sheets <root-dir> <budget>");
            return;
        }

        ynabRootDir = Paths.get(args[0]);
        ynabSettingsRoot = Paths.get(ynabRootDir.toString(), YNAB_SETTINGS_YROOT);

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(ynabSettingsRoot.toFile());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return;
        }

        ynabRoot = gson.fromJson(fileReader, YNABRoot.class);

        try {
            fileReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }

        ynabBudgetRootDir = Paths.get(ynabRootDir.toString(), ynabRoot.getBudgetDir(0));
        ynabBudgetMeta = Paths.get(ynabBudgetRootDir.toString(), YNAB_BUDGET_YMETA);

        try {
            fileReader = new FileReader(ynabBudgetMeta.toString());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return;
        }

        ynabMeta = gson.fromJson(fileReader, YNABMeta.class);

        try {
            fileReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }

        ynabBudgetDataDir = Paths.get(ynabBudgetRootDir.toString(), ynabMeta.getDataDir());

        // We will need to loop over all of the files in the the Directory
        ArrayList<YNABDevice> ynabDevices = new ArrayList<YNABDevice>();
        File ynabDevicesDir = new File(ynabBudgetDataDir.toString(), YNAB_DEVICE_DIR);
        for(File ynabDeviceMeta : ynabDevicesDir.listFiles()) {
            YNABDevice ynabDevice = null;
            try {
                fileReader = new FileReader(ynabDeviceMeta);

                ynabDevice = gson.fromJson(fileReader, YNABDevice.class);

                fileReader.close();
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
                return;
            } catch (IOException e) {
                System.err.println(e.getMessage());
                return;
            }
            ynabDevices.add(ynabDevice);
        }

        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.err.println(e.getMessage());
            return;
        }

        YNABDevice thisDevice = null;
        for(YNABDevice ynabDevice : ynabDevices) {
            if(ynabDevice.getHostName().equals(hostName)) {
                thisDevice = ynabDevice;
            }
        }

        if(thisDevice == null) {
            System.err.println("Unable to find a matching device!");
            return;
        }

        if(!thisDevice.hasFullKnowledge()) {
            System.err.println("Cannot load Budget, not complete knowledge!");
        }

        ynabBudgetFull = Paths.get(ynabBudgetDataDir.toString(), thisDevice.getDeviceGUID().toString(), YNAB_BUDGET_YFULL);

        try {
            fileReader = new FileReader(ynabBudgetFull.toString());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return;
        }

        ynabBudget = gson.fromJson(fileReader, YNABBudget.class);

        try {
            fileReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return;
        }

        System.out.println(thisDevice.toString());
        System.out.println(ynabBudget.toString());
    }
}
