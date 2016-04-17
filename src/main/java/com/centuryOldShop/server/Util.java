package com.centuryOldShop.server;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by cmicat on 2016/4/16.
 */
public class Util {

    /*
     * Date range:
     * 1. MS SQL Server  datetime               January 1, 1753, through December 31, 9999
     * 2. MS SQL Server  datetime2              0001-01-01 through 9999-12-31
     * 3. MS SQL Server  date 0001-01-01        through 9999-12-31 (1582-10-15 through 9999-12-31 for Informatica)
     * 4. MS SQL Server  datetimeoffset         0001-01-01 through 9999-12-31
     * 4. MS SQL Server  smalldatetime          1900-01-01 through 2079-06-06
     */
    private static final long beginTime = Timestamp.valueOf("1900-01-01 00:00:00").getTime();
    private static final long endTime = Timestamp.valueOf("2079-06-05 00:00:00").getTime();

    /**
     * Method should generate random number that represents
     * a time between two dates.
     *
     * @return the number of milliseconds since the standard base time known as "the epoch",
     * namely January 1, 1970, 00:00:00 GMT.
     */
    private static long getRandomMillisecondsBetweenTwoDates() {
        long diff = endTime - beginTime + 1;
        return beginTime + (long) (com.sybase.orm.util.Util.getRandom().nextDouble() * diff);
    }

    /**
     * Method should generate random number that represents
     * a time between two dates.
     * @return the number of milliseconds since the standard base time known as "the epoch",
     * namely January 1, 1970, 00:00:00 GMT. precision up to 1 seconds
     */
    private static long getRandomMillisecondsRoundToSecondsBetweenTwoDates(){
        long millis = getRandomMillisecondsBetweenTwoDates();
        return (millis / 1000) * 1000;
    }

    public static Date getRandomDate() {
        return new Date(getRandomMillisecondsRoundToSecondsBetweenTwoDates());
    }
}
