package com.haulmont.cuba.core.sys.persistence;

/**
 * SequenceSupport implementation for Access Library Db.
 */
// TODO - MS ACCESS doesn't support sequences. So trowing exceptions so far...
// PASS #1 - a stub that throws exceptions
@SuppressWarnings("unused")
public class AccessSequenceSupport implements SequenceSupport {

    @Override
    public String sequenceExistsSql(String sequenceName) {
        // return "select NAME from SYS.SEQUENCES where NAME = '" + sequenceName.toUpperCase() + "'";
        throw new RuntimeException("MS Access doesn't support sequences");
    }

    @Override
    public String createSequenceSql(String sequenceName, long startValue, long increment) {
        // return "create sequence " + sequenceName.toUpperCase()
        //        + " as bigint increment by " + increment + " start with " + startValue + " minvalue 0";
        throw new RuntimeException("MS Access doesn't support sequences");
    }

    @Override
    public String modifySequenceSql(String sequenceName, long startWith) {
        // return "alter sequence " + sequenceName.toUpperCase() + " restart with " + startWith;
        throw new RuntimeException("MS Access doesn't support sequences");
    }

    @Override
    public String deleteSequenceSql(String sequenceName) {
        // return "drop sequence " + sequenceName.toUpperCase();
        throw new RuntimeException("MS Access doesn't support sequences");
    }

    @Override
    public String getNextValueSql(String sequenceName) {
        // return "select next value for " + sequenceName.toUpperCase();
        throw new RuntimeException("MS Access doesn't support sequences");
    }

    @Override
    public String getCurrentValueSql(String sequenceName) {
        // return "select cast(CURRENT_VALUE as bigint) from SYS.SEQUENCES where NAME = '" + sequenceName.toUpperCase() + "'";
        throw new RuntimeException("MS Access doesn't support sequences");
    }
}