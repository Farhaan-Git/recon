package com.dtcc.recon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "broker_record")
@Entity
public class BrokerRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Trade_ID")
    private long tradeId;

    @Column(name = "Cost")
    private double cost;

    @Column(name = "account_holder_name")
    private String name;


//    @Column(name = "Direction" )
//    private String direction;
//
//
//    @Column(name = "Stock_Ticker")
//    private String stockTicker;
//
//
//    @Column(name = "Trade_Date")
//    private String tradeDate;
//
//
//    @Column(name = "Value_Date")
//    private String valueDate;
//
//    @Column(name = "Share_Quantity")
//    private int shareQuantity;
//
//    @Column(name = "Cost_of_Shares")
//    private long costOfShares;
//
//    @Column(name = "Customer_Demat_No")
//    private long customerDematNo;


}
