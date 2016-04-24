/***********************************************************************
 * Module:  FavoriteDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.AppUser;
import com.centuryOldShop.server.persistence.Favorite;
import com.centuryOldShop.server.persistence.FavoritePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class Favorite
 */
public interface FavoriteDao extends Dao {

    /**
     * Save <Code>Favorite</Code> instance
     *
     * @param favoriteObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(Favorite favoriteObject) throws DaoException;

    /**
     * Load <Code>Favorite</Code> instance by primary key
     *
     * @param pk
     * @return <Code>Favorite</Code> instance
     * @throws DaoException
     */
    public Favorite load(FavoritePK pk) throws DaoException;

    /**
     * Delete <Code>Favorite</Code> instance from persistence store
     *
     * @param favoriteObject
     * @throws DaoException
     */
    public void delete(Favorite favoriteObject) throws DaoException;

    /**
     * Update <Code>Favorite</Code> instance to persistence store
     *
     * @param favoriteObject
     * @throws DaoException
     */
    public void update(Favorite favoriteObject) throws DaoException;

    /**
     * Save or update <Code>Favorite</Code> instance to persistence store
     *
     * @param favoriteObject
     * @throws DaoException
     */
    public void saveOrUpdate(Favorite favoriteObject) throws DaoException;

    /**
     * Get all <Code>Favorite</Code> instances from persistence store
     *
     * @return <Code>Favorite</Code> instance list
     * @throws DaoException
     */
    List<Favorite> getFavoriteList() throws DaoException;

    /**
     * Get all <Code>Favorite</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Favorite</Code> instance list
     * @throws DaoException
     */
    List<Favorite> getFavoriteList(int firstResult, int maxResult);

    /**
     * Query <Code>Favorite</Code> instances by example instance
     *
     * @param favoriteObject example instance
     * @return <Code>Favorite</Code> instance list
     * @throws DaoException
     */
    List<Favorite> queryByExample(Favorite favoriteObject) throws DaoException;

    /**
     * Find <Code>Favorite</Code> instances from persistence store by addTime
     *
     * @param addTime
     * @return <Code>Favorite</Code> instance list
     * @throws DaoException
     */
    List<Favorite> findByAddTime(java.util.Date addTime) throws DaoException;

    /**
     * Find <Code>Favorite</Code> instances in range firstResult, maxResult
     * from persistence store by field addTime
     *
     * @param addTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Favorite</Code> instance list
     * @throws DaoException
     */
    List<Favorite> findByAddTime(java.util.Date addTime, int firstResult, int maxResult) throws DaoException;

    List<Favorite> findByUserOrderByAddTimeDesc(AppUser user) throws DaoException;
}