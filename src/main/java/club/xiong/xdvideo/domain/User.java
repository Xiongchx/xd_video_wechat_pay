package club.xiong.xdvideo.domain;


import java.io.Serializable;
/**
 * 用户实体类
 * @author 26917
 * @date 2019/8/24 12:28
 * @param null
 * @return
 */
public class User implements Serializable {

  private static final long serialVersionUID = -4060193070530400146L;
  private Integer id;
  private String openid; // 微信openid
  private String name; // 昵称
  private String headImg; // 头像
  private String phone; // 手机号
  private String sign; // 用户签名
  private Integer sex; // 性别   0 -- 女    1 -- 男
  private String city; // 城市
  private java.util.Date createTime; // 创建时间


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


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }


  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }

}
