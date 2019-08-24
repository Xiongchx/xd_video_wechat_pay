/**
 * FileName: VideoServiceImpl
 * Author:   26917
 * Date:     2019/8/24 11:37
 * Description:
 * History:
 */
package club.xiong.xdvideo.service.impl;

import club.xiong.xdvideo.domain.Video;
import club.xiong.xdvideo.mapper.VideoMapper;
import club.xiong.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Resource
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public Video findById(int id) {
        return videoMapper.findById(id);
    }

    @Override
    public int update(Video video) {
        return videoMapper.update(video);
    }

    @Override
    public int delete(int id) {
        return videoMapper.delete(id);
    }

    @Override
    public int save(Video video) {
        int rows = videoMapper.save(video);
        System.out.println("保存对象的id:" + video.getId());
        return rows;
    }
}
