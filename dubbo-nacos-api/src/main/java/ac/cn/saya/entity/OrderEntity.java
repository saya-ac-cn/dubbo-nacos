package ac.cn.saya.entity;
/**
 * Created by Administrator on 2019/4/3 0003.
 */

import java.io.Serializable;

/**
 * 订单实体
 * @Title: OrderEntity
 * @ProjectName dubbo-nacos
 * @Description: TODO
 * @Author Administrator
 * @Date: 2019/4/3 0003 11:39
 * @Description:
 */

public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 5609247987850480290L;
    /**
     * 订单号
     */
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 单价
     */
    private Double money;

    public OrderEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
