package com.popebp.neatsheets.compat.ynab;

/**
 * Created by charles on 3/10/18.
 */
public class YNABCategory extends YNABEntity {

    String name;
    String note;
    Number cachedBalance;
    boolean isTombstone;
    String masterCategoryId;
    String type;
    Number sortableIndex;

    public YNABCategory() {
        this.entityType = YNABEntityType.category;
    }

    @Override
    public String toString() {
        return String.format("<YNABCategory(%s : %f)>", this.name, this.cachedBalance.floatValue());
    }
}
