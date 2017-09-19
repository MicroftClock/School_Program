package ./src/main/java.pojo;

import java.util.Date;

public class UserInformation {
    private Integer userId;

    private String username;

    private Integer sex;

    private String schoolId;

    private String phone;

    private String major;

    private Integer activityId;

    private Integer corporationId;

    private Date createTime;

    private Date updateTime;

    public UserInformation(Integer userId, String username, Integer sex, String schoolId, String phone, String major, Integer activityId, Integer corporationId, Date createTime, Date updateTime) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.schoolId = schoolId;
        this.phone = phone;
        this.major = major;
        this.activityId = activityId;
        this.corporationId = corporationId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserInformation() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
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