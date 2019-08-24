/**
 * FileName: VideoMapper
 * Author:   26917
 * Date:     2019/8/24 13:10
 * Description:
 * History:
 */
package club.xiong.xdvideo.mapper;

import club.xiong.xdvideo.domain.Video;
import org.apache.ibatis.annotations.*;

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

    @Select("SELECT * FROM video WHERE id = #{id}")
    Video findById(int id);

    @Update("UPDATE video SET title=#{title} WHERE id =#{id}")
    int update(Video video);

    @Delete("DELETE FROM video WHERE id =#{id}")
    int delete(int id);

    @Insert("INSERT INTO `video` ( `title`, `summary`, " +
            "`cover_img`, `view_num`, `price`, `create_time`," +
            " `online`, `point`)" +
            "VALUES" +
            "(#{title}, #{summary}, #{coverImg}, #{viewNum}, #{price},#{createTime}" +
            ",#{online},#{point});")
    /*保存对象，获取数据库自增id */
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(Video video);

}