package com.endercaster.util.BaseModel;

import com.endercaster.util.BaseModel.impl.ModelInterface;
import com.endercaster.util.HQLBuilder.HQLQuery;

public class Model extends HQLQuery implements ModelInterface{

    /**
     * Get the table name of this model
     * @param prefix table prefix can not be NULL
     * @param suffix table suffix can not be NULL
     * @return the table name
     */
    @Override
    public String tableName(String prefix, String suffix) {
        String tableName=this.getClass().getSimpleName();
        if (prefix.length()>0){
            tableName=prefix+"_"+tableName;
        }
        if (suffix.length()>0){
            return tableName+"_"+suffix;
        }
        return tableName;
    }
}
