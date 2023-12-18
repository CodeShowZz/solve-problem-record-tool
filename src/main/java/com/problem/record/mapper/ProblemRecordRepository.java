package com.problem.record.mapper;

import com.problem.record.model.ProblemRecord;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-18 16:56
 */
public interface ProblemRecordRepository extends CrudRepository<ProblemRecord,Long> {
}