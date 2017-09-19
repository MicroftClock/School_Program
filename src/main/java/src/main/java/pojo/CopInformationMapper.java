package ./src/main/java.pojo;

import ./src/main/java.pojo.CopInformation;

public interface CopInformationMapper {
    int deleteByPrimaryKey(Integer copId);

    int insert(CopInformation record);

    int insertSelective(CopInformation record);

    CopInformation selectByPrimaryKey(Integer copId);

    int updateByPrimaryKeySelective(CopInformation record);

    int updateByPrimaryKey(CopInformation record);
}