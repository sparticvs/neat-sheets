/**
 * @author Charles `sparticvs` Timko <sparticvs@popebp.com>
 */
package com.popebp.neatsheets.compat.ynab;

import java.util.*;

public class YNABRoot implements YNABFile
{
    Number TED;
    String relativeDefaultBudgetsFolder;
    String formatVersion;
    ArrayList<String> relativeKnownBudgets;

    public YNABRoot() {
    }

    public String getBudgetDir(int index) {
        return this.relativeKnownBudgets.get(index);
    }

    @Override
    public String toString() {
        return String.format("<YNABRoot(%s)>", relativeDefaultBudgetsFolder);
    }
}

