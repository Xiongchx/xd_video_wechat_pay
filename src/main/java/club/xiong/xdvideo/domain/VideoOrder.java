package club.xiong.xdvideo.domain;

import java.io.Serializable;

/**
 * 订单表
 * @author 26917
 * @date 2019/8/24 12:11
 * @param null
 * @return
 */
public class VideoOrder implements Serializable {

  private static final long serialVersionUID = -5227631361532896641L;
  private Integer id;
  private String openid; // 用户唯一标识
  private String outTradeNo; // 顶你单唯一标识
  private Integer state; // 0 表示未支付，1表示已支付
  private java.util.Date createTime; // 订单生成时间
  private java.util.Date notifyTime; // 支付回调时间
  private Integer totalFee; // 支付金额，单位:分
  private String nickname; // 微信昵称
  private String headImg; // 微信头像
  private Integer videoId; // 视频主键
  private String videoTitle; // 视频名称
  private String videoImg; // 视频图片
  private Integer userId; // 用户ID
  private String ip; // 用户IP地址
  private Integer del; // 0表示未删除，1表示已经删除


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public java.util.Date getNotifyTime() {
    return notifyTime;
  }

  public void setNotifyTime(java.util.Date notifyTime) {
    this.notifyTime = notifyTime;
  }


  public Integer getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Integer totalFee) {
    this.totalFee = totalFee;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public String getVideoImg() {
    return videoImg;
  }

  public void setVideoImg(String videoImg) {
    this.videoImg = videoImg;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public Integer getDel() {
    return del;
  }

  public void setDel(Integer del) {
    this.del = del;
  }

}
