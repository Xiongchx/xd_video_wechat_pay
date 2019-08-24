/**
 * FileName: VideoController
 * Author:   26917
 * Date:     2019/8/23 21:07
 * Description: 测试环境类
 * History:
 */
package club.xiong.xdvideo.controller;

import club.xiong.xdvideo.domain.Video;
import club.xiong.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试环境类〉
 *
 * @author 26917
 * @create 2019/8/23
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * 分页接口
     *
     * @param page 当前第几页，默认为第一页
     * @param size 每页显示几条数据
     * @return java.lang.Object
     * @author 26917
     * @date 2019/8/24 15:24
     */
    @GetMapping("page")
    public Object pageVideo(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        return videoService.findAll();
    }

    /**
     * 根据ID找视频
     *
     * @param videoId
     * @return java.lang.Object
     * @author 26917
     * @date 2019/8/24 15:27
     */
    @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id", required = true) int videoId) {
        return videoService.findById(videoId);
    }

}
