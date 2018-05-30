package com.example.demo.dao;

import com.example.demo.model.Url;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UrlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table url
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table url
     *
     * @mbggenerated
     */
    int insert(Url record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table url
     *
     * @mbggenerated
     */
    Url selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table url
     *
     * @mbggenerated
     */
    List<Url> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table url
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Url record);
}