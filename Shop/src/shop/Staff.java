/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "staff", catalog = "shopace", schema = "")
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findById", query = "SELECT s FROM Staff s WHERE s.id = :id")
    , @NamedQuery(name = "Staff.findByProductName", query = "SELECT s FROM Staff s WHERE s.productName = :productName")
    , @NamedQuery(name = "Staff.findByProductPrice", query = "SELECT s FROM Staff s WHERE s.productPrice = :productPrice")
    , @NamedQuery(name = "Staff.findByProductQuantity", query = "SELECT s FROM Staff s WHERE s.productQuantity = :productQuantity")
    , @NamedQuery(name = "Staff.findByTotal", query = "SELECT s FROM Staff s WHERE s.total = :total")
    , @NamedQuery(name = "Staff.findByCurrency", query = "SELECT s FROM Staff s WHERE s.currency = :currency")
    , @NamedQuery(name = "Staff.findByPurchaseDate", query = "SELECT s FROM Staff s WHERE s.purchaseDate = :purchaseDate")})
public class Staff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private Integer productPrice;
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @Column(name = "total")
    private Integer total;
    @Column(name = "currency")
    private String currency;
    @Column(name = "purchase_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;

    public Staff() {
    }

    public Staff(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        String oldProductName = this.productName;
        this.productName = productName;
        changeSupport.firePropertyChange("productName", oldProductName, productName);
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        Integer oldProductPrice = this.productPrice;
        this.productPrice = productPrice;
        changeSupport.firePropertyChange("productPrice", oldProductPrice, productPrice);
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        Integer oldProductQuantity = this.productQuantity;
        this.productQuantity = productQuantity;
        changeSupport.firePropertyChange("productQuantity", oldProductQuantity, productQuantity);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        Integer oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        String oldCurrency = this.currency;
        this.currency = currency;
        changeSupport.firePropertyChange("currency", oldCurrency, currency);
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        Date oldPurchaseDate = this.purchaseDate;
        this.purchaseDate = purchaseDate;
        changeSupport.firePropertyChange("purchaseDate", oldPurchaseDate, purchaseDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shop.Staff[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
