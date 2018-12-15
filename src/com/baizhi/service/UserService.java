package com.baizhi.service;
import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;


@WebService//将此类设置提供功能的类。加在接口上面
@Produces({MediaType.APPLICATION_JSON})//以json的方式传输数据
public interface UserService {

    @GET
    @Path("/login/{username}/{pwd}")//在请求时需要使用的地址。/login/101/123456
    //如果返回值是对象类型，需要在实体类上加@XmlRootElement元素，在以json数据的时候，用对象作为json的key
    String findUserByUserNameAndPwd(@PathParam("username") String userName, @PathParam("pwd") String pwd);//加入注解绑定，可以和形参不一样，只要和上方的地址保持一致即可。

    //查找全部用户
    List<User> findAll();

    //查找分页
    Map findUserByPage(String username, int page, int rows);

    //修改
    void updateById(User user);

    void insertUser(User user);

    void deleteIds(Integer[] ids);
}
