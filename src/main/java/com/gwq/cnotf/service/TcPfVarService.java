package com.gwq.cnotf.service;

import com.gwq.cnotf.entity.ds1.TcPfVarEntity;
import com.gwq.cnotf.repository.ds1.TcPfVarRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 23:27 2019/06/16
 */

@Service
public class TcPfVarService {

    private Log log = LogFactory.getLog(TcPfVarService.class);


    @Autowired
    private TcPfVarRepository tcPfVarRepository;


    public List<TcPfVarEntity> find(){
        log.info("================");
        return tcPfVarRepository.findAll();
    }
    public long findcount(){
        log.info("TcPfVarService================couont");
        return tcPfVarRepository.count();
    }
}
