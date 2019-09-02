package bean;

import javax.persistence.*;

@Entity
@Table(name="address_inf")
public class AddressEntity {
    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int addressId;
    @Column(name = "address_Detail")
    private String addressDetail;

    public AddressEntity() {
    }

    public AddressEntity(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }
    public int getAddressId()
    {
        return this.addressId;
    }

    public void setAddressDetail(String addressDetail)
    {
        this.addressDetail = addressDetail;
    }
    public String getAddressDetail()
    {
        return this.addressDetail;
    }
}
