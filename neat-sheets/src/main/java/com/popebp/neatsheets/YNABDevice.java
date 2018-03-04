package com.popebp.neatsheets;

import java.util.*;

public class YNABDevice implements YNABFile {

    String deviceGUID;
    String YNABVersion;
    String shortDeviceId;
    String formatVersion;
    String deviceType;
    String highestDataVersionImported;
    String friendlyName;
    String knowledgeInFullBudgetFile;
    boolean hasFullKnowledge;
    String lastDataVersionFullyKnown;
    String knowledge;

    public YNABDevice() {
    }

    @Override
    public String toString() {
        return "<YNABDevice(" + this.friendlyName + ", " + this.deviceType + ")>";
    }
}
