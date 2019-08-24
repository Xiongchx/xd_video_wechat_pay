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

    @GetMapping("page")
    public Object pageVideo() {
        return videoService.findAll();
    }


    @GetMapping("find_by_id")
    public Object findById(int videoId) {
        return videoService.findById(videoId);
    }

    @DeleteMapping("del_by_id")
    public Object delById(int videoId) {
        return videoService.delete(videoId);
    }

    @PutMapping("update_by_id")
    public Object update(int videoId, String title) {
        Video video = new Video();
        video.setId(videoId);
        video.setTitle(title);
        return videoService.update(video);
    }

    @PostMapping("save")
    public Object save(String title) {
        Video video = new Video();
        video.setTitle(title);
        return videoService.save(video);
    }


}
