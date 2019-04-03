package ac.cn.saya.service.provider1;
/**
 * Created by Administrator on 2019/4/2 0002.
 */

import ac.cn.saya.entity.OrderEntity;

/**
 * 订单接口
 * @Title: IOderService
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/2 0002 17:48
 * @Description:
 */

public interface IOderService {

    /**
     * @描述 创建订单
     * @参数  [entity]
     * @返回值  java.lang.Integer
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/4/3 0003
     * @修改人和其它信息
     */
    public Integer insert(OrderEntity entity);
}
