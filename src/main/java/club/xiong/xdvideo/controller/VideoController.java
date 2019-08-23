/**
 * FileName: VideoController
 * Author:   26917
 * Date:     2019/8/23 21:07
 * Description: 测试环境类
 * History:
 */
package club.xiong.xdvideo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试环境类〉
 *
 * @author 26917
 * @create 2019/8/23
 * @since 1.0.0
 */
@RestController
public class VideoController {

    @RequestMapping("test")
    public String test() {
        return "hello world!";
    }
}
