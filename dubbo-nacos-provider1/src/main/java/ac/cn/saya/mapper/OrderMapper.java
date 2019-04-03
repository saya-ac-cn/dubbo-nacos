package ac.cn.saya.mapper;
/**
 * Created by Administrator on 2019/4/3 0003.
 */

import ac.cn.saya.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 订单Dao
 * @Title: OrderMapper
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 15:22
 * @Description:
 */
@Mapper
@Repository("orderMapper")
public interface OrderMapper {

    /**
     * @描述 创建订单
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/4/3 0003
     * @修改人和其它信息
     */
    public Integer create(OrderEntity entity);

}
