package org.sid.billingservice.entities;

import lombok.Data;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullBill",types = Bill.class)
public interface BillProjection {

    Long getCustomerId();
    Long getId();
    Date getBillDate();



}
