package ac.cn.saya.service;
/**
 * Created by Administrator on 2019/4/2 0002.
 */

import ac.cn.saya.entity.OrderEntity;
import ac.cn.saya.mapper.OrderMapper;
import ac.cn.saya.service.provider1.IOderService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.core.context.RootContext;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Title: OrderServiceImpl
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/2 0002 17:29
 * @Description:
 */
@Service(version="${dubbo.provider.version}")
public class OrderServiceImpl implements IOderService {

    @Resource
    @Qualifier("orderMapper")
    private OrderMapper orderMapper;

    /**
     * @param entity
     * @描述 创建订单
     * @参数 [entity]
     * @返回值 java.lang.Integer
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/4/3 0003
     * @修改人和其它信息
     */
    @Override
    public Integer insert(OrderEntity entity) {
        System.out.println("订单服务全局事务id ：" + RootContext.getXID());
        return orderMapper.create(entity);
//        Connection conn = null;
//        PreparedStatement ptmt = null;
//        try{
//            //获取连接
//            conn = DatabaseUtils.getConnection();
//            //sql
//            String sql = "INSERT INTO `order_tbl` ( `user_id`, `commodity_code`, `count`, `money`) VALUES(?,?,?,?)";
//            //预编译
//            ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行
//
//            //传参
//            ptmt.setString(1, entity.getUserId());
//            ptmt.setString(2, entity.getCommodityCode());
//            ptmt.setInt(3, entity.getCount());
//            ptmt.setDouble(4, entity.getMoney());
//
//            //执行
//            ptmt.execute();
//            ptmt.close();
//            conn.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return 1;
    }
}
