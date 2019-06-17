package com.gwq.cnotf.repository.ds1;

import com.gwq.cnotf.entity.ds1.TcPfVarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 23:27 2019/06/16
 */
@Repository
public interface TcPfVarRepository extends JpaRepository<TcPfVarEntity, Integer> {

}
