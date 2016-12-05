package com.sf.lottery.service;

import com.sf.lottery.common.model.Award;

import java.util.List;
import java.util.Set;

/**
 * @author wujiang
 * @version 1.0.0.
 * @date 2016/12/4
 */
public interface AwardService {
    /**
     * 添加奖项
     * @param award
     * @return
     */
    boolean addAward(Award award) throws Exception;

    /**
     * 删除奖项
     * @param awardId
     * @return
     */
    boolean deleteAwardByAwardId(Integer awardId) throws Exception;

    /**
     * 获取奖项
     * @param awardId
     * @return
     */
    Award getAward(Integer awardId) throws Exception;

    /**
     * 更新奖项
     * @param award
     * @return
     */
    boolean updateAward(Award award) throws Exception;

    /**
     * 得到某个分类下的所有奖项
     * @param awKind
     * @return
     * @throws Exception
     */
    List<Award> getAwardByKind(String awKind) throws Exception;

    /**
     * 得到所有奖项分类
     * @return
     * @throws Exception
     */
    Set<String> getAllAwKinds() throws Exception;
}
