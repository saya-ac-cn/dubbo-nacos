package ac.cn.saya.service.provider2;/**
 * Created by Administrator on 2019/4/3 0003.
 */

import ac.cn.saya.entity.StorageEntity;

/**
 * 库存接口服务
 * @Title: IStorageService
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 14:20
 * @Description:
 */

public interface IStorageService {

    /**
     * @描述 修改库存信息
     * @参数
     * @返回值
     * @创建人  saya.ac.cn-刘能凯
     * @创建时间  2019/4/3 0003
     * @修改人和其它信息
     */
    public Integer update(StorageEntity entity);

}
