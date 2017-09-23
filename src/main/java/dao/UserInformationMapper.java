package dao;

import pojo.UserInformation;

public interface UserInformationMapper {
    int deleteByPrimaryKey(String username);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    UserInformation selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);
}