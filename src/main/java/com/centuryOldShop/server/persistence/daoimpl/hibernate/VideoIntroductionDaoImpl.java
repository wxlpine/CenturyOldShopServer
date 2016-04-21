/***********************************************************************
 * Module:  VideoIntroductionDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class VideoIntroduction
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.VideoIntroduction;
import com.centuryOldShop.server.persistence.VideoIntroductionPK;
import com.centuryOldShop.server.persistence.dao.VideoIntroductionDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of VideoIntroductionDao interface
 */

public class VideoIntroductionDaoImpl extends HibernateDaoImpl implements VideoIntroductionDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#save(com.centuryOldShop.server.persistence.VideoIntroduction)
     */
    @Override
    public Serializable save(VideoIntroduction videoIntroductionObject) throws DaoException {
        return super.save(videoIntroductionObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#load(com.centuryOldShop.server.persistence.VideoIntroductionPK)
     */
    @Override
    public VideoIntroduction load(VideoIntroductionPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"videoIntroductionId"};
        Object[] values = new Object[]{new Long(pk.getVideoIntroductionId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(VideoIntroduction.class, cs);
        return (((list != null) && (list.size() > 0)) ? (VideoIntroduction) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#delete(com.centuryOldShop.server.persistence.VideoIntroduction)
     */
    @Override
    public void delete(VideoIntroduction videoIntroductionObject) throws DaoException {
        super.delete(videoIntroductionObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#update(com.centuryOldShop.server.persistence.VideoIntroduction)
     */
    @Override
    public void update(VideoIntroduction videoIntroductionObject) throws DaoException {
        super.update(videoIntroductionObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#saveOrUpdate(com.centuryOldShop.server.persistence.VideoIntroduction)
     */
    @Override
    public void saveOrUpdate(VideoIntroduction videoIntroductionObject) throws DaoException {
        super.saveOrUpdate(videoIntroductionObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.VideoIntroduction)
     */
    @Override
    public List<VideoIntroduction> queryByExample(VideoIntroduction videoIntroductionObject) throws DaoException {
        return super.queryByExample(VideoIntroduction.class, videoIntroductionObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#getVideoIntroductionList()
     */
    @Override
    public List<VideoIntroduction> getVideoIntroductionList() throws DaoException {
        return super.loadAll(VideoIntroduction.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#getVideoIntroductionList(int, int)
     */
    @Override
    public List<VideoIntroduction> getVideoIntroductionList(int firstResult, int maxResult) {
        return super.loadAll(VideoIntroduction.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByVideoUrl(java.lang.String)
     */
    @Override
    public List<VideoIntroduction> findByVideoUrl(java.lang.String videoUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("videoUrl", videoUrl));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByVideoUrl(java.lang.String, int, int)
     */
    @Override
    public List<VideoIntroduction> findByVideoUrl(java.lang.String videoUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("videoUrl", videoUrl));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByDuration(int)
     */
    @Override
    public List<VideoIntroduction> findByDuration(int duration) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("duration", new Integer(duration)));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByDuration(int, int, int)
     */
    @Override
    public List<VideoIntroduction> findByDuration(int duration, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("duration", new Integer(duration)));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByScreenshotUrl(java.lang.String)
     */
    @Override
    public List<VideoIntroduction> findByScreenshotUrl(java.lang.String screenshotUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("screenshotUrl", screenshotUrl));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByScreenshotUrl(java.lang.String, int, int)
     */
    @Override
    public List<VideoIntroduction> findByScreenshotUrl(java.lang.String screenshotUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("screenshotUrl", screenshotUrl));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByPlayedTimes(int)
     */
    @Override
    public List<VideoIntroduction> findByPlayedTimes(int playedTimes) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("playedTimes", new Integer(playedTimes)));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByPlayedTimes(int, int, int)
     */
    @Override
    public List<VideoIntroduction> findByPlayedTimes(int playedTimes, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("playedTimes", new Integer(playedTimes)));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByRate(double)
     */
    @Override
    public List<VideoIntroduction> findByRate(double rate) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("rate", new Double(rate)));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByRate(double, int, int)
     */
    @Override
    public List<VideoIntroduction> findByRate(double rate, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("rate", new Double(rate)));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByAddedTime(java.util.Date)
     */
    @Override
    public List<VideoIntroduction> findByAddedTime(java.util.Date addedTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByAddedTime(java.util.Date, int, int)
     */
    @Override
    public List<VideoIntroduction> findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<VideoIntroduction> findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(VideoIntroduction.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.VideoIntroductionDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<VideoIntroduction> findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(VideoIntroduction.class, cs, firstResult, maxResult);
    }
}