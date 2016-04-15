package com.centuryOldShop.server.persistence;

import org.hibernate.dialect.SQLServer2012Dialect;

import java.sql.Types;

/**
 * Created by cmicat on 2016/4/15.
 */
public class SQLServerNativeDialect extends SQLServer2012Dialect {

    public SQLServerNativeDialect() {
        super();

        registerColumnType(Types.CLOB, "nvarchar(MAX)");
        registerColumnType(Types.LONGVARCHAR, "nvarchar(MAX)");
        registerColumnType(Types.VARCHAR, "nvarchar(MAX)");
        registerColumnType(Types.VARCHAR, 4000, "nvarchar($l)");
//        registerColumnType( Types.VARCHAR, "nvarchar($l)" );
        registerColumnType(Types.CHAR, "nchar(1)");
        registerColumnType(Types.LONGVARCHAR, "ntext");
        registerColumnType(Types.CLOB, "ntext");
    }
}
