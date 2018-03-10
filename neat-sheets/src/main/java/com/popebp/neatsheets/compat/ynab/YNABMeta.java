/**
 * @author Charles `sparticvs` Timko <sparticvs@popebp.com>
 */
package com.popebp.neatsheets.compat.ynab;

public class YNABMeta implements YNABFile {
    String formatVersion;
    String relativeDataFolderName;
    Number TED;

    public YNABMeta() {
    }

    public String getDataDir() {
        return this.relativeDataFolderName;
    }

    @Override
    public String toString() {
        return String.format("<YNABMeta(%s)>", relativeDataFolderName);
    }
}
