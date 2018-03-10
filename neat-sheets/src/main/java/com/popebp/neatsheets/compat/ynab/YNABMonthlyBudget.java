package com.popebp.neatsheets.compat.ynab;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by charles on 3/10/18.
 */
public class YNABMonthlyBudget extends YNABEntity {

    Date month;
    ArrayList<YNABMonthlyCategoryBudget> monthlySubCategoryBudgets;
    boolean isResolvedConflict;

    public YNABMonthlyBudget() {
        this.entityType = YNABEntityType.monthlyBudget;
    }

    @Override
    public String toString() {
        return String.format("<YNABMonthlyBudget(%tT)>", month);
    }
}
