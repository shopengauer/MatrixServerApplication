package org.pavlov.matrixserver.repository.jpa;

import org.pavlov.matrixserver.domain.tech.DeviceObject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Василий on 26.04.2015.
 */
public interface DeviceObjectRepository extends JpaRepository<DeviceObject,Long> {

}
