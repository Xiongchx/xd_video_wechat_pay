/**
 * FileName: VideoService
 * Author:   26917
 * Date:     2019/8/24 11:37
 * Description:
 * History:
 */
package club.xiong.xdvideo.service;

import club.xiong.xdvideo.domain.Video;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈视频业务类接口〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
public interface VideoService {

    List<Video> findAll();

    Video findById(int id);

    int update(Video video);

    int delete(int id);

    int save(Video video);

}