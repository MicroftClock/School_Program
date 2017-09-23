package dao;

import pojo.Use;

public interface UseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Use record);

    int insertSelective(Use record);

    Use selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Use record);

    int updateByPrimaryKey(Use record);
}