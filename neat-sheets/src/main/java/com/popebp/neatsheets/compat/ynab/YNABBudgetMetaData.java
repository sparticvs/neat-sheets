package com.popebp.neatsheets.compat.ynab;

import java.util.Locale;

/**
 * Created by charles on 3/10/18.
 */
public class YNABBudgetMetaData extends YNABEntity {
    String currencyISOSymbol;
    Locale currencyLocale;
    Locale dateLocale;
    YNABBudgetType budgetType;
    String strictBudget;

    public YNABBudgetMetaData() {
        this.entityType = YNABEntityType.budgetMetaData;
    }

    @Override
    public String toString() {
        return String.format("<YNABBudgetMetaData(%s [%s])>", budgetType.toString(), dateLocale.toString());
    }
}
