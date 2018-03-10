package com.popebp.neatsheets.compat.ynab;

/**
 * Created by charles on 3/10/18.
 */
public class YNABSubTransaction extends YNABEntity {
    String categoryId;
    String parentTransactionId;
    Number amount;

    public YNABSubTransaction() {
        this.entityType = YNABEntityType.subTransaction;
    }

    @Override
    public String toString() {
        return String.format("<YNABSubTransaction(%f)>", amount.floatValue());
    }
}
