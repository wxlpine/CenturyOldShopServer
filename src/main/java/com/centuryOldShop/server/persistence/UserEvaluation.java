/***********************************************************************
 * Module:  UserEvaluation.java
 * Author:  cmicat
 * Purpose: Defines the Class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid c52fab3d-a8af-451b-a445-d276ae726ce7
 */
public class UserEvaluation implements java.io.Serializable {
    /**
     * @pdOid a2f095fc-2cf5-49de-8640-81e479488bec
     */
    private double grade;
    /**
     * @pdOid 29b75d16-5fa5-468b-9365-c401bd706559
     */
    private java.lang.String comment;
    /**
     * @pdOid bab595fb-5434-47fa-b167-c83766b30363
     */
    private java.util.Date time;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=userEvaluation mult=1..1 side=A
     */
    private Commodity commodity;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=userEvaluation mult=1..1 side=A
     */
    private OrderForm orderForm;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userEvaluation mult=1..1 side=A
     */
    private AppUser appUser;

    /**
     * Get value of grade
     *
     * @return grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Set value of grade
     *
     * @param newGrade
     */
    public void setGrade(double newGrade) {
        this.grade = newGrade;
    }

    /**
     * Get value of comment
     *
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }

    /**
     * Set value of comment
     *
     * @param newComment
     */
    public void setComment(java.lang.String newComment) {
        this.comment = newComment;
    }

    /**
     * Get value of time
     *
     * @return time
     */
    public java.util.Date getTime() {
        return time;
    }

    /**
     * Set value of time
     *
     * @param newTime
     */
    public void setTime(java.util.Date newTime) {
        this.time = newTime;
    }

    /**
     * Get value of userEvaluationPK.
     *
     * @return userEvaluationPK object
     */
    public UserEvaluationPK getUserEvaluationPK() {
        return new UserEvaluationPK(commodity, orderForm, appUser);
    }

    /**
     * Set value of userEvaluationPK.
     *
     * @param pk
     */
    public void setUserEvaluationPK(UserEvaluationPK pk) {
        if (pk != null) {

            this.commodity = pk.getCommodity();
            this.orderForm = pk.getOrderForm();
            this.appUser = pk.getAppUser();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof UserEvaluation))
            return false;

        UserEvaluation cast = (UserEvaluation) other;

        if (Double.doubleToLongBits(this.grade) != Double.doubleToLongBits(cast.getGrade()))
            return false;

        if (this.comment == null ? cast.getComment() != this.comment : !this.comment.equals(cast.getComment()))
            return false;

        if (this.time == null ? cast.getTime() != this.time : !(com.sybase.orm.util.Util.compareDate(this.time, cast.getTime(), java.util.Calendar.SECOND) == 0))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Double(grade)).hashCode();
        if (this.comment != null)
            hashCode = 29 * hashCode + comment.hashCode();
        if (this.time != null)
            hashCode = 29 * hashCode + time.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.UserEvaluation: ");
        ret.append("grade='" + grade + "'");
        ret.append("comment='" + comment + "'");
        ret.append("time='" + time + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default parent getter
     */
    public Commodity getCommodity() {
        return commodity;
    }

    /**
     * @param newCommodity
     * @pdGenerated default parent setter
     */
    public void setCommodity(Commodity newCommodity) {
        if (this.commodity == null || !this.commodity.equals(newCommodity)) {
            if (this.commodity != null) {
                Commodity oldCommodity = this.commodity;
                this.commodity = null;
                //oldCommodity.removeUserEvaluation(this);
            }
            if (newCommodity != null) {
                this.commodity = newCommodity;
                //this.commodity.addUserEvaluation(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public OrderForm getOrderForm() {
        return orderForm;
    }

    /**
     * @param newOrderForm
     * @pdGenerated default parent setter
     */
    public void setOrderForm(OrderForm newOrderForm) {
        if (this.orderForm == null || !this.orderForm.equals(newOrderForm)) {
            if (this.orderForm != null) {
                OrderForm oldOrderForm = this.orderForm;
                this.orderForm = null;
                //oldOrderForm.removeUserEvaluation(this);
            }
            if (newOrderForm != null) {
                this.orderForm = newOrderForm;
                //this.orderForm.addUserEvaluation(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public AppUser getAppUser() {
        return appUser;
    }

    /**
     * @param newAppUser
     * @pdGenerated default parent setter
     */
    public void setAppUser(AppUser newAppUser) {
        if (this.appUser == null || !this.appUser.equals(newAppUser)) {
            if (this.appUser != null) {
                AppUser oldAppUser = this.appUser;
                this.appUser = null;
                //oldAppUser.removeUserEvaluation(this);
            }
            if (newAppUser != null) {
                this.appUser = newAppUser;
                //this.appUser.addUserEvaluation(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public UserEvaluation() {

    }

}