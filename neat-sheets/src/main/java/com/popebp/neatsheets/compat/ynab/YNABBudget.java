/**
 * @author Charles `sparticvs` Timko - sparticvs@popebp.com
 */
package com.popebp.neatsheets.compat.ynab;

import java.util.ArrayList;

public class YNABBudget implements YNABFile {

    ArrayList<YNABAccountMapping> accountMappings;
    ArrayList<YNABScheduledTransaction> scheduledTransactions;
    YNABFileMetaData fileMetaData;
    ArrayList<YNABMasterCategory> masterCategories;
    ArrayList<YNABAccount> accounts;
    YNABBudgetMetaData budgetMetaData;
    ArrayList<YNABTransaction> transactions;
    ArrayList<YNABPayee> payees;
    ArrayList<YNABMonthlyBudget> monthlyBudgets;

    public YNABBudget() {
    }

    @Override
    public String toString() {
        return String.format("<YNABBudget(%d)>", monthlyBudgets.size());
    }
}
