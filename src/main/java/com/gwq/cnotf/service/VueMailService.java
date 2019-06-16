package com.gwq.cnotf.service;

import com.gwq.cnotf.entity.VueCustomEntity;
import com.gwq.cnotf.repository.VueMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 14:16 2019/06/14
 */
@Service
public class VueMailService {

    @Autowired
    private VueMailRepository vueMailRepository;

    public List<VueCustomEntity> getQueryList() {
        List<VueCustomEntity> customes = vueMailRepository.getCustomes();
        return customes;
    }
    public List<VueCustomEntity> getQueryListById(Long userId) {
        List<VueCustomEntity> customes = vueMailRepository.getCustomesbyid(userId);
        return customes;
    }

    public List<VueCustomEntity> getYuanShenList() {
        List<VueCustomEntity> customes = vueMailRepository.findAll();
        return customes;
    }

    public List<VueCustomEntity> getListById (Long userId) {
        List<Long> longs = new ArrayList<>();
        longs.add(userId);
        List<VueCustomEntity> vueCustomEntityList = vueMailRepository.findAllById(longs);
        return vueCustomEntityList;
    }

    public List<VueCustomEntity> findByCustomEnglishName (String customEnglishName, String deleteFlag) {
        List<VueCustomEntity> vueCustomEntityList = vueMailRepository.findByCustomEnglishNameAndDeleteFlagLike(customEnglishName,deleteFlag);
        return vueCustomEntityList;
    }

}
