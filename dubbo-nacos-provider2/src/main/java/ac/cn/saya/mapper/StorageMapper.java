package ac.cn.saya.mapper;/**
 * Created by Administrator on 2019/4/3 0003.
 */

import ac.cn.saya.entity.StorageEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 库存dao
 * @Title: StorageMapper
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 16:18
 * @Description:
 */
@Mapper
@Repository("storageMapper")
public interface StorageMapper {

    /**
     * @描述 修改库存
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/4/3 0003
     * @修改人和其它信息
     */
    public Integer update(StorageEntity entity);

}
