/***********************************************************************
 * Module:  UserEvaluation.java
 * Author:  cmicat
 * Purpose: Defines the Class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid c52fab3d-a8af-451b-a445-d276ae726ce7
 * 这个类没有对应的单元测试
 */
public class UserEvaluation implements java.io.Serializable {

    private UserEvaluationPK userEvaluationPK;
    /**
     * @pdOid a2f095fc-2cf5-49de-8640-81e479488bec
     */
    private double grade;
    /**
     * @pdOid 29b75d16-5fa5-468b-9365-c401bd706559
     */
    private String comment;
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


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public UserEvaluation() {

    }

    //</editor-fold>


    //<editor-fold name="accessor">


    public UserEvaluationPK getUserEvaluationPK() {
        return userEvaluationPK;
    }

    public UserEvaluation setUserEvaluationPK(UserEvaluationPK userEvaluationPK) {
        this.userEvaluationPK = userEvaluationPK;
        return this;
    }

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
    public String getComment() {
        return comment;
    }

    /**
     * Set value of comment
     *
     * @param newComment
     */
    public void setComment(String newComment) {
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

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "UserEvaluation{" +
                "grade=" + grade +
                ", comment='" + comment + '\'' +
                ", time=" + time +
                ", commodity=" + commodity +
                ", orderForm=" + orderForm +
                ", appUser=" + appUser +
                '}';
    }


    //</editor-fold>


}