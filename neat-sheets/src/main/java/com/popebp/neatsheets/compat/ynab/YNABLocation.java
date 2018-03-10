package com.popebp.neatsheets.compat.ynab;

/**
 * Created by charles on 3/10/18.
 */
public class YNABLocation extends YNABEntity {
    String parentPayeeId;
    float latitude;
    float longitude;

    public YNABLocation() {
        this.entityType = YNABEntityType.location;
    }

    @Override
    public String toString() {
        return String.format("<YNABLocation(%s (%f, %f))>", parentPayeeId, latitude, longitude);
    }
}
