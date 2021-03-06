/***********************************************************************
 * Module:  DaoException.java
 * Author:  cmicat
 * Purpose: Defines utility class
 ***********************************************************************/

package com.sybase.orm.util;

import java.util.*;

/**
 * Utility class
 */
@SuppressWarnings("ALL")
public class Util {
    //    private static final Random random = new Random(10000000);
    private static final Random random = new Random(System.currentTimeMillis());
//    private static final Random random = new SecureRandom();

    /**
     *
     */
    public Util() {

    }

    /**
     * Compare Date by precision.
     *
     * @param date1
     * @param date2
     * @param precision
     * @return the same meaning as result of Date.compareTo(Date other)
     */
    public static int compareDate(final Date date1, final Date date2, int precision) {
        Calendar c = Calendar.getInstance();

        List fields = new ArrayList();
        fields.add(new Integer(Calendar.YEAR));
        fields.add(new Integer(Calendar.MONTH));
        fields.add(new Integer(Calendar.DAY_OF_MONTH));
        fields.add(new Integer(Calendar.MINUTE));
        fields.add(new Integer(Calendar.SECOND));
        fields.add(new Integer(Calendar.MILLISECOND));

        Date d1 = date1;
        Date d2 = date2;
        if (fields.contains(new Integer(precision))) {
            c.setTime(date1);
            for (int i = 0; i < fields.size(); i++) {
                int field = ((Integer) fields.get(i)).intValue();
                if (field > precision)
                    c.set(field, 0);
            }
            d1 = c.getTime();
            c.setTime(date2);
            for (int i = 0; i < fields.size(); i++) {
                int field = ((Integer) fields.get(i)).intValue();
                if (field > precision)
                    c.set(field, 0);
            }
            d2 = c.getTime();
        }
        return d1.compareTo(d2);
    }

    /**
     * Get global random
     *
     * @return Random
     */
    public static Random getRandom() {
//        return ThreadLocalRandom.current();
        return random;
    }

    /**
     * Test if two collection equals
     *
     * @param collectionA
     * @param collectionB
     * @return
     */
    public static boolean isCollectionsEquals(Collection collectionA,
                                              Collection collectionB) {
        if (collectionA == null && collectionB == null)
            return true;
        if (collectionA == null || collectionB == null)
            return false;
        if (collectionA.size() != collectionB.size()) return false;

        Iterator iteratorA = collectionA.iterator();
        while (iteratorA.hasNext()) {
            Object object = iteratorA.next();
            Iterator iteratorB = collectionB.iterator();
            boolean found = false;
            while (iteratorB.hasNext()) {
                Object another = iteratorB.next();
                if (another.equals(object)) found = true;
            }
            if (!found) break;
        }
        return iteratorA.hasNext() ? false : true;
    }

    /**
     * Test if two arrays equals.
     *
     * @param arrayA
     * @param arrayB
     * @return
     */
    public static boolean isArraysEquals(Object[] arrayA,
                                         Object[] arrayB) {
        if (arrayA == null && arrayB == null)
            return true;
        if (arrayA == null || arrayB == null)
            return false;
        return isCollectionsEquals(Arrays.asList(arrayA), Arrays.asList(arrayB));
    }
}