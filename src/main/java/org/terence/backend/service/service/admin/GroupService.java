package org.terence.backend.service.service.admin;

import org.terence.backend.dao.entity.admin.Group;

/**
 * @author terence
 * @since 2019/4/4 9:21
 */
public interface GroupService {

    Group getGroupById(long l);

    Group getGroupByUserId(long parseLong);
}
