package com.example.demo.connection;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class RoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Boolean determineCurrentLookupKey() {
        return TransactionSynchronizationManager.isCurrentTransactionReadOnly();
    }
}
