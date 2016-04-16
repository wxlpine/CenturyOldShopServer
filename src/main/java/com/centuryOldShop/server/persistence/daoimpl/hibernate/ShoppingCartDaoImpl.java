/***********************************************************************
 * Module:  ShoppingCartDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShoppingCart
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.ShoppingCart;
import com.centuryOldShop.server.persistence.ShoppingCartPK;
import com.centuryOldShop.server.persistence.dao.ShoppingCartDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShoppingCartDao interface
 */
@SuppressWarnings("ALL")
public class ShoppingCartDaoImpl extends HibernateDaoImpl implements ShoppingCartDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#save(com.centuryOldShop.server.persistence.ShoppingCart)
     */
    public Serializable save(ShoppingCart shoppingCartObject) throws DaoException {
        return super.save(shoppingCartObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#load(com.centuryOldShop.server.persistence.ShoppingCartPK)
     */
    public ShoppingCart load(ShoppingCartPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{};
        Object[] values = new Object[]{};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShoppingCart.class, cs);
        return (((list != null) && (list.size() > 0)) ? (ShoppingCart) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#delete(com.centuryOldShop.server.persistence.ShoppingCart)
     */
    public void delete(ShoppingCart shoppingCartObject) throws DaoException {
        super.delete(shoppingCartObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#update(com.centuryOldShop.server.persistence.ShoppingCart)
     */
    public void update(ShoppingCart shoppingCartObject) throws DaoException {
        super.update(shoppingCartObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShoppingCart)
     */
    public void saveOrUpdate(ShoppingCart shoppingCartObject) throws DaoException {
        super.saveOrUpdate(shoppingCartObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShoppingCart)
     */
    public List queryByExample(ShoppingCart shoppingCartObject) throws DaoException {
        return super.queryByExample(ShoppingCart.class, shoppingCartObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#getShoppingCartList()
     */
    public List getShoppingCartList() throws DaoException {
        return super.loadAll(ShoppingCart.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#getShoppingCartList(int, int)
     */
    public List getShoppingCartList(int firstResult, int maxResult) {
        return super.loadAll(ShoppingCart.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#findByAmount(int)
     */
    public List findByAmount(int amount) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("amount", new Integer(amount)));
        return super.findByCriterions(ShoppingCart.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#findByAmount(int, int, int)
     */
    public List findByAmount(int amount, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("amount", new Integer(amount)));
        return super.findByCriterions(ShoppingCart.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#findByAddedTime(java.util.Date)
     */
    public List findByAddedTime(java.util.Date addedTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(ShoppingCart.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShoppingCartDao#findByAddedTime(java.util.Date, int, int)
     */
    public List findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(ShoppingCart.class, cs, firstResult, maxResult);
    }
}