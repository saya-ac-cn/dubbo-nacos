package ac.cn.saya.entity;
/**
 * Created by Administrator on 2019/4/3 0003.
 */


import java.io.Serializable;

/**
 * 商品库存实体
 * @Title: StorageEntity
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 11:45
 * @Description:
 */

public class StorageEntity implements Serializable {

    private static final long serialVersionUID = -7168926490812340303L;
    /**
     * 商品编号
     */
    private Integer id;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 商品剩余数量
     */
    private Integer count;

    public StorageEntity() {
    }

    public StorageEntity(String commodityCode, Integer count) {
        this.commodityCode = commodityCode;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
