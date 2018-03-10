package com.popebp.neatsheets.compat.ynab;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by charles on 3/10/18.
 */
public class YNABTransaction extends YNABEntity {
    boolean isTombstone;
    YNABTransactionStatus cleared;
    Number amount;
    ArrayList<YNABSubTransaction> subTransactions;
    Date date;
    String categoryId;
    String payeeId;
    boolean accepted;
    String accountId;
    String source;
    String targetAccountId;
    String transferTransactionId;
    String importedPayee;
    String YNABID;
    String FITID;

    public YNABTransaction() {
        this.entityType = YNABEntityType.transaction;
    }

    @Override
    public String toString() {
        return String.format("<YNABTransaction(%s => %s : %f)>", accountId, payeeId, amount.floatValue());
    }
}
