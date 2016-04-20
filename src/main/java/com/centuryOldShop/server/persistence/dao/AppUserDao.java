/***********************************************************************
 * Module:  AppUserDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class AppUser
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.AppUser;
import com.centuryOldShop.server.persistence.AppUserPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class AppUser
 */
public interface AppUserDao extends Dao {

    /**
     * Save <Code>AppUser</Code> instance
     *
     * @param appUserObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(AppUser appUserObject) throws DaoException;

    /**
     * Load <Code>AppUser</Code> instance by primary key
     *
     * @param pk
     * @return <Code>AppUser</Code> instance
     * @throws DaoException
     */
    public AppUser load(AppUserPK pk) throws DaoException;

    /**
     * Delete <Code>AppUser</Code> instance from persistence store
     *
     * @param appUserObject
     * @throws DaoException
     */
    public void delete(AppUser appUserObject) throws DaoException;

    /**
     * Update <Code>AppUser</Code> instance to persistence store
     *
     * @param appUserObject
     * @throws DaoException
     */
    public void update(AppUser appUserObject) throws DaoException;

    /**
     * Save or update <Code>AppUser</Code> instance to persistence store
     *
     * @param appUserObject
     * @throws DaoException
     */
    public void saveOrUpdate(AppUser appUserObject) throws DaoException;

    /**
     * Get all <Code>AppUser</Code> instances from persistence store
     *
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> getAppUserList() throws DaoException;

    /**
     * Get all <Code>AppUser</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> getAppUserList(int firstResult, int maxResult);

    /**
     * Query <Code>AppUser</Code> instances by example instance
     *
     * @param appUserObject example instance
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> queryByExample(AppUser appUserObject) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by userName
     *
     * @param userName
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByUserName(java.lang.String userName) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances in range firstResult, maxResult
     * from persistence store by field userName
     *
     * @param userName
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByUserName(java.lang.String userName, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by email
     *
     * @param email
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByEmail(java.lang.String email) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances in range firstResult, maxResult
     * from persistence store by field email
     *
     * @param email
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByEmail(java.lang.String email, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by phoneNumber
     *
     * @param phoneNumber
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByPhoneNumber(java.lang.String phoneNumber) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances in range firstResult, maxResult
     * from persistence store by field phoneNumber
     *
     * @param phoneNumber
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByPhoneNumber(java.lang.String phoneNumber, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by userType
     *
     * @param userType
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByUserType(short userType) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances in range firstResult, maxResult
     * from persistence store by field userType
     *
     * @param userType
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByUserType(short userType, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by headPortraitUrl
     *
     * @param headPortraitUrl
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByHeadPortraitUrl(java.lang.String headPortraitUrl) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances in range firstResult, maxResult
     * from persistence store by field headPortraitUrl
     *
     * @param headPortraitUrl
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByHeadPortraitUrl(java.lang.String headPortraitUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by registerTime
     *
     * @param registerTime
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByRegisterTime(java.util.Date registerTime) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances in range firstResult, maxResult
     * from persistence store by field registerTime
     *
     * @param registerTime
     * @param firstResult  first result to return
     * @param maxResult    max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByRegisterTime(java.util.Date registerTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances from persistence store by Shop
     *
     * @param managedShop
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByManagedShop(com.centuryOldShop.server.persistence.Shop managedShop) throws DaoException;

    /**
     * Find <Code>AppUser</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param managedShop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>AppUser</Code> instance list
     * @throws DaoException
     */
    List<AppUser> findByManagedShop(com.centuryOldShop.server.persistence.Shop managedShop, int firstResult, int maxResult) throws DaoException;
}