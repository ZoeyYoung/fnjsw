package fnjsw.mapper;

import fnjsw.entity.Onechildarchives;
import fnjsw.entity.OnechildarchivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnechildarchivesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int countByExample(OnechildarchivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int deleteByExample(OnechildarchivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int insert(Onechildarchives record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int insertSelective(Onechildarchives record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    List<Onechildarchives> selectByExample(OnechildarchivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    Onechildarchives selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int updateByExampleSelective(@Param("record") Onechildarchives record, @Param("example") OnechildarchivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int updateByExample(@Param("record") Onechildarchives record, @Param("example") OnechildarchivesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int updateByPrimaryKeySelective(Onechildarchives record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table onechildarchives
     *
     * @mbggenerated Thu Oct 09 20:51:43 CST 2014
     */
    int updateByPrimaryKey(Onechildarchives record);
}