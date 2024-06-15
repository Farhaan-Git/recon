    package com.dtcc.recon.repository;
    
    import com.dtcc.recon.entity.BrokerRecord;
    import org.springframework.data.jpa.repository.JpaRepository;
    
    public interface BrokerRecordRepo extends JpaRepository<BrokerRecord,Long> {
    
    }
