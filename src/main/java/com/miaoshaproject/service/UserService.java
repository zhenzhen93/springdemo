package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /**
     * @param telephone       用户手机号
     * @param encryptPassword 用户加密后的密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telephone, String encryptPassword) throws BusinessException;
}
