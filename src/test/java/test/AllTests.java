/***********************************************************************
 * Module:  BaseTestCase.java
 * Author:  cmicat
 * Purpose: Defines class that can run Junit test by its main function
 ***********************************************************************/

package test;

import com.centuryOldShop.server.persistence.CommodityTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Class that can run Junit by its main function
 */
public class AllTests {

    /**
     * Get test suite
     *
     * @return test suite containing all unit test selected
     */
    public static Test suite() {

        TestSuite suite = new TestSuite();


        //ok
//        suite.addTest(ShopTest.suite());
//        suite.addTest(ShopStoryTest.suite());
//        suite.addTest(NewsTest.suite());
//        suite.addTest(ShopTypeTest.suite());
//        suite.addTest(ShopAreaTest.suite());
//        suite.addTest(DiscountTypeTest.suite());
//        suite.addTest(CommodityTypeTest.suite());
//        suite.addTest(ShopStoryTypeTest.suite());
//        suite.addTest(OrderStatusTypeTest.suite());
//        suite.addTest(DisputeStatusTypeTest.suite());
//        suite.addTest(DiscountInfoTest.suite());

//        suite.addTest(ShoppingCartTest.suite());
        suite.addTest(CommodityTest.suite());
//        suite.addTest(OrderFormTest.suite());
//        suite.addTest(ShopHistoryTest.suite());
//        suite.addTest(OrderFormCommodityTest.suite());
//        suite.addTest(FavoriteTest.suite());
//        suite.addTest(MessageTest.suite());
//        suite.addTest(SpecialCraftTest.suite());
//        suite.addTest(VideoIntroductionTest.suite());
//        suite.addTest(RateKeywordTest.suite());
//        suite.addTest(AppUserTest.suite());

        return suite;
    }

    /**
     * Main function
     *
     * @param args argument list
     */
    public static void main(String args[]) {
        TestRunner.run(suite());
        System.exit(0);
    }

}