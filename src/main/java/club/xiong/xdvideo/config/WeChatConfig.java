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
