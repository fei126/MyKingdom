package io.imking.biz.reward.mapping;

import io.imking.biz.reward.domain.RwRewardConfirmDetail;
import io.imking.biz.reward.domain.RwRewardConfirmDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface RwRewardConfirmDetailMapper {
    @SelectProvider(type=RwRewardConfirmDetailSqlProvider.class, method="countByExample")
    long countByExample(RwRewardConfirmDetailExample example);

    @DeleteProvider(type=RwRewardConfirmDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(RwRewardConfirmDetailExample example);

    @Delete({
        "delete from rw_reward_confirm_detail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into rw_reward_confirm_detail (id, rw_ask_id, ",
        "rw_ask_index, from_user_id, ",
        "to_user_id, amount, ",
        "reason, create_time)",
        "values (#{id,jdbcType=INTEGER}, #{rwAskId,jdbcType=INTEGER}, ",
        "#{rwAskIndex,jdbcType=INTEGER}, #{fromUserId,jdbcType=INTEGER}, ",
        "#{toUserId,jdbcType=INTEGER}, #{amount,jdbcType=DECIMAL}, ",
        "#{reason,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(RwRewardConfirmDetail record);

    @InsertProvider(type=RwRewardConfirmDetailSqlProvider.class, method="insertSelective")
    int insertSelective(RwRewardConfirmDetail record);

    @SelectProvider(type=RwRewardConfirmDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rw_ask_id", property="rwAskId", jdbcType=JdbcType.INTEGER),
        @Result(column="rw_ask_index", property="rwAskIndex", jdbcType=JdbcType.INTEGER),
        @Result(column="from_user_id", property="fromUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<RwRewardConfirmDetail> selectByExample(RwRewardConfirmDetailExample example);

    @Select({
        "select",
        "id, rw_ask_id, rw_ask_index, from_user_id, to_user_id, amount, reason, create_time",
        "from rw_reward_confirm_detail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rw_ask_id", property="rwAskId", jdbcType=JdbcType.INTEGER),
        @Result(column="rw_ask_index", property="rwAskIndex", jdbcType=JdbcType.INTEGER),
        @Result(column="from_user_id", property="fromUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    RwRewardConfirmDetail selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RwRewardConfirmDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RwRewardConfirmDetail record, @Param("example") RwRewardConfirmDetailExample example);

    @UpdateProvider(type=RwRewardConfirmDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RwRewardConfirmDetail record, @Param("example") RwRewardConfirmDetailExample example);

    @UpdateProvider(type=RwRewardConfirmDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RwRewardConfirmDetail record);

    @Update({
        "update rw_reward_confirm_detail",
        "set rw_ask_id = #{rwAskId,jdbcType=INTEGER},",
          "rw_ask_index = #{rwAskIndex,jdbcType=INTEGER},",
          "from_user_id = #{fromUserId,jdbcType=INTEGER},",
          "to_user_id = #{toUserId,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "reason = #{reason,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RwRewardConfirmDetail record);
}