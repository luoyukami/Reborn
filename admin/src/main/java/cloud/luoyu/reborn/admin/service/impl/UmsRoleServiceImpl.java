package cloud.luoyu.reborn.admin.service.impl;

import cloud.luoyu.reborn.admin.service.UmsAdminCacheService;
import cloud.luoyu.reborn.admin.service.UmsRoleService;
import cloud.luoyu.reborn.mbg.dao.UmsRoleMapper;
import cloud.luoyu.reborn.mbg.model.UmsPermission;
import cloud.luoyu.reborn.mbg.model.UmsRole;
import cloud.luoyu.reborn.mbg.model.UmsRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by luoyu on 2020/06/01 14:09
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {

    @Autowired
    private UmsRoleMapper umsRoleMapper;
    @Autowired
    private UmsAdminCacheService umsAdminCacheService;

    @Override
    public int create(UmsRole role) {
        role.setCreateTime(new Date());
        role.setAdminCount(0);
        role.setSort(0);
        return umsRoleMapper.insert(role);
    }

    @Override
    public int update(Long id, UmsRole role) {
        role.setId(id);
        return umsRoleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int delete(List<Long> ids) {
        UmsRoleExample example = new UmsRoleExample();
        example.createCriteria().andIdIn(ids);
        int count = umsRoleMapper.deleteByExample(example);
        umsAdminCacheService.delResourceListByRoleIds(ids);
        return count;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long roleId) {
        return null;
    }

    @Override
    public int updatePermission(Long roleId, List<Long> permissionIds) {
        return 0;
    }

    @Override
    public List<UmsRole> list() {
        return null;
    }

    @Override
    public List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }
}
