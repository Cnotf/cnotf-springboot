package com.gwq.cnotf.repository.ds2;

import com.gwq.cnotf.entity.ds2.VueCustomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 14:12 2019/06/14
 */
@Repository
public interface VueMailRepository extends JpaRepository<VueCustomEntity, Long> {

    @Query(value = "SELECT * FROM VUE_CUSTOM", nativeQuery = true)
    List<VueCustomEntity> getCustomes();


    @Query(value = "SELECT * FROM VUE_CUSTOM WHERE ID = ?", nativeQuery = true)
    List<VueCustomEntity> getCustomesbyid(Long id);
    /**
     * 可以根据表字段自定义查询 如下 根据 customEnglishName 字段来查询
     * @param customEnglishName
     * @return
     */
    List<VueCustomEntity> findByCustomEnglishNameAndDeleteFlagLike(String customEnglishName, String deleteFlag);

}
