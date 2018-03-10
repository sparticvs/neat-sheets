package com.popebp.neatsheets.compat.ynab;

import java.util.Date;

/**
 * Created by charles on 3/10/18.
 */
public class YNABScheduledTransaction extends YNABEntity {

    boolean isTombstone;
    Number amount;
    Number twiceAMonthStartDay;
    YNABTransactionStatus cleared;
    Date date;
    YNABFrequency frequency;
    String categoryId;
    String payeeId;
    boolean accepted;
    String accountId;
    // subTransactions appeared, not sure what that is...

    public YNABScheduledTransaction() {
        this.entityType = YNABEntityType.scheduledTransaction;
    }
}
