/**
 * @author Charles `sparticvs` Timko <sparticvs@popebp.com>
 */
package com.popebp.neatsheets.compat.ynab;

import java.util.*;

public class YNABDevice implements YNABFile {

    UUID deviceGUID;
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

    public String getHostName() {
        return this.friendlyName;
    }

    public boolean hasFullKnowledge() {
        return this.hasFullKnowledge;
    }

    public UUID getDeviceGUID() {
        return this.deviceGUID;
    }

    @Override
    public String toString() {
        return String.format("<YNABDevice(%s : %s)>", this.friendlyName, this.deviceType);
    }
}
