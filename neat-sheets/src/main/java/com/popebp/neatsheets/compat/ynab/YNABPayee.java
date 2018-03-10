package com.popebp.neatsheets.compat.ynab;

import java.util.ArrayList;

/**
 * Created by charles on 3/10/18.
 */
public class YNABPayee extends YNABEntity {
    String name;
    boolean enabled;
    // renameConditions
    String autoFillCategoryId;
    ArrayList<YNABLocation> locations;
    String autoFillMemo;
    Number autoFillAmount;

    public YNABPayee() {
        this.entityType = YNABEntityType.payee;
    }

    @Override
    public String toString() {
        return String.format("<YNABPayee(%s)>", name);
    }
}
