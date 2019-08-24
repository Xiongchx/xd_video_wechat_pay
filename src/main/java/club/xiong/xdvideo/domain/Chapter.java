package club.xiong.xdvideo.domain;


import java.io.Serializable;
/**
 * 章实体类
 * @author 26917
 * @date 2019/8/24 12:28
 * @param null
 * @return
 */
public class Chapter implements Serializable {

  private static final long serialVersionUID = -8041714537713509502L;
  private Integer id;
  private Integer videoId;  // 视频主键
  private String title;  // 章节名称
  private Integer ordered; // 章节顺序
  private java.util.Date createTime; // 创建时间


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getOrdered() {
    return ordered;
  }

  public void setOrdered(Integer ordered) {
    this.ordered = ordered;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }

}
