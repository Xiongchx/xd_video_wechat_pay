/**
 * FileName: JwtUtils
 * Author:   26917
 * Date:     2019/8/24 23:33
 * Description:
 * History:
 */
package club.xiong.xdvideo.utils;

import club.xiong.xdvideo.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈JWT工具类〉
 *
 * @author 26917
 * @create 2019/8/24
 * @since 1.0.0
 */
public class JwtUtils {

    public static final String SUBJECT = "xdclass";

    // 过期时间，毫秒单位，设置为一周
    public static final long EXPIRE = 1000 * 60 * 60 * 24 * 7;

    // 密钥
    public static String APPSECRET = "xdcode1234";

    /**
     * 生成JWT
     *
     * @param user
     * @return java.lang.String
     * @author 26917
     * @date 2019/8/25 0:04
     */
    public static String geneJsonWebToken(User user) {

        if (user == null || user.getId() == null || user.getName() == null || user.getHeadImg() == null) {
            return null;
        }

        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id", user.getId())
                .claim("name", user.getName())
                .claim("img", user.getHeadImg())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, APPSECRET).compact();
        return token;
    }

    /**
     * 校验token
     *
     * @param token
     * @return io.jsonwebtoken.Claims
     * @author 26917
     * @date 2019/8/25 0:05
     */
    public static Claims checkJWT(String token) {
        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {

        }
        return null;
    }

}
