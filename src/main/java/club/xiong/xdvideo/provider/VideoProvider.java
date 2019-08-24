/**
 * FileName: VideoProvider
 * Author:   26917
 * Date:     2019/8/24 16:18
 * Description:
 * History:
 */
package club.xiong.xdvideo.provider;

import club.xiong.xdvideo.domain.Video;
import org.apache.ibatis.jdbc.SQL;

/**
 * 〈一句话功能简述〉<br>
 * 〈video构建动态sql语句〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
public class VideoProvider {

    /**
     * 更新video动态语句
     *
     * @param video
     * @return java.lang.String
     * @author 26917
     * @date 2019/8/24 17:18
     */
    public String updateVideo(final Video video){
        return new SQL(){{

            UPDATE("video");

            //条件写法.
            if(video.getTitle()!=null){
                SET("title=#{title}");
            }
            if(video.getSummary()!=null){
                SET("summary=#{summary}");
            }
            if(video.getCoverImg()!=null){
                SET("cover_img=#{coverImg}");
            }
            if(video.getViewNum()!=null){
                SET("view_num=#{viewNum}");
            }
            if(video.getPrice()!=null){
                SET("price=#{price}");
            }
            if(video.getOnline()!=null){
                SET("online=#{online}");
            }
            if(video.getPoint()!=null){
                SET("point=#{point}");
            }

            WHERE("id=#{id}");

        }}.toString();
    }

}
