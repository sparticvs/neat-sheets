package com.popebp.neatsheets.compat.ynab;

/**
 * Created by charles on 3/10/18.
 */
public class YNABMonthlyCategoryBudget extends YNABEntity {

    String categoryId;
    Number budgeted;
    YNABOverspendMethod overspendingHandling;
    String parentMonthlyBudgetId;

    public YNABMonthlyCategoryBudget() {
        this.entityType = YNABEntityType.monthlyCategoryBudget;
    }

    @Override
    public String toString() {
        return String.format("<YNABMonthlyCategoryBudget(%s : %f)>", categoryId, budgeted.floatValue());
    }
}
