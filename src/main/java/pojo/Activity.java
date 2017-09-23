package pojo;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private Integer categoryId;

    private String activityName;

    private String introduce;

    private String mainImages;

    private String subImages;

    private Integer activityCount;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Activity(Integer activityId, Integer categoryId, String activityName, String introduce, String mainImages, String subImages, Integer activityCount, Integer status, Date createTime, Date updateTime) {
        this.activityId = activityId;
        this.categoryId = categoryId;
        this.activityName = activityName;
        this.introduce = introduce;
        this.mainImages = mainImages;
        this.subImages = subImages;
        this.activityCount = activityCount;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Activity() {
        super();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getMainImages() {
        return mainImages;
    }

    public void setMainImages(String mainImages) {
        this.mainImages = mainImages == null ? null : mainImages.trim();
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages == null ? null : subImages.trim();
    }

    public Integer getActivityCount() {
        return activityCount;
    }

    public void setActivityCount(Integer activityCount) {
        this.activityCount = activityCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}