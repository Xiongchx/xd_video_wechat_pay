/**
 * FileName: CommonTest
 * Author:   26917
 * Date:     2019/8/25 0:12
 * Description:
 * History:
 */
package club.xiong.xdvideo;

import club.xiong.xdvideo.domain.User;
import club.xiong.xdvideo.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 26917
 * @create 2019/8/25
 * @since 1.0.0
 */
public class CommonTest {

    @Test
    public void testGeneJwt() {
        User user = new User();
        user.setId(99);
        user.setHeadImg("www.12345.com");
        user.setName("xdcode");
        String token = JwtUtils.geneJsonWebToken(user);
        System.out.println(token);
    }

    @Test
    public void testCheck() {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ4ZGNsYXNzIiwiaWQiOjk5LCJuYW1lIjoieGRjb2RlIiwiaW1nIjoid3d3LjEyMzQ1LmNvbSIsImlhdCI6MTU2NjY2MzQ4MCwiZXhwIjoxNTY3MjY4MjgwfQ.Sj9yEi6ICzv88Fwq-TmYefCTUXze_kxYF9iUe-vhFGg";
        Claims claims = JwtUtils.checkJWT(token);
        if (claims != null) {
            String name = (String) claims.get("name");
            String img = (String) claims.get("img");
            int id = (Integer) claims.get("id");
            System.out.println(name);
            System.out.println(img);
            System.out.println(id);
        }else{
            System.out.println("非法token");
        }
    }

}
