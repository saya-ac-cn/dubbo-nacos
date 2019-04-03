package ac.cn.saya.controllers;
/**
 * Created by Administrator on 2019/4/3 0003.
 */

import ac.cn.saya.entity.OrderEntity;
import ac.cn.saya.entity.StorageEntity;
import ac.cn.saya.service.provider1.IOderService;
import ac.cn.saya.service.provider2.IStorageService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fescar.core.context.RootContext;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单web服务接口
 * @Title: OrderController
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 11:28
 * @Description:
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Reference(version = "${dubbo.consumer.version}")
    private IOderService userService;

    @Reference(version = "${dubbo.consumer.version}")
    private IStorageService storageService;

    private boolean flag;

    /**
     * @描述 创建订单服务
     * @参数  []
     * @返回值  java.lang.String
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/4/3 0003
     * @修改人和其它信息
     */
    @GetMapping(value = "/create")
    @GlobalTransactional(timeoutMills = 300000, name = "dubbo-nacos-consumer")
    public String create(OrderEntity entity){
        System.out.println("开始全局事务，XID = " + RootContext.getXID());
        // 事务测试
        Integer result = 0;
        // 扣减库存
        result += storageService.update(new StorageEntity(entity.getCommodityCode(),entity.getCount()));
        // 创建订单
        result += userService.insert(entity);
        //打开注释测试事务发生异常后，全局回滚功能
        if (!flag) {
            throw new RuntimeException("测试抛异常后，分布式事务回滚！");
        }
        return "影响的行数："+ result;
    }

}
