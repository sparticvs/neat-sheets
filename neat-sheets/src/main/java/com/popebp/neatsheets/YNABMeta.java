/**
 * @author Charles `sparticvs` Timko <sparticvs@popbep.com>
 */
package com.popebp.neatsheets;

public class YNABMeta implements YNABFile {
    String formatVersion;
    String relativeDataFolderName;
    Number TED;

    public YNABMeta() {
    }

    @Override
    public String toString() {
        return "<YNABMeta(" + relativeDataFolderName + ")>";
    }
}
