package dao;

import pojo.CopInformation;

public interface CopInformationMapper {
    int deleteByPrimaryKey(Integer copId);

    int insert(CopInformation record);

    int insertSelective(CopInformation record);

    CopInformation selectByPrimaryKey(Integer copId);

    int updateByPrimaryKeySelective(CopInformation record);

    int updateByPrimaryKey(CopInformation record);
}