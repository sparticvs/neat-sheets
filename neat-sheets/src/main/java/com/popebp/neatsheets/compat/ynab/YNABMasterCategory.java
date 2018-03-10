package com.popebp.neatsheets.compat.ynab;

import java.util.ArrayList;

/**
 * Created by charles on 3/10/18.
 */
public class YNABMasterCategory extends YNABEntity {
    boolean deleteable;
    String name;
    boolean isTombstone;
    String type;
    Number sortableIndex;
    boolean expanded;
    ArrayList<YNABCategory> subCategories;

    public YNABMasterCategory() {
        this.entityType = YNABEntityType.masterCategory;
    }

    @Override
    public String toString() {
        return String.format("<YNABMasterCategory(%s)>", name);
    }
}
