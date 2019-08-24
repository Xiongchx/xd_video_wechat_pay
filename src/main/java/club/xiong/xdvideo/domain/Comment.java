package club.xiong.xdvideo.domain;


import java.io.Serializable;
/**
 * 评论实体类
 * @author 26917
 * @date 2019/8/24 12:28
 * @param null
 * @return
 */
public class Comment implements Serializable {

  private static final long serialVersionUID = -9078307379042755131L;
  private Integer id;
  private String content; // 内容
  private Integer userId;
  private String headImg; // 用户头像
  private String name; // 昵称
  private double point; // 评分  10分制
  private Integer up; // 点赞数
  private java.util.Date createTime; // 创建时间
  private Integer orderId; // 订单ID
  private Integer videoId; // 视频ID


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPoint() {
    return point;
  }

  public void setPoint(double point) {
    this.point = point;
  }


  public Integer getUp() {
    return up;
  }

  public void setUp(Integer up) {
    this.up = up;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }

}
