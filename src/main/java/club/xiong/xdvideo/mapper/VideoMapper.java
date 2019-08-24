/**
 * FileName: VideoMapper
 * Author:   26917
 * Date:     2019/8/24 13:10
 * Description:
 * History:
 */
package club.xiong.xdvideo.mapper;

import club.xiong.xdvideo.domain.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈video数据访问层〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
@Mapper
public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();
}