/**
 * FileName: VideoAdminController
 * Author:   26917
 * Date:     2019/8/24 16:04
 * Description:
 * History:
 */
package club.xiong.xdvideo.controller.admin;

import club.xiong.xdvideo.domain.Video;
import club.xiong.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {

    @Autowired
    private VideoService videoService;

    /**
     * 根据id删除视频
     *
     * @param videoId
     * @return java.lang.Object
     * @author 26917
     * @date 2019/8/24 15:26
     */
    @DeleteMapping("del_by_id")
    public Object delById(@RequestParam(value = "video_id", required = true) int videoId) {
        return videoService.delete(videoId);
    }

    /**
     * 根据id更新视频
     *
     * @param video
     * @return java.lang.Object
     * @author 26917
     * @date 2019/8/24 15:28
     */
    @PutMapping("update_by_id")
    public Object update(@RequestBody Video video) {
        return videoService.update(video);
    }

    /**
     * 保存视频对象
     *
     * @param video
     * @return java.lang.Object
     * @RequestBody 请求体映射实体类 需要指定http头为 content-type为application/json charset=utf-8
     * @author 26917
     * @date 2019/8/24 15:29
     */
    @PostMapping("save")
    public Object save(@RequestBody Video video) {
        return videoService.save(video);
    }
}
