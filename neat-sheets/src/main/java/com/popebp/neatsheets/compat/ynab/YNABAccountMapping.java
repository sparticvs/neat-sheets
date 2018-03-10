package com.popebp.neatsheets.compat.ynab;

import java.util.Base64;

/**
 * Created by charles on 3/10/18.
 */
public class YNABAccountMapping extends YNABEntity {

    String fid;
    String shortenedAccountId;
    String hash;
    String salt;
    String targetYNABAccountId;
    boolean skipImport;
    // dateSequence?
    boolean shouldFlipPayeesMemo;
    boolean shouldImportMemos;

    public YNABAccountMapping() {
        this.entityType = YNABEntityType.accountMapping;
    }

    @Override
    public String toString() {
        return String.format("<YNABAccountMapping(%s)>", targetYNABAccountId);
    }
}
