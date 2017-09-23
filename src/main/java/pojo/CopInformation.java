package pojo;

import java.util.Date;

public class CopInformation {
    private Integer copId;

    private String copName;

    private Byte copNumber;

    private Byte copActivity;

    private String copIntroduce;

    private String copImage;

    private Date createTime;

    private Date updateTime;

    public CopInformation(Integer copId, String copName, Byte copNumber, Byte copActivity, String copIntroduce, String copImage, Date createTime, Date updateTime) {
        this.copId = copId;
        this.copName = copName;
        this.copNumber = copNumber;
        this.copActivity = copActivity;
        this.copIntroduce = copIntroduce;
        this.copImage = copImage;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public CopInformation() {
        super();
    }

    public Integer getCopId() {
        return copId;
    }

    public void setCopId(Integer copId) {
        this.copId = copId;
    }

    public String getCopName() {
        return copName;
    }

    public void setCopName(String copName) {
        this.copName = copName == null ? null : copName.trim();
    }

    public Byte getCopNumber() {
        return copNumber;
    }

    public void setCopNumber(Byte copNumber) {
        this.copNumber = copNumber;
    }

    public Byte getCopActivity() {
        return copActivity;
    }

    public void setCopActivity(Byte copActivity) {
        this.copActivity = copActivity;
    }

    public String getCopIntroduce() {
        return copIntroduce;
    }

    public void setCopIntroduce(String copIntroduce) {
        this.copIntroduce = copIntroduce == null ? null : copIntroduce.trim();
    }

    public String getCopImage() {
        return copImage;
    }

    public void setCopImage(String copImage) {
        this.copImage = copImage == null ? null : copImage.trim();
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