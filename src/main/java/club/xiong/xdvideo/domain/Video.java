package club.xiong.xdvideo.domain;


import java.io.Serializable;
/**
 * 视频表
 * @author 26917
 * @date 2019/8/24 12:27
 * @param null
 * @return
 */
public class Video implements Serializable {

  private static final long serialVersionUID = 4592379714164687962L;
  private Integer id;
  private String title; // 视频标题
  private String summary; // 概述
  private String coverImg; // 封面图
  private Integer viewNum; // 观看数
  private Integer price; // 价格,单位：分
  private java.util.Date createTime; // 创建时间
  private Integer online; // 0 未上线  1 上线
  private Double point; // 默认8.7  最高10分


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public Integer getViewNum() {
    return viewNum;
  }

  public void setViewNum(Integer viewNum) {
    this.viewNum = viewNum;
  }


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public Integer getOnline() {
    return online;
  }

  public void setOnline(Integer online) {
    this.online = online;
  }


  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }

}
