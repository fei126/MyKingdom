package io.imking.biz.mapping;

import io.imking.biz.domain.CustBusiness;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CustBusinessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_business
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    @Delete({
        "delete from tc_cust_business",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_business
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    @Insert({
        "insert into tc_cust_business (id, cust_id, ",
        "biz_id)",
        "values (#{id,jdbcType=BIGINT}, #{custId,jdbcType=BIGINT}, ",
        "#{bizId,jdbcType=BIGINT})"
    })
    int insert(CustBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_business
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    @InsertProvider(type=CustBusinessSqlProvider.class, method="insertSelective")
    int insertSelective(CustBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_business
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    @Select({
        "select",
        "id, cust_id, biz_id",
        "from tc_cust_business",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="cust_id", property="custId", jdbcType=JdbcType.BIGINT),
        @Result(column="biz_id", property="bizId", jdbcType=JdbcType.BIGINT)
    })
    CustBusiness selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_business
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    @UpdateProvider(type=CustBusinessSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CustBusiness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_business
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    @Update({
        "update tc_cust_business",
        "set cust_id = #{custId,jdbcType=BIGINT},",
          "biz_id = #{bizId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CustBusiness record);
}