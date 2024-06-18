package com.dtcc.recon.repository;

import com.dtcc.recon.entity.ClientProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientPropertiesRepo extends JpaRepository<ClientProperties,Long> {
//    List<ClientProperties> findByUserId(String userName);

//    @Query("SELECT c FROM ClientProperties c WHERE c.userName = :userName AND c.brokerFirm = :brokerFirm")
//    List<ClientProperties> findByUserNameAndBrokerFirm(@Param("userName") String userName, @Param("brokerFirm") String brokerFirm);



}
