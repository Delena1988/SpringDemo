package com.lanniuh;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by linjian
 * 16/8/11.
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
