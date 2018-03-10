package com.popebp.neatsheets.compat.ynab;

import java.util.Date;

/**
 * Created by charles on 3/10/18.
 */
public class YNABAccount extends YNABEntity {
    Number lastReconciledBalance;
    String accountName;
    YNABAccountType accountType;
    Number lastEnteredCheckNumber;
    boolean onBudget;
    boolean hidden;
    Number sortableIndex;
    Date lastReconciledDate;

    public YNABAccount() {
        this.entityType = YNABEntityType.account;
    }

    @Override
    public String toString() {
        return String.format("<YNABAccount(%s: %d)>", accountName, lastReconciledBalance.floatValue());
    }
}
