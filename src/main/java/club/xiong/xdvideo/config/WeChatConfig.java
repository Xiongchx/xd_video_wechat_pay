/**
 * FileName: WeChatConfig
 * Author:   26917
 * Date:     2019/8/24 12:32
 * Description: 微信配置类
 * History:
 */
package club.xiong.xdvideo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈微信配置类〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
public class WeChatConfig {
    /**
     * 公众号appid
     * @author 26917
     * @date 2019/8/24 12:44
     * @param null
     * @return
     */
    @Value("${wxpay.appid}")
    private String appId;

    /**
     * 公众号密钥
     * @author 26917
     * @date 2019/8/24 12:44
     * @param null
     * @return
     */
    @Value("${wxpay.appsecret}")
    private String appsecret;

    /**
     * 开放平台appid
     * @author 26917
     * @date 2019/8/25 17:36 
     * @param null
     * @return 
     */
    @Value("${wxopen.appid}")
    private String openAppid;

    /**
     * 开放平台appsecret
     * @author 26917
     * @date 2019/8/25 17:36 
     * @param null
     * @return 
     */
    @Value("${wxopen.appsecret}")
    private String openAppsecret;

    /**
     * 开放平台回调url
     * @author 26917
     * @date 2019/8/25 17:37 
     * @param null
     * @return 
     */
    @Value("${wxopen.redirect_url}")
    private String openRedirectUrl;

    /**
     * 开放平台二维码连接
     * @author 26917
     * @date 2019/8/25 17:37 
     * @param null
     * @return 
     */
    private final static String OPEN_QRCODE_URL= "https://open.weixin.qq.com/connect/qrconnect?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_login&state=%s#wechat_redirect";

    public static String getOpenQrcodeUrl() {
        return OPEN_QRCODE_URL;
    }

    public String getOpenAppid() {
        return openAppid;
    }

    public void setOpenAppid(String openAppid) {
        this.openAppid = openAppid;
    }

    public String getOpenAppsecret() {
        return openAppsecret;
    }

    public void setOpenAppsecret(String openAppsecret) {
        this.openAppsecret = openAppsecret;
    }

    public String getOpenRedirectUrl() {
        return openRedirectUrl;
    }

    public void setOpenRedirectUrl(String openRedirectUrl) {
        this.openRedirectUrl = openRedirectUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }
}
