package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by CX Wang on 2017/8/31.
 *
 */
public interface IUserService {
    ServerResponse<User> login(String username , String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str , String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username,String question,String answer);

    ServerResponse<String> forgetRestPassword(String username , String passwordNew , String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld , String passwordNew , User user);

    ServerResponse<User> updateInFormation(User user);

    ServerResponse<User> getInFomation(Integer userId);

    ServerResponse checkAdminRole(User user);
}
