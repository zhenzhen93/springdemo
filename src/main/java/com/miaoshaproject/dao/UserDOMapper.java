package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserDO;

/**
 * 映射到UserDOMapper.xml中
 * 查询sql语句
 */
public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Apr 08 20:48:16 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Apr 08 20:48:16 CST 2019
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Apr 08 20:48:16 CST 2019
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Apr 08 20:48:16 CST 2019
     */
    UserDO selectByPrimaryKey(Integer id);

    UserDO selectByTelephone(String telephone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Apr 08 20:48:16 CST 2019
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Mon Apr 08 20:48:16 CST 2019
     */
    int updateByPrimaryKey(UserDO record);
}