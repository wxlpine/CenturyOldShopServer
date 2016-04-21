/***********************************************************************
 * Module:  AppUserDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class AppUser
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.AppUser;
import com.centuryOldShop.server.persistence.AppUserPK;
import com.centuryOldShop.server.persistence.dao.AppUserDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of AppUserDao interface
 */
public class AppUserDaoImpl extends HibernateDaoImpl implements AppUserDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#save(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public Serializable save(AppUser appUserObject) throws DaoException {
        return super.save(appUserObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#load(com.centuryOldShop.server.persistence.AppUserPK)
     */
    @Override
    public AppUser load(AppUserPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"userId"};
        Object[] values = new Object[]{new Long(pk.getUserId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(AppUser.class, cs, null, null, null);
        return (((list != null) && (list.size() > 0)) ? (AppUser) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#delete(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public void delete(AppUser appUserObject) throws DaoException {
        super.delete(appUserObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#update(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public void update(AppUser appUserObject) throws DaoException {
        super.update(appUserObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#saveOrUpdate(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public void saveOrUpdate(AppUser appUserObject) throws DaoException {
        super.saveOrUpdate(appUserObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public List<AppUser> queryByExample(AppUser appUserObject) throws DaoException {
        return super.queryByExample(AppUser.class, appUserObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#getAppUserList()
     */
    @Override
    public List<AppUser> getAppUserList() throws DaoException {
        return super.loadAll(AppUser.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#getAppUserList(int, int)
     */
    @Override
    public List<AppUser> getAppUserList(int firstResult, int maxResult) {
        return super.loadAll(AppUser.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByUserName(java.lang.String)
     */
    @Override
    public List<AppUser> findByUserName(java.lang.String userName) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("userName", userName));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByUserName(java.lang.String, int, int)
     */
    @Override
    public List<AppUser> findByUserName(java.lang.String userName, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("userName", userName));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByEmail(java.lang.String)
     */
    @Override
    public List<AppUser> findByEmail(java.lang.String email) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("email", email));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByEmail(java.lang.String, int, int)
     */
    @Override
    public List<AppUser> findByEmail(java.lang.String email, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("email", email));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByPhoneNumber(java.lang.String)
     */
    @Override
    public List<AppUser> findByPhoneNumber(java.lang.String phoneNumber) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("phoneNumber", phoneNumber));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByPhoneNumber(java.lang.String, int, int)
     */
    @Override
    public List<AppUser> findByPhoneNumber(java.lang.String phoneNumber, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("phoneNumber", phoneNumber));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByUserType(short)
     */
    @Override
    public List<AppUser> findByUserType(short userType) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("userType", new Short(userType)));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByUserType(short, int, int)
     */
    @Override
    public List<AppUser> findByUserType(short userType, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("userType", new Short(userType)));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByHeadPortraitUrl(java.lang.String)
     */
    @Override
    public List<AppUser> findByHeadPortraitUrl(java.lang.String headPortraitUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("headPortraitUrl", headPortraitUrl));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByHeadPortraitUrl(java.lang.String, int, int)
     */
    @Override
    public List<AppUser> findByHeadPortraitUrl(java.lang.String headPortraitUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("headPortraitUrl", headPortraitUrl));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByRegisterTime(java.util.Date)
     */
    @Override
    public List<AppUser> findByRegisterTime(java.util.Date registerTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("registerTime", registerTime));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByRegisterTime(java.util.Date, int, int)
     */
    @Override
    public List<AppUser> findByRegisterTime(java.util.Date registerTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("registerTime", registerTime));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByManagedShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<AppUser> findByManagedShop(com.centuryOldShop.server.persistence.Shop managedShop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("managedShop", managedShop));
        return super.findByCriterions(AppUser.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.AppUserDao#findByManagedShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<AppUser> findByManagedShop(com.centuryOldShop.server.persistence.Shop managedShop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("managedShop", managedShop));
        return super.findByCriterions(AppUser.class, cs, null, firstResult, maxResult);
    }
}