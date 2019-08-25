/**
 * FileName: WechatController
 * Author:   26917
 * Date:     2019/8/25 17:42
 * Description:
 * History:
 */
package club.xiong.xdvideo.controller;

import club.xiong.xdvideo.config.WeChatConfig;
import club.xiong.xdvideo.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 26917
 * @create 2019/8/25
 * @since 1.0.0
 */
@Controller
@RequestMapping("/api/v1/wechat")
public class WechatController {

    @Autowired
    private WeChatConfig weChatConfig;

    /**
     * 拼装微信扫一扫登陆URL
     * @author 26917
     * @date 2019/8/25 17:47
     * @param accessPage
     * @return club.xiong.xdvideo.domain.JsonData
     */
    @GetMapping("login_url")
    @ResponseBody
    public JsonData loginUrl(@RequestParam(value = "access_page",required = true)String accessPage) throws UnsupportedEncodingException {

        String redirectUrl = weChatConfig.getOpenRedirectUrl(); //获取开放平台重定向地址

        String callbackUrl = URLEncoder.encode(redirectUrl,"GBK"); //进行编码

        String qrcodeUrl = String.format(weChatConfig.getOpenQrcodeUrl(),weChatConfig.getOpenAppid(),callbackUrl,accessPage);

        return JsonData.buildSuccess(qrcodeUrl);
    }
}
