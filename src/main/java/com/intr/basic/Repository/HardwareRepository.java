package com.intr.basic.Repository;

import com.intr.basic.Model.Hardware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareRepository extends JpaRepository <Hardware, Long> {}
