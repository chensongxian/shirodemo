package com.csx.shirodemo.mapper;

import com.csx.shirodemo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @author: csx
 * @Date: 2018-07-18
 */
public interface UserMapper {
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User findByUsername(@Param("username")String username);
}
