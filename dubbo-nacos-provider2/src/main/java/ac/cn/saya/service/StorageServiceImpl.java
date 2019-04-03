package ac.cn.saya.service;
/**
 * Created by Administrator on 2019/4/3 0003.
 */

import ac.cn.saya.entity.StorageEntity;
import ac.cn.saya.mapper.StorageMapper;
import ac.cn.saya.service.provider2.IStorageService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.core.context.RootContext;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * 库存服务接口实现
 * @Title: StorageServiceImpl
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 14:22
 * @Description:
 */
@Service(version="${dubbo.provider.version}")
public class StorageServiceImpl implements IStorageService {

    @Resource
    @Qualifier("storageMapper")
    private StorageMapper storageMapper;


    /**
     * @param entity
     * @描述 修改库存信息
     * @参数
     * @返回值
     * @创建人 saya.ac.cn-刘能凯
     * @创建时间 2019/4/3 0003
     * @修改人和其它信息
     */
    @Override
    public Integer update(StorageEntity entity) {
        System.out.println("库存服务全局事务id ：" + RootContext.getXID());
        return storageMapper.update(entity);
//        Connection conn = null;
//        PreparedStatement ptmt = null;
//        try{
//            //获取连接
//            conn = DatabaseUtils.getConnection();
//            //sql
//            String sql = "UPDATE `storage_tbl` SET `count` = `count` - ? WHERE `commodity_code` = ?";
//            //预编译
//            ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行
//
//            //传参
//            ptmt.setInt(1, entity.getCount());
//            ptmt.setString(2, entity.getCommodityCode());
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
