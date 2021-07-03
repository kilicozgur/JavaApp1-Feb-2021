package org.csystem.data.product;

import java.math.BigDecimal;

public class ProductInfo {
    private int m_id;
    private String m_name = "";
    private int m_stock;
    private BigDecimal m_cost = BigDecimal.ZERO;
    private BigDecimal m_price = BigDecimal.ZERO;

    public int getId()
    {
        return m_id;
    }

    public ProductInfo setId(int id)
    {
        m_id = id;

        return this;
    }

    public String getName()
    {
        return m_name;
    }

    public ProductInfo setName(String name)
    {
        m_name = name;

        return this;
    }

    public int getStock()
    {
        return m_stock;
    }

    public ProductInfo setStock(int stock)
    {
        m_stock = stock;

        return this;
    }

    public BigDecimal getCost()
    {
        return m_cost;
    }

    public ProductInfo setCost(BigDecimal cost)
    {
        m_cost = cost;

        return this;
    }

    public BigDecimal getPrice()
    {
        return m_price;
    }

    public ProductInfo setPrice(BigDecimal price)
    {
        m_price = price;

        return this;
    }

    public BigDecimal getTotal()
    {
        return m_price.multiply(m_cost);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof ProductInfo))
            return false;

        var other = (ProductInfo)obj;

        return other.m_id == m_id && other.m_name.equals(m_name);
    }

    @Override
    public String toString()
    {
        return String.format("[%d]%s-%s * %s = %s", m_id, m_name, m_cost, m_price, this.getTotal());
    }
}
