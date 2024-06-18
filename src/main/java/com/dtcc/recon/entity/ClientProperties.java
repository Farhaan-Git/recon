package com.dtcc.recon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Client_Properties")
public class ClientProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Client_ID")
    private long userId;

    @Column(name = "Client_Name")
    private String userName;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Broker_Firm")
    private String brokerFirm;

    @Column(name = "Client_image_URL")
    private String image;


}
