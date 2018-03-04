package com.popebp.neatsheets;

import java.util.*;

public class YNABRoot implements YNABFile
{
    Number TED;
    String relativeDefaultBudgetsFolder;
    String formatVersion;
    ArrayList<String> relativeKnownBudgets;

    public YNABRoot() {
    }

    @Override
    public String toString() {
        return "<YNABRoot(" + relativeDefaultBudgetsFolder + ")>";
    }
}

