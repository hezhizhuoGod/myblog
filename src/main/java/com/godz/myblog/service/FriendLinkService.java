package com.godz.myblog.service;

import com.godz.myblog.entity.FriendLink;

import java.util.List;

/**
 * @author :Godz
 * @description :友链业务层接口
 * @date: 2021-02-17 17:07
 **/
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink();

    //友链新增
    int saveFriendLink(FriendLink friendLink);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Long id);

}
