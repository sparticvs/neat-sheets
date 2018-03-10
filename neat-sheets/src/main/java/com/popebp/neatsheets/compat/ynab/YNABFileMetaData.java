package com.popebp.neatsheets.compat.ynab;

/**
 * Created by charles on 3/10/18.
 */
public class YNABFileMetaData extends YNABEntity {
    String currentKnowledge;
    String budgetDataVersion;

    public YNABFileMetaData() {
        this.entityType = YNABEntityType.fileMetaData;
    }
}
