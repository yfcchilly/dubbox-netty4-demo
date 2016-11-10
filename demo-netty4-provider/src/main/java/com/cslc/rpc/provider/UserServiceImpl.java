package com.cslc.rpc.provider;

import org.springframework.stereotype.Service;

/**
 * Created by fanchao on 2016/10/27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    public String sayHello(String nick) {
        return "hello:" + nick;
    }
}
